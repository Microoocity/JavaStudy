package com.icity.javastudy.Demo27Stream;

import java.util.*;
import java.util.stream.Stream;

/*
    java.util.stream.Stream<T>是Java 8 中新加入的最常用的流接口（并非函数式接口）
    获取一个流非常简单，有以下几种常用方式：
        所有的Collection集合都可以通过stream默认方法获取流：
            default Stream<E> stream()
        Stream接口的静态方法of可以获取数组对应的流
            static <T> Stream<T> of (T...values)
            参数是一个可变参数，那么我们就可以传递一个数组
 */
public class Demo2703GetStream {
    public static void main(String[] args) {
        //把集合转换为Stream流
        List<String> list = new ArrayList<>();
        //调用list中的stream方法，即可把stringStream转换为流对象
        Stream<String> stringStream = list.stream();

        //Set集合：单列集合
        Set<String> set = new HashSet<>();
        Stream<String> stringStream1 = set.stream();

        Map<String, String> hashMap = new HashMap<>();
        //获取键，存储到set集合中
        Set<String> keySet = hashMap.keySet();
        Stream<String> stringStream2 = keySet.stream();

        //获取值，存储到一个Collection集合中
        Collection<String> values = hashMap.values();
        Stream<String> stringStream3 = values.stream();

        //获取键值对
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        Stream<Map.Entry<String, String>> entryStream = entries.stream();


        //数组转换为Stream流
        Stream<? extends Number> stream = Stream.of(1, 2, 3, 4, 5);
        //可变参数可以传递数组
        Integer[] arr = new Integer[10];
//        String<Integer> stream = String.of(arr);
        //todo:Java9+ needed
    }
}
