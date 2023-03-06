package com.oops.threads;


class SynchronizedExample extends Thread {

    public static void main(String[] args) {
        SynchronizedExample mathService = new SynchronizedExample();
        mathService.getSumOfArray(new int[]{10, 20, 30});
        SynchronizedExample mathService1 = new SynchronizedExample();
        mathService1.getSumOfArray(new int[]{50, 60, 70});
        mathService.start();
        mathService1.start();
    }

    synchronized void getSumOfArray(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            System.out.println(Thread.currentThread().getName()
                    + " adds "
                    + sum + " to "
                    + number + " to get -> "
                    + (sum += number));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
