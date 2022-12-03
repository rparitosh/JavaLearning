package com.paritosh.learning.java.lambda;

@FunctionalInterface
public interface Adder<T extends Number> {
    T add(T t, T v);
}


class MyAdder{
    public static void main(String args[]){

        Adder<Integer> adder  =( t, v) -> t+v    ;
        System.out.println(adder.add(3,5));
    }
}