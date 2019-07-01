package com.icity.javastudy.Demo26FunctionalInterface;

import java.util.function.Predicate;

/*
    判断一个字符串长度是否大于5
    大于5，返回false；否则返回true
    故可对取反符号!对判断的结果进行取反

    Predicate中有一个方法negate，也表示取反的意思

    defult Predicate<T> negate() {
        return (t) -> !test(t);
    }
 */
public class Demo2616PredicateNegate {
    /*
        定义一个方法，方法的参数传递一个字符串
        使用Predicate接口判断字符串的长度是否大于5
        大于5，返回false；否则返回true
     */
    public static boolean checkString(String string, Predicate<String> predicate1) {
//        return !predicate1.test(string);
        return predicate1.negate().test(string);
    }

    public static void main(String[] args) {
        String string = "abc";
        //调用checkString方法，参数传递字符串和lambda表达式
        boolean b = checkString(string, s -> s.length() > 5);
        System.out.println(b);
    }

}
