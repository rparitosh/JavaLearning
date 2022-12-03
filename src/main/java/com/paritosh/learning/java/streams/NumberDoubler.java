package com.paritosh.learning.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class NumberDoubler {

    public static void main(String[] args){

        List<Integer> numbers =Arrays.asList(1,7,2,3,4,5,9);



        Integer sum =
                numbers.stream()
                .filter(x-> x%2 ==1)
                .map( n -> n*2)
                .sorted()
                .max(( o1, o2) -> o2-o1)
                .get();

        System.out.println(sum);

    }
}
