package com.icity.javastudy.Demo03Generic;

import java.util.ArrayList;
import java.util.Iterator;

//泛型通配符
//  ？：代表任意数据类型
//使用方式：不能创建对象使用
//只能作为方法的参数使用
public class Demo03Generic3 {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);
    }

    //定义一个方法，能遍历所有的Arraylist集合
    //不知道ArrayList使用什么数据类型，可以使用泛型的通配符 ？ 来接收数据类型
    //注意：泛型无继承的概念
    public static void printArray(ArrayList<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            //iterator.next()方法取出的是Object，可以接收任意类型的数据
            Object o = iterator.next();
            System.out.println(o);
        }
    }
}
