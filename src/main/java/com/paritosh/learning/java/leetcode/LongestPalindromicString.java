package com.paritosh.learning.java.leetcode;

import java.util.Stack;

public class LongestPalindromicString {

    public static void main(String[] args){
        System.out.println(longestPalindromicString("abccdbcjabajcbdccssaj"));
    }

    public static String generatePalindrome(String s, int left, int right){
        String res = s.charAt(left) + "";
        if (left<right){
            // even pal
            if (s.charAt(left) != s.charAt(right)){
                return res;
            }else {
                res = s.substring(left,right+1);
                left--;
                right++;
            }
        }
        while (left>=0 && right <s.length()){
            if (s.charAt(left) == s.charAt(right)){
                res = s.substring(left,right+1);
                left--;
                right++;
            } else{
                break;
            }

        }

        return res;
    }

    public static String longestPalindromicString(String s) {

        String longestPal = "";


        for (int i=0;i<s.length()-1;i++){

            String pal= generatePalindrome(s,i,i); // odd
            if (pal.length() > longestPal.length()) {
                longestPal = pal;
            }
            pal= generatePalindrome(s,i,i+1); // odd
            if (pal.length() > longestPal.length()) {
                longestPal = pal;
            }


        }




        return longestPal;
    }

}
