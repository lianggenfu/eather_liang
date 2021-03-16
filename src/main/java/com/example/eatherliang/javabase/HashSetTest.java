package com.example.eatherliang.javabase;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {


    @Test
    public void Test1(){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("test1");
        hashSet.add("test2");
        hashSet.add("test3");

        boolean b1 = hashSet.add("test4");
        boolean b2 = hashSet.add("test4");

        boolean b3 = hashSet.contains("test1");

        boolean b4 = hashSet.removeAll(Arrays.asList("test1","test2"));

        System.out.println("sss");

    }

}
