package com.example.eatherliang.thread;

public class MyThread extends Thread{

    private int i = 0;

    /*@Override
    public void run() {
        try {
            while (true){
                i++;
                System.out.println(Thread.currentThread().getName()+"线程打印 i = " + (i));
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }*/

    @Override
    public void run() {
        super.run();
    }
}
