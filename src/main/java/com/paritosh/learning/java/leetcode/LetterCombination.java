package com.paritosh.learning.java.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
//A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombination {

    public static void main(String[] args){
        System.out.println(letterCombinations("23"));

    }

    public static List<String> letterCombinations(String digits) {
        List<String> retList = new ArrayList<>();

        String[] mapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        return getCombo(mapping,digits);

    }

    public static List<String> getCombo(String[] mapping,String digits){

        if (digits.length()==0){
            return new ArrayList<>();
        }

        if (digits.length()>1){
            char[] chars = mapping[Integer.valueOf(digits.substring(0,1))].toCharArray();
            List<String> retList = getCombo(mapping,digits.substring(1));
            List<String> finalRetList = new ArrayList<>();
            for (char c: chars){
                for (String s: retList){
                    finalRetList.add(c+s);
                }
            }
            return finalRetList;

       }else{
            char[] chars = mapping[Integer.valueOf(digits.substring(0,1))].toCharArray();
            List<String> retList = new ArrayList<>();
            for (char c: chars){
                retList.add(String.valueOf(c));
            }
            return retList;
        }

    }


}
