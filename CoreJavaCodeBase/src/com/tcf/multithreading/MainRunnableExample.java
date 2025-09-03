package com.tcf.multithreading;

public class MainRunnableExample {
    public static void main(String[] args) {
        RunnableExample runnable = new RunnableExample();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
