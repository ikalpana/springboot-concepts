package com.oops.threads;

public class ThreadMethodsExample1 extends Thread {
    public void run() {
        System.out.println("Start Thread A ....");
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.println("Changing the thread by using the yield method.");
             Thread.yield();
            }
            if(i == 2) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("From Thread A: i = " + i);
        }
        System.out.println("... Exit Thread A");
    }
}