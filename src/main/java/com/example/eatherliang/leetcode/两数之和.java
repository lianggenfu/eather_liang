package com.example.eatherliang.leetcode;

/*
https://leetcode-cn.com/problems/two-sum/
*
* */

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class 两数之和 {

    @Test
    public void name() {
        int[] nums = {2,6,11,7};
        int target = 9;
        int[] res = twoSumViolence(nums,target);
        System.out.println("两数之和："+ toString(res));
    }

    private String toString(int[] nums) {
        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i <nums.length ; i++) {
            sb.append(nums[i]+",");
        }
        return sb.replace(sb.length()-1,sb.length(),"]").toString();
    }

    //skill
    public int[] twoSumSkill(int[] nums, int target) {
        for (int i = 0; i <nums.length ; i++) {

        }
        return new int[0];
    }

    //violence
    public int[] twoSumViolence(int[] nums, int target) {
        for (int i = 1; i <nums.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if(target == nums[i]+nums[j]){
                    return new int[]{j,i};
                }
            }
        }
        return new int[0];
    }


    //map
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int key = target - nums[i];
            if(map.containsKey(key)){
                return new int[]{map.get(key),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[0];
    }
}
