package com.paritosh.learning.java.multithreading;

class Counter{
    Integer count =  Integer.valueOf(0);

    public void increment(){
        count++;
    }
}


public class SyncExample {


    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for  (int i =0 ;i<100000; i++) {
                    synchronized (counter) {
                        counter.increment();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for  (int i =0 ;i<100000; i++) {
                    synchronized (counter) {
                        counter.increment();
                    }
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for  (int i =0 ;i<100000; i++) {
                    synchronized (counter) {
                        counter.increment();
                    }
                }
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for  (int i =0 ;i<100000; i++) {
                    synchronized (counter) {
                        counter.increment();
                    }
                }
            }
        });


        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Counter value : " + counter.count);

    }

}
