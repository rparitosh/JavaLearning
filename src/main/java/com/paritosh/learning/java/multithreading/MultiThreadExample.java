package com.paritosh.learning.java.multithreading;


public class MultiThreadExample {
    public static void main (String[] args){
        Hi hi = new Hi();
        Hello hello = new Hello();

        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);

        t1.start();
        try{Thread.sleep(100);}catch (Exception e){}
        t2.start();
    }

}

class Hi implements Runnable{

    @Override
    public void run () {
        for (int i=0;i<5; i++){
            System.out.println("Hi");
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}

class Hello  implements Runnable{

    @Override
    public void run (){
        for (int i=0;i<5; i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}