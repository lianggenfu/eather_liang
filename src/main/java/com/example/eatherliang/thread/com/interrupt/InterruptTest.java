package com.example.eatherliang.thread.com.interrupt;

import org.junit.Test;

import static java.lang.System.exit;

public class InterruptTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread("inner thread 1");
        myThread.start();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
