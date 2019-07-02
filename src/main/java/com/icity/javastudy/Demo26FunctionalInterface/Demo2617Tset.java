package com.icity.javastudy.Demo26FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
    练习：集合信息筛选
    数组中有多条 “ 姓名+性别 ” 的信息如下，
    String[] array = { "icity01,男","icity02,女","icity03,男","icity04,女" };
    通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，
    需要同时满足2个条件：
        1.必须为女生
        2.姓名为4个字

    分析：
        1.有2个判断条件，所以需要使用2个Predicate接口，对条件进行判断
        2.必须同时满足2个条件，所以可以使用and方法连接2个判断条件
 */
public class Demo2617Tset {
    /*
        定义一个方法
        方法的参数传递一个包含人员信息的数组
        传递2个Predicate接口，用于对数组中的信息进行过滤
        把满足条件的信息存储到ArrayList集合中并返回
     */
    public static ArrayList<String> filter(String[] arr, Predicate<String> predicate1, Predicate<String> predicate2) {
        //定义一个ArrayList集合，存储过滤之后的信息
        ArrayList<String> arrayList = new ArrayList<>();
        //遍历数组，获取数组中的每一条信息
        for (String s : arr) {
            //使用Predicate接口中的方法test对获取到的字符串进行判断
            boolean b = predicate1.and(predicate2).test(s);
            //对得到的布尔值进行判断
            if (b) {
                //条件成立，两个条件均满足，把信息存储到ArrayList集合中
                arrayList.add(s);
            }
        }
        //把集合返回
        return arrayList;
    }

    public static void main(String[] args) {
        //定义一个存储字符串的数组
        String[] array = {"icity1,男", "icity2,女", "icity03,男", "icity4,女"};
        //调用filter方法，传递字符串数组和2个lambda表达式
        ArrayList<String> arrayList = filter(array, s -> s.split(",")[1].equals("女"), s -> s.split(",")[0].length() == 6);
        /*ArrayList<String> arrayList1 = filter(array, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.split(",")[1].equals("女");
            }
        }, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.split(",")[0].length() == 6;
            }
        });*/
        //遍历集合
        for (String s : arrayList) {
            System.out.println(s);
        }
    }

}
