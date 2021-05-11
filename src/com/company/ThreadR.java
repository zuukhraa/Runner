package com.company;

public class ThreadR {
    public void submit(Runnable task) {
        Thread newThread = new Thread(task);
        newThread.start();
        try {
            newThread.join();
            newThread.sleep(1000);

        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
