package com.paritosh.learning.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InfiniteStream {


    public static void main(String args[]){
        List<Integer> numbers = new CopyOnWriteArrayList<>();
        Thread t1 = new Thread(() -> {
           for (int i=0;i<20;i++){
               numbers.add(i);
               System.out.println("number added "+ i);
               try {
                   //Thread.sleep(500);
               }catch (Exception e){
                   System.out.println("Exception in sleep "+e);
               }

           }
        });

        Thread t2 = new Thread(() -> {


            numbers.stream().forEach(
                    x-> {

                        try {
                            Thread.sleep(700);
                            System.out.println("number found : "+ x);
                        }catch (Exception e){
                            System.out.println("Exception in sleep "+e);
                        }
            });
            System.out.println("Done with numbers");
        });

        t1.start();
        t2.start();
    }
}

