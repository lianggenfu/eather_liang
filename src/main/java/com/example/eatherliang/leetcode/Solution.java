package com.example.eatherliang.leetcode;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 *两数之和
 * 力扣地址: https://leetcode-cn.com/problems/add-two-numbers/
 *
 * */

public class Solution {

    Logger logger = LoggerFactory.getLogger(Solution.class);

    @Test
    public void test1() {
        /*ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));*/

        //case 2
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));

        ListNode re = reverse(l1);

        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode rs = addTwoNumbers3(l1, l2);
        logger.info("test1 res is :{}", rs);
    }

    @Test
    public void test2() {
        ListNode l2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(6)))));
        ListNode rs = reverse2(l2);
        System.out.println("111");
    }

    //递归？
    private ListNode reverse2(ListNode l2) {
        return new ListNode();
    }

    //头节点法
    private ListNode reverse(ListNode l1) {
        ListNode n1 = l1;
        ListNode head = new ListNode(-1);
        while(n1 != null){
            ListNode tempList = n1.next;
            n1.next = head.next;
            head.next = n1;
            n1 = tempList;
        }
        return head.next;
    }

    //改进
    public ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        ListNode n1 = l1, n2 = l2;
        ListNode head = new ListNode(-1);
        ListNode next = head;
        int value = 0, carry = 0;
        while (n1 != null || n2 != null || carry > 0) {
            value = (n1 == null ? 0 : n1.val) + (n2 == null ? 0 : n2.val) + carry;
            carry = value / 10;
            next.next = new ListNode(value % 10);
            n1 = n1 == null ? null : n1.next;
            n2 = n2 == null ? null : n2.next;
            next = next.next;
        }
        return head;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1, n2 = l2;
        ListNode head = new ListNode(-1);
        ListNode next = head;
        int value = 0, carry = 0;
        while (n1 != null || n2 != null || carry > 0) {
            int n1Val = n1 == null ? 0 : n1.val;
            int n2Val = n2 == null ? 0 : n2.val;
            value = n1Val + n2Val + carry;
            if (value < 10) {
                carry = 0;
            } else {
                carry = value / 10;
                value = value % 10;
            }
            n1 = n1 == null ? null : n1.next;
            n2 = n2 == null ? null : n2.next;
            next.val = value;
            if(n1 != null || n2 != null || carry > 0){
                next.next = new ListNode(-1);
            }
            next = next.next;
        }
        return head;
    }



}

