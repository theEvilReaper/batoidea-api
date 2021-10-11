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

    public RunningService(@NotNull String name) {
        super(name);
        this.lock = new Object();
    }

    public abstract void onStart();

    public abstract void onUpdate();

    public abstract void onStop();

    public void stop() {
        if (!running) return;

        synchronized (lock) {
            lock.notifyAll();
            running = false;
            onStop();
        }

    }
}
