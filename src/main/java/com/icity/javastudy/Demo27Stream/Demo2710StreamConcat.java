package com.icity.javastudy.Demo27Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法concat:用于把流组合到一起
    若2个流合并成一个流，使用Stream接口的静态方法concat
    static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class Demo2710StreamConcat {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> stringStream1 = Stream.of("张三", "李四", "王五", "赵六", "田七");
        String[] arr = {"icity01", "icity02", "icity03", "icity04", "icity05", "icity06"};
        Stream<String> stringStream2 = Stream.of(arr);

        //合并为一个流
        Stream<String> concat = Stream.concat(stringStream1, stringStream2);
        concat.forEach(name -> System.out.println(name));
    }
}
