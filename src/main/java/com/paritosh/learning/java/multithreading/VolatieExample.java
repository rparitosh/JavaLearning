package com.paritosh.learning.java.multithreading;

public class VolatieExample {

    private static volatile int counter=0;

    public static void main (String args[]) {



        Thread t1 = new Thread(() -> {
            int localCounter = counter;
            while (localCounter<10){
                if (counter!=localCounter){
                    ++localCounter;
                    System.out.println("local counter value increased " + localCounter);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (counter<10){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ++counter;
                System.out.println("counter value incremented  " + counter);
            }
        });

        t1.start();
        t2.start();

    }
}
