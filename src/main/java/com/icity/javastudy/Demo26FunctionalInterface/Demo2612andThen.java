package com.icity.javastudy.Demo26FunctionalInterface;

import java.util.function.Consumer;

public class Demo2612andThen {
    public static void main(String[] args) {
        String[] arr = {"icity01,man", "icity02,girl", "icity03,man"};

        printInfo(arr, (m) -> {
            //消费方式：对message进行切割，获取性别，按照指定的格式输出
            String name = m.split(",")[0];
            System.out.print("姓名：" + name);
        }, (m) -> {
            String age = m.split(",")[1];
            System.out.println("; 性别：" + age + ";");
        });
    }

    //定义一个方法，参数传递String类型的数组和两个Consumer接口，泛型使用String
    public static void printInfo(String[] arr, Consumer<String> consumer1, Consumer<String> consumer2) {
        //遍历字符串
        for (String s : arr) {
            consumer1.andThen(consumer2).accept(s);
        }
    }

}
