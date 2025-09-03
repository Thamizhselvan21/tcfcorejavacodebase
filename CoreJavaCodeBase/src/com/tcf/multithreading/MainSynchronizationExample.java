package com.tcf.multithreading;

public class MainSynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        SynchronizationExample t1 = new SynchronizationExample(counter);
        SynchronizationExample t2 = new SynchronizationExample(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count: " + counter.getCount());
    }
}
