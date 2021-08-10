package com.example.eatherliang.thread;

import org.junit.Test;

public class Exception1 {

     private int i = 0;

    @Test
    public void test1(){
        MyInnerThread myThread = new MyInnerThread();
        myThread.setName("t1");
        myThread.start();
        /*try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //myThread.setDaemon(true);

       /* MyInnerThread2 t2 = new MyInnerThread2();
        t2.start();*/
    }

    class MyInnerThread2 extends Thread{
        @Override
        public void run() {
            try {
               i = 5;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    class MyInnerThread extends Thread{
        @Override
        public void run() {
            try {
                while (true){
                    //i++;
                    //System.out.println(Thread.currentThread().getName()+"线程打印 i = " + (i));
                    System.out.println("1111");
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
