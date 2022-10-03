package net.theevilreaper.bot.api.service;

import net.theevilreaper.bot.api.exception.ThreadInterruptedException;
import org.jetbrains.annotations.NotNull;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/

//TODO: Rework
public abstract class Service implements Runnable, IService, PropertyChangeListener {

    protected final PropertyChangeSupport botStateChange;
    private final String name;
    private final long interval;
    protected final Object lock;
    private Logger logger;
    private boolean ready;
    protected boolean running;
    protected boolean stopping;

    protected Service(PropertyChangeSupport botStateChange, String name, long interval) {
        this.botStateChange = botStateChange;
        this.name = name;
        this.interval = interval;
        this.lock = new Object();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (!evt.getPropertyName().equals("botState")) return;
        this.handleBotStateChange(evt);
    }

    protected void init() {}

    protected abstract void update();

    protected abstract void handleBotStateChange(@NotNull PropertyChangeEvent event);

    protected void onStop() {}

    public void stopService() {
        synchronized (lock) {
            stopping = true;
            lock.notifyAll();
        }
    }

    @Override
    public void run() {
        if (running) return;

        running = true;

        init();

        while (!stopping && !Thread.interrupted()) {
            long now = System.currentTimeMillis();

            try {
                update();
            } catch(Exception | NoSuchMethodError exception) {
                logger.log(Level.SEVERE, "An error occurred whilst calling the update function, terminating service...", exception);
            }

            if (stopping || Thread.interrupted()) {
                break;
            }

            synchronized (lock) {
                try {
                    lock.wait(Math.max(10, interval - (System.currentTimeMillis() - now)));
                } catch (InterruptedException exception) {
                    Thread.currentThread().interrupt();
                    throw new ThreadInterruptedException(exception);
                }
            }
        }

        onStop();

        running = false;
        stopping = false;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(name, service.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean isReady() {
        return ready;
    }

    @Override
    public String getName() {
        return name;
    }
}