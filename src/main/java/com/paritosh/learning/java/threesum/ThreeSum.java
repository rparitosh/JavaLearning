package com.paritosh.learning.java.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSum {

    public static void main(String[] args){

        int[] nums = new int[]{8,2,3,5,3,-3,-2};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        List<List<Integer>> retList  = new ArrayList<>();

        List<Integer> tList = null;
        for (int i=0; i<sortedNums.length-2; i++) {
            int left = i+1;
            int right = sortedNums.length-1;
            int sumReqd = -sortedNums[i];
            while (left<right) {
                if (sortedNums[left] + sortedNums[right] == sumReqd) {
                    List<Integer> currList = Arrays.asList(sortedNums[i], sortedNums[left], sortedNums[right]);
                    if (!currList.equals(tList)) {
                        retList.add(currList);
                    }
                    tList=currList;

                    left++;
                } else if (sortedNums[left] + sortedNums[right] > sumReqd) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return retList.stream().distinct().collect(Collectors.toList());


    }


}
