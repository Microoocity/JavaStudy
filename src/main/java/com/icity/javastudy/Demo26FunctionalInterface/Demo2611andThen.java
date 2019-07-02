package com.icity.javastudy.Demo26FunctionalInterface;

import java.util.function.Consumer;

/*
    Consumer接口的默认方法andThen
    作用：需要2个Consumer接口，可以把2个Consumer接口组合到一起，再对数据进行消费

    eg：
        Consumer<String> consumer1;
        Consumer<String> consumer2;
        String s = "Hello!";
        consumer1.accept(s);
        consumer2.accept(s);
        连接2个Consumer接口，再进行消费
        consumer1.anThen(consumer2).accept(s); // 谁写前面先消费谁
 */
public class Demo2611andThen {
    //定义一个方法，方法的参数传递一个字符串和2个Consumer接口，Consumer接口的泛型使用字符串
    public static void main(String[] args) throws Exception {
        //调用method方法，传递一个字符串，2个lambda表达式
        method("Hello", (t) -> {
            //消费方式：把字符串转为大写输出
            System.out.println(t.toUpperCase());
        }, (t) -> {
            //转小写
            System.out.println(t.toLowerCase());
        });
    }

    public static void method(String string, Consumer<String> consumer1, Consumer<String> consumer2) throws Exception {
//        consumer1.accept(string);
//        consumer2.accept(string);
        //使用andThen方法，把2个Consumer接口组合到一起，再对数据进行消费
        consumer1.andThen(consumer2).accept(string);
    }
}
