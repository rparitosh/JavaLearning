package com.paritosh.learning.java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args){
        System.out.println(romanToInt(""));
    }

    public static int romanToInt(String s){

        Map<Character,Integer> valueMap = new HashMap<>();
        valueMap.put('I',1);
        valueMap.put('V',5);
        valueMap.put('X',10);
        valueMap.put('L',50);
        valueMap.put('C',100);
        valueMap.put('D',500);
        valueMap.put('M',1000);

        int sum = 0;
        for (int i=0;i<s.length();i++){
            char posChar = s.charAt(i);
            int value = valueMap.get(posChar);

            if (posChar == 'I' || posChar == 'X' || posChar == 'C'){
                if (i<s.length()-1) {
                    char nextChar = s.charAt(i + 1);
                    int nextValue = valueMap.get(nextChar);
                    if (nextValue>value){
                        value = -value;
                    }

                }
            }
            sum+=value;


        }


        return sum;
    }

}
