package com.paritosh.learning.java.leetcode;

public class MedianSortedArrays {

    public static void main(String[] args){


    }

    public static boolean isSumEven(int m, int n){
        return (m+n)%2 == 0 ;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double retVal = 0;
        int[] a,b;
        if (nums1.length>nums2.length){
            a=nums1;
            b=nums2;
        }else{
            a=nums2;
            b=nums1;
        }

        int a1 =(a.length +1 )/2;
        int a2 = a1+1;
        int b1 = b.length /2;
        int b2 = b1+1;

        if (a2<a.length && b2<b.length){
            if (a[a1]<=b[b2] && a[a2]>=b[b1]){
                int max = Math.max(a[a1],b[b1]);
                int min = Math.min(a[a2],b[b2]);
                if (isSumEven(a.length,b.length)){
                    retVal = (max+min)/2;
                }else{
                    retVal = max;
                }
                // median found
            }
        }



        return retVal;

    }

}
