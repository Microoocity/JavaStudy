package com.icity.javastudy.Demo04Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo0405LinkedHashMap {

    public static void main(String[] args) {

        //key不允许重复，无序集合
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("a","a");
        hashMap.put("b","b");
        hashMap.put("c","c");
        hashMap.put("a","d");
        System.out.println(hashMap);

        //key不允许重复，有序集合
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a","a");
        linkedHashMap.put("c","c");
        linkedHashMap.put("b","b");
        linkedHashMap.put("a","d");
        System.out.println(linkedHashMap);

    }

}
