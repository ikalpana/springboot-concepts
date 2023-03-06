package com.oops.threads;

public class ThreadMethodsExample2 extends Thread {

    public static void main(String[] args) {
        ThreadMethodsExample1 thread1 = new ThreadMethodsExample1();
        thread1.start();
        ThreadMethodsExample2 thread2 = new ThreadMethodsExample2();
        thread2.start();
        System.out.println("Revive the second thread" );  // If it is suspended
        thread2.resume( );
    }

    public void run() {
        System.out.println("Start Thread B ....");
        for (int j = 1; j <= 5; j++) {
            System.out.println("From Thread B: j = " + j);
            if (j == 2) {
                suspend();
            }

            if (j == 3) {
                try {
                    System.out.println("Second thread starts running");
                    System.out.println("Second thread is suspended itself ");
                    stop();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.println("... Exit Thread B");
    }
}