package com.paritosh.learning.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class GenerateParanthesis {
    public List<String> generateParenthesis(int n) {

        List<String> ret = new ArrayList<>();
        Stack<String> st = new Stack<>();
        String value = "";
        for (int i=0;i<n;i++){

        }
    }

    public List<String> generateParenthesis(int n){
        if (n<=0){
            return new ArrayList<>();
        }
        List<String> retList = new ArrayList<>();
        String gen1 = "";
        String gen2 = "";
        String gen3 = "";
        if (n==1){
            return List.of("()");
        }else{

            List<String> innerStrings = generateParenthesis(n-1);
            for (String s: innerStrings){
                retList.add("("+s+")");
                retList.add("()"+s);
                retList.add(s+"()");
            }
            for (int i=1;i<=n-1;i++){
                List<String> innerStrings1 = generateParenthesis(i);
                List<String> innerStrings2 = generateParenthesis(n-1-i);
                for (String s1:innerStrings1){
                    for (String s2:innerStrings2)
                    {
                        retList.add(s1 + "()" +s2);
                    }
                }
            }

        }
        return retList.stream().distinct().collect(Collectors.toList());
    }
}
