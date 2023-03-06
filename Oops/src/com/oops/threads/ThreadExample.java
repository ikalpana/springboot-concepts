package com.oops.threads;

public class ThreadExample extends Thread{

    public void run() {
        System.out.println("Inside the run method of the thread");
        System.out.println("Priority of running thread is : "+Thread.currentThread().getPriority());
    }

    public static void main(String [] args) {
        ThreadExample thread1 = new ThreadExample();
        thread1.start();
       // thread1.start(); // IllegalThreadStateException will be thrown.
        System.out.println("Thread name: "+thread1.getName());

        ThreadExample thread2 = new ThreadExample();
        thread2.start();
        thread2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("First thread priority is : "+thread1.getPriority());
        System.out.println("Second thread priority is : "+thread2.getPriority());
    }
}
