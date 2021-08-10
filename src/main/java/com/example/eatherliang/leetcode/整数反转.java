package com.example.eatherliang.leetcode;

import org.junit.Test;

/*
*   https://leetcode-cn.com/problems/reverse-integer/
*
* */

public class 整数反转 {

    @Test
    public void test1(){
        int num = -123;
        int reverseNum = reverse(num);
        System.out.println(num+" reverseResult is: "+ reverseNum);
    }


    /*
    * 算法思想：
    * */
    public int reverse(int x) {
        int res = 0;
        while (x!=0) {
            while (res < Integer.MIN_VALUE / 10 || res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int tem = x % 10;
            x /= 10;
            res = res * 10 + tem;
        }
        return res;
    }
}
