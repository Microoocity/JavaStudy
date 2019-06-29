package com.icity.javastudy.Demo26FunctionalInterface;

import java.util.function.Supplier;

/*
    常用的函数式接口
    java.util.function.Supplier<T>接口仅包含一个无参方法：T get() 用来获取一个泛型参数指定类型的对象数据

    Supplier<T>接口被称为生产型接口：指定接口的泛型是什么类型，接口中get方法就会生产什么类型的数据
 */
public class Demo2608Supplier {
    //定义一个方法，方法的参数传递Supplier<T>接口，泛型执行String，get方法就会返回一个String
    public static String getString(Supplier<String> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {

        /*Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "icity0";
            }
        };
        System.out.println(supplier);

        String string = getString(supplier);*/

        String string0 = getString(new Supplier<String>() {
            @Override
            public String get() {
                return "icity0";
            }
        });
        System.out.println(string0);

        //调用getString方法，方法的参数Supplier是一个函数式接口，所以可以传递Lambda表达式
        String string1 = getString(() -> {
            //生产一个字符串并返回
            return "icity1";
        });
        System.out.println(string1);

        String string2 = getString(() -> "icity2");
        System.out.println(string2);
    }
}
