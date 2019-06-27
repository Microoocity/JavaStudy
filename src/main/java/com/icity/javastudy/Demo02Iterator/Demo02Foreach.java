package com.icity.javastudy.Demo02Iterator;

import java.util.ArrayList;

/*
    增强for循环：底层使用的也是迭代器，使用for循环的格式简化了迭代器的书写。JDK1.5+
    Collection<E> extends Iterable<E>:所有的单列集合都可以使用增强for
    public interface Iterable<T>实现这个接口允许对象成为"foreach"语句的目标

    增强for循环：用来遍历集合和数组

    格式：
        for(集合/数组的数据类型 变量名：集合名/数组名) {
            sout(变量名);
        }
*/
public class Demo02Foreach {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo01() {
        int[] arr = {0, 1, 2, 3, 4};
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void demo02(){
        ArrayList<String> list = new ArrayList<>();
        list.add("icity00");
        list.add("icity01");
        list.add("icity02");
        list.add("icity03");
        for(String s: list){
            System.out.println(s);
        }
    }

}
