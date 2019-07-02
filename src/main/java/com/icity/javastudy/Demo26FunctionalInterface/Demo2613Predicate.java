package com.icity.javastudy.Demo26FunctionalInterface;

import java.util.function.Predicate;

/*
    java.util.function.Predicate<T>接口
    作用：对某种数据类型的数据进行判断，结果返回一个布尔值

    Predicate接口中包含一个抽象方法：
        boolean test(T t):用来对指定数据类型的数据进行判断的方法
        结果：
            符合条件，返回true；否则返回false
 */
public class Demo2613Predicate {
    /*
        定义一个方法，参数传递一个String类型的字符串，传递一个Predicate接口，泛型使用String
        使用Predicate中的方法test对字符串进行判断，并把判断的结果返回
     */
    public static boolean checkString(String string, Predicate<String> predicate) {
        return predicate.test(string);
    }

    public static void main(String[] args) {
        String string = "Hello";

        /*boolean checkString = checkString(string, (s) -> {
            //对参数传递的字符串进行判断，判断字符串的长度是否大于5，并返回结果
            return s.length() > 5;
        });*/

        //优化lambda表达式
        //参数的数据类型可以省略，只有一个参数时，括号可以省略；只有一条语句，大括号、return和分号可以省略
        boolean checkString = checkString(string, s -> s.length() > 5);
        System.out.println(checkString);
    }

}
