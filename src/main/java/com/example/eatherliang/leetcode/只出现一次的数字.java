package com.example.eatherliang.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 只出现一次的数字 {

    @Test
    public void test1(){
        int[] arrays = new int[]{4,1,2,1,2};
        int result = solutionAppearOnlyOnce2(arrays);
        System.out.println("111");
    }

    private int solutionAppearOnlyOnce2(int[] arrays) {
        int single = 0;
        for(int num : arrays){
            single ^= num;
        }
        return single;
    }

    /*private int solutionAppearOnlyOnce(int[] arrays) {
        List<Integer> list = new ArrayList<>(arrays.length);
        for (int i = 0; i <arrays.length ; i++) {
            if(list.contains(arrays[i])){
                list.remove((Object)arrays[i]);
            }else {
                list.add(arrays[i]);
            }
        }
        return list.get(0);
    }*/
}
