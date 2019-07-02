package com.icity.javastudy.Demo27Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法limit:用于截取流中的元素
    limit方法可以对流进行截取，只取用前n个，方法签名
    Stream<T> limit(long maxSize);
        参数是一个long型，如果集合当前长度大于参数则进行截取，否则不进行操作
    limit方法是一个延迟方法，只是对流中的元素进行截取，返回的是一个新的流，可以继续调用Stream流中的其他方法
 */
public class Demo2708StreamLimit {
    public static void main(String[] args) {
        //获取一个Stream流
        String[] arr = {"icity01", "icity02", "icity03", "icity04", "icity05", "icity06"};
        Stream<String> stringStream = Stream.of(arr);
        //使用limit对Stream流中的元素进行截取，只要前三个元素
        Stream<String> stringStream2 = stringStream.limit(3);
        //遍历Stream2流
        stringStream2.forEach(name -> System.out.println(name));
    }
}
