package com.paritosh.learning.java.multithreading;


public class MultiThreadExample {
    public static void main (String[] args) throws Exception{

        Thread t1 = new Thread(() -> {
            for (int i=0;i<5; i++){
                System.out.println("Hi");
                /*
                try{Thread.sleep(200);}catch (Exception e){
                    e.printStackTrace();
                }

                 */
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i=0;i<5; i++){
                System.out.println("Hello");
                /*
                try{Thread.sleep(200);}catch (Exception e){
                    e.printStackTrace();
                }

                 */
            }
        });

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

    }

}

