package com.example.eatherliang.javabase;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        int result = methord1();
        System.out.println("result is : "+result);//3

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("test1");
        linkedList.add("test2");
        linkedList.add("test3");
        linkedList.add("test4");
        linkedList.add("test5");

        linkedList.addFirst("test0");
        linkedList.size();
        linkedList.peek();
        boolean ss = linkedList.add("test1");
        linkedList.add(4,"ssss");

        linkedList.addLast("last");

        String sss = linkedList.get(4);

        System.out.println(linkedList);
    }

    private static int methord1() {
        try {
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }
}
