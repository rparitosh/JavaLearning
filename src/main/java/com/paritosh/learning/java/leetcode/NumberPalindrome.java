package com.paritosh.learning.java.leetcode;

public class NumberPalindrome {

    public boolean isPalindrome(int x) {
        boolean pal = true;
        if (x<0)
            return false;
        if (x<10)
            return true;
        String val = String.valueOf(x);
        int left =-1;
        int right =-1;
        if (val.length()%2 ==1){
            // odd
            left = val.length()/2;
            right = left;
        }else{
            //even
            right = val.length()/2;
            left = right-1;
        }
        while (left>=0 && right<val.length()){
            if (val.charAt(left)!=val.charAt(right)){
                pal=false;
                break;
            }
            left--;
            right++;
        }
        return pal;
    }
}
