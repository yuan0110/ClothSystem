package com.example.demo;

import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class BigSetTest {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0; i<11; ++i){
            hm.put(new Integer(i).toString(),i);
        }
        hm.put("aa",1);
        hm.put("bb",2);
        int num = hm.get("aa");
        hm.put("aa",3);
        num = hm.get("aa");


        System.out.println("6");
    }
}
