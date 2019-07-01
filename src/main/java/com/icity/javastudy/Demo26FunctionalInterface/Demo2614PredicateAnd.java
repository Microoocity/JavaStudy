package com.icity.javastudy.Demo26FunctionalInterface;

import java.util.function.Predicate;

/*
    逻辑表达式：连接多个判断的条件
    &&：与运算符，有false则false
    ||：或运算符，有true则true
    !：非（取反）运算符

    需求：判断一个字符串，有2个判断条件
        1.判断字符串长度是否大于5
        2.判断字符串中是否包含a
    2个条件必须同时满足，可以使用与运算符连接两个条件

    Predicate接口中有一个方法and，表示并且关系，也可用于连接2个判断条件
    default Predicate<T> and(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) && other.test(t);
    }
 */
public class Demo2614PredicateAnd {
    /*
        定义一个方法，方法的参数传递一个字符串
        传递2个Predicate接口：
            一个用于判断字符串的长度是否大于5
            一个用于判断字符串中是否包含a
            2个条件必须同时满足
     */
    public static boolean checkString(String string, Predicate<String> predicate1, Predicate<String> predicate2) {
//        predicate1.and(s -> s.length()>5).
//        return predicate1.test(string) && predicate2.test(string);
        return predicate1.and(predicate2).test(string); // 等价于 return predicate1.test(string) && predicate2.test(string);
    }

    public static void main(String[] args) {
        String string = "abcdef";
        //调用checkString方法，参数传递字符串和2个lambda表达式
        boolean b = checkString(string, s -> s.length() > 5, s -> s.contains("a"));
        System.out.println(b);
    }

}
