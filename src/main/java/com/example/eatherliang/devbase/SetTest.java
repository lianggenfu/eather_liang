package com.example.eatherliang.devbase;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

    @Test
    public void test1(){
        Set<StringBuffer> set = new HashSet<>();
        StringBuffer sb1 = new StringBuffer("aa");
        StringBuffer sb2 = new StringBuffer("aabb");
        set.add(sb1);
        set.add(sb2);
        StringBuffer sb3 = sb1.append("bb"); //
        set.add(sb3);

        set.add(new StringBuffer("aabb"));
        System.out.println("you answer:");
    }

    @Test
    public void test2(){
        Set<String> set  = new HashSet<>();
        set.add("test");
        set.add("test");
        String s1 = new String("test1");
        String s2 = new String("test1");
        String s3 = new String("test1");
        set.add(s1);
        set.add(s2);
        set.add(s3);
    }

    @Test
    public void test3(){
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode rs = reverse(l1);
    }

    /* just to reverse a single list head insert */
    private ListNode reverse(ListNode l1) {
        ListNode pre = l1,cur = null;
        while (pre !=null){
            ListNode temp = pre.next;
            pre.next = cur;
            cur = pre;
            pre = temp;
        }
        return cur;
    }


}
