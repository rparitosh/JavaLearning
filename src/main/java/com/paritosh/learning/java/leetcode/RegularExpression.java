package com.paritosh.learning.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RegularExpression {

    public boolean isMatch(String s, String p) {
        boolean match = true;
        int pPos = 0;
        int sPos = 0;
        List<String> tokens = getTokens(p);
        while (pPos<p.length() && sPos< s.length()){
            char s1= s.charAt(sPos);
            char p1= p.charAt(pPos);
        }
        return match;
    }

    public List<String> getTokens(String p){
        int pos = 0;
        List<String> tokens = new ArrayList<>();
        String currToken = null;
        while (pos < p.length()){
            char c= p.charAt(pos);
            if (c=='*') {
                currToken = currToken + "*";
            } else{
                tokens.add(currToken);
                currToken = String.valueOf(c);
            }
        }
        if (currToken!=null)
            tokens.add(currToken);
        return tokens;
    }
}
