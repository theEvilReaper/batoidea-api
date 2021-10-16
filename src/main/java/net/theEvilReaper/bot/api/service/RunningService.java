package net.theEvilReaper.bot.api.service;

import org.jetbrains.annotations.NotNull;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since
 **/

public abstract class RunningService extends StaticService implements Runnable {

    protected final Object lock;

    private boolean running;
    private boolean stopping;

    private long interval;

    public RunningService(@NotNull String name, long interval) {
        super(name);
        this.interval = interval;
        this.lock = new Object();
    }

    protected void init() {}

    public abstract void onStart();

    public abstract void onUpdate();

    public abstract void onStop();

    public void start() {
        if (running) return;
        this.onStart();
    }

    public void stop() {
        if (!running) return;

        synchronized (lock) {
            lock.notifyAll();
            running = false;
            onStop();
        }
    }

    @Override
    public void run() {
        if (running) return;

        running = true;

        init();

        while (!stopping && !Thread.interrupted()) {
            var now = System.currentTimeMillis();
            try {
                this.onUpdate();
            } catch (Exception exception) {
                break;
            }

            if (stopping || Thread.interrupted()) {
                break;
            }

            synchronized (lock) {
                try {
                    lock.wait(Math.max(10, interval - (System.currentTimeMillis() - now)));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        onStop();

        running = false;
        stopping = false;
    }

    public boolean isRunning() {
        return running;
    }

    public boolean isStopping() {
        return stopping;
    }
}
