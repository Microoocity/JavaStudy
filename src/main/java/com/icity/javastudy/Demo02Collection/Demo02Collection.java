package com.icity.javastudy.Demo02Collection;

import java.util.ArrayList;
import java.util.Collection;

/*java.util.Collection接口
所有单列集合最顶层的接口，定义了所有单列集合共性的方法
任意单列集合均可使用Collection接口中的方法*/
public class Demo02Collection {

    public static void main(String[] args) {
        //创建集合对象，可使用多态
        Collection<String> coll = new ArrayList<>();
//        通用方法：HashSet也可使用
//         Collection<String> coll = new HashSet<>();
        System.out.println(coll); // 重写了toString方法

        collAdd(coll, "icity01");
        collAdd(coll, "icity02");
        collAdd(coll, "icity03");
        collAdd(coll, "icity04");
        collAdd(coll, "");

        collRemove(coll, "icity02");
        collRemove(coll, "icity02");

        collContains(coll, "icity01");
        collContains(coll, "icity02");

        collIsEmpty(coll);
        collClear(coll);
        collIsEmpty(coll);

        collSize();

    }

    private static void collSize() {
    }

    /*public boolean add(E e);
        把指定的对象添加到当前集合中，返回值是一个Boolean值，一般返回均为true。*/
    private static void collAdd(Collection<String> coll, String data) {

        boolean isAdd = coll.add(data);
        System.out.println("添加状态：" + isAdd);
        System.out.println(coll);

    }

    /*public boolean remove(E e);
            把指定的对象从当前集合中删除，返回值是一个Boolean值，若集合中存在该元素，删除成功后返回true；
            集合中不存在该元素，删除失败后返回false；*/
    private static void collRemove(Collection<String> coll, String data) {

        boolean isRemoved = coll.remove(data);
        System.out.println("删除状态：" + isRemoved);
        System.out.println(coll);
    }

    /*public boolean contains(E e);
            判断当前集合中是否包含给定的对象，返回值是一个Boolean值，
            若集合中存在该元素，返回true；
            集合中不存在该元素，返回false；*/
    private static void collContains(Collection<String> coll, String data) {

        System.out.println(coll);
        boolean isContains = coll.remove(data);
        System.out.println("元素" + data + "的包含状态：" + isContains);
    }

    /*public boolean isEmpty(E e);
            判断当前集合中是否为空，返回值是一个Boolean值。
            集合为空返回true
            集合不为空返回false */
    private static void collIsEmpty(Collection<String> coll) {

        boolean isEmpty = coll.isEmpty();
        System.out.println(isEmpty ? "集合" + coll + "为空" : "集合" + coll + "不为空");

    }


    private static void collClear(Collection<String> coll) {

        coll.clear();
        System.out.println("集合" + coll + "已被清空");

    }

    /*public boolean isEmpty(E e);
            判断当前集合中是否为空，返回值是一个Boolean值。
            集合为空返回true
            集合不为空返回false */

}
