package com.icity.javastudy.Demo27Stream;

import java.util.stream.Stream;

public class Demo2709StreamSkip {
    public static void main(String[] args) {
        String[] arr = {"icity01", "icity02", "icity03", "icity04", "icity05", "icity06"};
        Stream<String> stringStream = Stream.of(arr);
        //使用skip方法跳过前三个元素
        Stream<String> skip = stringStream.skip(3);
        skip.forEach(name -> System.out.println(name));
    }
}
