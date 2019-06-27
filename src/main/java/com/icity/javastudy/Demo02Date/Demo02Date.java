package com.icity.javastudy.Demo02Date;

import java.util.Date;

public class Demo02Date {

    public static void main(String[] args) {
        Demo02Date();
        Demo03Date();
    }

    //Date类空参构造函数的方法，Date获取当前系统和时间
    private static void Demo02Date() {

        Date date = new Date();
        System.out.println(date); // Sat Jun 01 11:44:19 CST 2019

    }

    //Date类带参构造方法
    //Date(long date)：传递毫秒值，把毫秒值转换为Date日期
    private static void Demo03Date(){

        Date date = new Date(945612345689L);
        System.out.println(date);

    }



}
