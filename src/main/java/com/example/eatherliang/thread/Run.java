package com.example.eatherliang.thread;

public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setName("t1");
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("程序仅剩守护线程,done");

            MyThread thread2 = new MyThread();
            thread2.setName("t2");
            thread2.setDaemon(true);
            thread2.start();
            thread2.sleep(5000);
            System.out.println("程序仅剩守护线程,done");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
