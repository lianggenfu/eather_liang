package com.example.eatherliang.leetcode;


import org.junit.Test;

import java.util.*;

/**

https://leetcode-cn.com/problems/two-sum/
* */
public class TwoSum {

    @Test
    public void test(){
        int[] nums = {3,4,2,6}; // 2 3 4 6
                              // 5 6 8 7 9 10
        int target = 10;
        int[] res = twoSumBySet(nums,target);
        System.out.println("res is : "+ res.toString());
    }

    private int[] twoSumBySet(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[0];
    }

    public int[] twoSum(int[] nums, int target) {
        int[] resNum = new int[2];
        int length = nums.length;
        int index1 = -1;
        int index2 = -1;
        for(int i = 0;i<length-1;i++){
            for (int j=i+1; j<length;j++){
                if(nums[i]+nums[j]==target){
                    index1 = i;
                    index2 = j;
                }
            }
        }
        resNum[0] = index1;
        resNum[1] = index2;
        return resNum;
    }


}
