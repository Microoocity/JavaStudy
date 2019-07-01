package com.icity.javastudy.Demo26FunctionalInterface;

import java.util.function.Function;

/*
    练习：
        使用Function进行函数模型的拼接，按照顺序需要执行多个函数操作:
        String string = "icity,20";

    分析：
    1.将字符串截取数字年龄部分，得到字符串
        Function<String,String> "icity,20"->"20"
    2.将上一步的字符串转为int类型的数字
        Function<String,Integer> "20"->"20"
    3.将上一步int数字累加100，得到int数字
        Function<Integer,Integer> 20->120
 */
public class Demo2620Test {
    public static int change(String string, Function<String, String> function1,
                             Function<String, Integer> function2, Function<Integer, Integer> function3) {
        return function1.andThen(function2.andThen(function3)).apply(string);
    }

    public static void main(String[] args) {
        String string = "icity,20";
        int change = change(string, s -> s.split(",")[1], s -> Integer.parseInt(s), integer -> integer += 100);
        System.out.println(change);
    }

}
