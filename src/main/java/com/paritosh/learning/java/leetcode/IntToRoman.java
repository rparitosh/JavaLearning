package com.paritosh.learning.java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IntToRoman {

    public String intToRoman(int num) {
        int x= num;
        String retVal = ""
        int[] vals = new int[]{1000,500,100,50,10,5,1};
        char[] romans = new char[]{'M','D','C','L','X','V','I'};
        int pos = 0;
        while (pos<7){
            int rem = x%vals[pos];

            if (rem>4){
                for(int i=0;i<rem;i++){
                    retVal+=romans[pos];
                }
            }else{

            }
        }

    }
}
