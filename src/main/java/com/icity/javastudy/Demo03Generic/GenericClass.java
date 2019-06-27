package com.icity.javastudy.Demo03Generic;

//定义一个含有泛型的类，模拟ArrayList集合
//泛型是未知的数据类型，不确定使用什么类型时，可以使用泛型
//泛型可以接收任意类型的数据类型，可以使用Integer，String，Student...
//创建对象时确定泛型的数据类型
public class GenericClass<E> {

    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

}
