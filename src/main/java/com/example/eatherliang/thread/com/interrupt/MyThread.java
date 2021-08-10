package com.example.eatherliang.thread.com.interrupt;

public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            Thread thread = Thread.currentThread();
            if(thread.isInterrupted()){
                System.out.println("done zzzzzzzzzzzz");
            }else{
                thread.interrupted();
            }
            System.out.println("i= " + (i + 1));
        }
    }
}
