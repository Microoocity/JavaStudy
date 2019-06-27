package com.icity.javastudy.Demo02Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 迭代器：对集合进行遍历，2个常用方法：
 *   1.boolean hasNext()：若仍有元素可以迭代，返回true
 *   2.E next()返回迭代的下一个元素；取出集合中的下一个元素
 * Iterator迭代器是一个接口，无法直接使用。需用Iterator接口的实现类对象，获取实现类的方式比较特殊
 * Collection接口中有iterator()，这个方法返回的是迭代器实现类对象
 * Iterator<E> iterator返回在此collection的元素上进行迭代的迭代器
 *
 * 使用步骤：
 *   1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
 *   2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
 *   3.使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class Demo02Iterator {

    private static Collection<String> coll = new ArrayList<>();
    private static String[] data = {"icity01", "icity02", "icity03", "icity04", "icity05"};

    public static void main(String[] args) {

        for (String datum : data) {
            collAdd(coll, datum);
        }
//        for (int i = 0; i < coll.size(); i++) {
            collItreator(coll);
//        }

    }

    private static void collAdd(Collection<String> coll, String data) {

        boolean isAdd = coll.add(data);
        System.out.println("添加状态：" + isAdd);
        System.out.println(coll);

    }

    private static void collItreator(Collection<String> coll) {
    /*
    1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
    注意：
        1.Iterator<E>接口也是有泛型的，迭代器的泛型由集合的泛型决定
    */
        //多态   接口                实现类对象
        Iterator<String> iterator = coll.iterator();
//        2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
        boolean isHasNext = iterator.hasNext();
        System.out.println(isHasNext);
//        3.使用Iterator接口中的方法next取出集合中的下一个元素
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        for (Iterator<String> iterator1 = coll.iterator();iterator1.hasNext();){
            String next = iterator1.next();
            System.out.println(next);
        }
    }

}
