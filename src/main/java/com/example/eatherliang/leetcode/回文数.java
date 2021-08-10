package com.example.eatherliang.leetcode;

/*
* https://leetcode-cn.com/problems/palindrome-number/
* */

import org.junit.Test;

public class 回文数 {

    @Test
    public void test1(){
        int num = 12321;
        boolean isPalindrome = isPalindrome_offcial(num);
        System.out.println(num+" is isPalindrome : "+isPalindrome);
    }

    private boolean isPalindrome_offcial(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber / 10;

    }


    public boolean isPalindrome_reverse(int x) {
        String str = String.valueOf(x);
        StringBuffer sb =  new StringBuffer(str);
        return sb.reverse().toString().equals(str);
    }
}
