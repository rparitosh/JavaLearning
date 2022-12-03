package com.paritosh.learning.java.leetcode;

public class ReverseInteger {

    public static void main(String[] args){
        System.out.println(reverse(123));
    }


    public static int reverse(int x) {
        boolean neg = false;
        int ret = 0;
        if (x<0){
            neg = false;
            x= -x;
        }
        String strNum = String.valueOf(x);
        StringBuilder sb = new StringBuilder(strNum);
        sb.reverse();
        String revString = sb.toString();
        if (Integer.valueOf(revString) >0){
            ret = Integer.valueOf(revString);
        }


        return neg?-ret:ret;
    }


}
