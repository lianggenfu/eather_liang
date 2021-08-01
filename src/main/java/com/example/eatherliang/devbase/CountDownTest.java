package com.example.eatherliang.devbase;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownTest {


    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(1);

        int size = 10;

        for (int i = 0; i <size ; i++) {
            new Thread(()->{
                try {
                    countDownLatch.countDown();
                    System.out.println("thread "+ System.currentTimeMillis());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();
    }
}
