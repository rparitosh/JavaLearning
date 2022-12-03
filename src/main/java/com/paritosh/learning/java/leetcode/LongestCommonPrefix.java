package com.paritosh.learning.java.leetcode;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        StringBuffer sb = new StringBuffer();
        boolean keepRunning = true;
        for (int i=0;i<200 && keepRunning ;i++){
            char curChar = ' ';
            for (int j=0;j<strs.length;j++){
                if(i<strs[j].length()) {
                    if (j == 0) {
                        curChar = strs[j].charAt(i);
                    } else {
                        if (curChar != strs[j].charAt(i)) {
                            keepRunning = false;
                            break;
                        }
                    }
                }else {
                    keepRunning=false;
                    break;
                }
            }
            if (keepRunning){
                sb.append(curChar);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(longestCommonPrefix(new String[]{"waltersss","","walters"}));

    }
}
