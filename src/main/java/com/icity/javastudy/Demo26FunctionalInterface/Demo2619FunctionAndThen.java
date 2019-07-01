package com.icity.javastudy.Demo26FunctionalInterface;

import java.util.function.Function;

/*
    Function接口中的默认方法andThen：用来进行组合操作

    需求：
        把String类型的"123"转换为Integer类型，把转换后的结果加10
        把增加后的Integer类型的数据，转换为String类型

    转换了2次,故可Function<String, Integer> function1, Integer i = functional.apply("123")+10;
                 Function<Integer, String> function2, String s = functional2.apply(i);
                 可以使用andThen方法，把2次转换组合在一起使用
                 String string = function1.andThen(functional2).apply("123");
                 function1先调用apply方法，把字符串转换为Integer
                 function2再调用apply方法，把Integer转换为字符串
 */
public class Demo2619FunctionAndThen {
    public static void change(String string, Function<String, Integer> function1, Function<Integer, String> function2) {
        String string2 = function1.andThen(function2).apply(string);
        System.out.println(string2);
    }

    public static void main(String[] args) {
        String string = "123";
        change(string, s -> Integer.parseInt(s)+10, integer -> integer+"");
    }

}
