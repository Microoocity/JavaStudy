package com.icity.javastudy.Demo27Stream;

import java.util.ArrayList;
import java.util.List;

/*
    使用传统的方式，遍历集合，对集合中的数据进行过滤
 */
public class Demo2701List {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();
        List<String> arrayList3 = new ArrayList<>();
        arrayList.add("acity00");
        arrayList.add("icty01");
        arrayList.add("icity02");
        arrayList.add("bcity3");
        arrayList.add("ccy04");
        arrayList.add("dcity05");

        //遍历，只要以i开头的元素
        for (String s : arrayList) {
            boolean b1 = s.startsWith("i");
            boolean b2 = (s.length() == 7);
            if (b1) {
                arrayList2.add(s);
            }
            if (b1 && b2) {
                arrayList3.add(s);
            }
        }

        System.out.println(arrayList2);
        System.out.println(arrayList3);
    }
}
