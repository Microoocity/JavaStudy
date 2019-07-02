package com.icity.javastudy.Demo27Stream;

import java.util.stream.Stream;

/*
    Stream流中常用方法：forEach
    void forEach(Consumer<? super T> action);
    该方法接收一个Consumer接口，会将每一个元素交给函数进行处理
    Consumer接口是一个消费型的函数式接口，可以传递lambda表达式，消费数据

    简单记：
        forEach方法用来遍历流中的数据，是一个终结方法，遍历后不能继续调用Stream流中的其他方法
 */
public class Demo2704StreamForEach {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stringStream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        //使用Stream流中的方法forEach对流中的数据进行遍历
        stringStream.forEach(name-> System.out.print(name));
    }
}
