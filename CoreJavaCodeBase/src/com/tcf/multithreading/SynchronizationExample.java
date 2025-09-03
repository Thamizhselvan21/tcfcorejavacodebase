package com.tcf.multithreading;

public class SynchronizationExample extends Thread {
    Counter counter;

    SynchronizationExample(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
