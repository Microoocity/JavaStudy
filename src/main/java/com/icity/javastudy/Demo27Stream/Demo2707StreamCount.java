package com.icity.javastudy.Demo27Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    Stream流中的常用方法count:用于统计Stream流中的个数
    lang count();
    count方法是一个终结方法，返回值是一个lang类型的整数
    故不能继续调用Stream流中的其他方法
 */
public class Demo2707StreamCount {
    public static void main(String[] args) {
        //获取一个Stream流
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        Stream<Integer> stream = arrayList.stream();
        long count = stream.count();
        System.out.println(count);
    }
}
