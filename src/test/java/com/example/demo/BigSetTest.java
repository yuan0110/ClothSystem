package com.example.demo;

import java.util.BitSet;
import java.util.LinkedHashMap;

public class BigSetTest {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet(6);
        int [] array = new int [] {1,2,3,22,0,3};
        for(int i=0;i<array.length;i++)
        {
            bitSet.set(array[i], true);
        }
        LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
        hm.put("aa",new Integer(1));
        hm.put("bb",new Integer(2));
        System.out.println(bitSet.size());
        System.out.println(bitSet.get(3));
        System.out.println("6");
    }
}
