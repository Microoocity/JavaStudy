package com.icity.javastudy.Demo27Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法filter：用于对Stream流中的数据进行过滤
    Stream<T> filter(Predicate<? super T> predicate);
    filter方法的参数Predicate是一个函数式接口，所以可以传递lambda表达式，对数据进行过滤
    Predicate中的抽象方法：boolean test(T t);
 */
public class Demo2705StreamFilter {
    public static void main(String[] args) {
        //创建一个Stream流：单列集合或of方法
        Stream<String> stringStream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        Stream<String> stringStream1 = stringStream.filter(name -> name.startsWith("张"));
        //遍历stringStream1
        stringStream1.forEach(name -> System.out.println(name));

        /*
            Stream流属于管道流，只能被消费一次
            第一个Stream流调用完毕方法，数据会流转到下一个Stream流上
            此时第一个Stream流已经使用完毕，就会被关闭
            所以第一个Stream流就不能再调用方法了
         */
        //遍历Stream流
        stringStream.forEach(name -> System.out.println(name));
    }
}
