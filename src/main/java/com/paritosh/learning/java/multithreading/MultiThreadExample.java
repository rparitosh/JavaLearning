package com.paritosh.learning.java.multithreading;


public class MultiThreadExample {
    public static void main (String[] args) throws Exception{

        Thread t1 = new Thread(() -> {
            for (int i=0;i<5; i++){
                System.out.println("Hi");
                try{Thread.sleep(200);}catch (Exception e){}
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i=0;i<5; i++){
                System.out.println("Hello");
                try{Thread.sleep(200);}catch (Exception e){}
            }
        });

        t1.start();
        try{Thread.sleep(100);}catch (Exception e){}
        t2.start();
        System.out.println("T1 alive before join : " + t1.isAlive());
        System.out.println("T2 alive before join : " + t2.isAlive());

        t1.join();
        t2.join();
        System.out.println("T1 alive after join : " + t1.isAlive());
        System.out.println("T2 alive after join : " + t2.isAlive());

        System.out.println("Bye");
    }

}

