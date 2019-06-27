package com.icity.javastudy.Demo03Generic;

public class Demo03Generic2 {

    public static void main(String[] args) {
        //不写泛型，默认为Object类型
        GenericClass genericClass1 = new GenericClass();
        genericClass1.setName("只能是字符串");
        System.out.println(genericClass1.getName());

        //创建GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> genericClass2 = new GenericClass<>();
        genericClass2.setName(1);
        System.out.println(genericClass2.getName());

        //创建GenericClass对象，泛型使用String类型
        GenericClass<String> genericClass3 = new GenericClass<>();
        genericClass3.setName("String类型");
        System.out.println(genericClass3.getName());
    }

}
