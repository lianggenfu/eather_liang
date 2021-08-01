package com.example.eatherliang.devbase;

public class StateCurrTest {

    private static volatile int state = 0;


    public static void main(String[] args) {
        new Thread(()->{
            while (true) {
                if (state == 0) {
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("t1 start");
                    //...
                    System.out.println("t1 finished");
                    state = 1;
                }
            }
        }).start();
        new Thread(()->{
            while (true) {
                if (state == 1) {
                    System.out.println("t2 start");
                    //...
                    System.out.println("t2 finished");
                    state = 2;
                }
            }
        }).start();

        new Thread(()->{
            while (true) {
                if (state == 2) {
                    System.out.println("t3 start");
                    //...
                    System.out.println("t3 finished");
                    state = 0;
                }
            }
        }).start();


    }
}
