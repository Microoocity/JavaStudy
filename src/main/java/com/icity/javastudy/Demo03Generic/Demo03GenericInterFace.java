package com.icity.javastudy.Demo03Generic;

//测试含有泛型的接口
public class Demo03GenericInterFace {
    public static void main(String[] args) {
        //创建GenericInterfaceImplement1对象
        GenericInterFaceImplement1 genericInterFaceImplement1 = new GenericInterFaceImplement1();
        genericInterFaceImplement1.method("字符串");

        //创建GenericInterfaceImplement2对象
        GenericInterFaceImplement2<Integer> genericInterFaceImplement2 = new GenericInterFaceImplement2<>();
        genericInterFaceImplement2.method(10);

        GenericInterFaceImplement2<Double> genericInterFaceImplement21 = new GenericInterFaceImplement2<>();
        genericInterFaceImplement21.method(10.3);
    }
}
