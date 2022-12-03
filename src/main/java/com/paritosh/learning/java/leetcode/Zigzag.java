package com.paritosh.learning.java.leetcode;

public class Zigzag {

    public static void main(String[] args){
        System.out.println(convert("PAYPALISHIRING",3));
    }

    public static  String convert(String s, int numRows) {
        String ret = "";

        if (numRows==1){
            return s;
        }
        String[] lines = new String[numRows];
        for (int i=0;i<numRows;i++){
            lines[i]="";
        }
        int currLine =0;
        boolean isGoingDown = true;
        for (int i=0;i<s.length();i++){

            lines[currLine] = lines[currLine] + s.charAt(i);
            if (isGoingDown)
                currLine++;
            else
                currLine--;
            if (currLine>=numRows){
                currLine=numRows-2;
                isGoingDown=false;
            }
            if (currLine==-1){
                currLine=1;
                isGoingDown=true;
            }

        }

        for (String line : lines){
            ret= ret+line;
        }

        return ret;


    }
}
