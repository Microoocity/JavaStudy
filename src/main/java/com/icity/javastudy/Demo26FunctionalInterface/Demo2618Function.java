package com.icity.javastudy.Demo26FunctionalInterface;

import java.util.function.Function;

/*
    java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据，前者称为前置条件，后者称为后置条件
    Functional接口中最主要的抽象方法为：R apply(T t)，根据类型T的参数获取类型R的结果，使用场景如：将String类型转换为Integer类型
 */
public class Demo2618Function {
    /*
        参数：字符串类型整数&一个Function接口，泛型使用<String, Integer>
        使用function接口中的方法apply，把字符串类型的证书，转换为Integer类型的整数
     */
    public static void change(String string, Function<String, Integer> function) {
//        int integer = function.apply(string); // 自动拆箱
        Integer integer = function.apply(string);
        System.out.println(integer);
    }

    public static void main(String[] args) {
        String string = "1234";
        //调用change方法
        change(string, s -> Integer.parseInt(s));
    }

}
