package com.paritosh.learning.java.leetcode;

public class StringToInt {

    public static void main(String[] args){
        System.out.println(myAtoi("-91283472332"));
    }

    public static int myAtoi(String s) {
        int numStart =-1;
        int numEnd = -1;
        boolean negative = false;
        boolean numbersStarted = false;
        boolean invalidChar = false;
        for(int i=0;i<s.length() && !invalidChar; i++){
            char c= s.charAt(i);
            switch (c) {
                case '-' -> {
                    if (numbersStarted) {
                        invalidChar = true;
                    } else {
                        negative = true;
                    }
                }
                case '+', ' ' -> {
                    if (numbersStarted) {
                        invalidChar = true;
                    }
                }
                case '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' -> {
                    if (!numbersStarted) {
                        numbersStarted = true;
                        numStart = i;
                    }
                    numEnd = i;
                }

                default -> {
                    invalidChar = true;

                }
            }

        }

        int multiplier = 1;
        int result = 0;
        boolean breach = false;
        for (int i= numStart;i<=numEnd && numEnd>=0; i++) {
            char c = s.charAt(i);
            int x = c - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && x > 7)) {
                return negative ? -Integer.MAX_VALUE : Integer.MAX_VALUE - 1;
            }
            result=result*10+x;

        }
        return negative?-result:result;
    }
}
