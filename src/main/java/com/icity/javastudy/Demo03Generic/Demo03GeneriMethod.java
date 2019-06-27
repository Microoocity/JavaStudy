package com.icity.javastudy.Demo03Generic;

//测试含有泛型的方法
public class Demo03GeneriMethod {
    public static void main(String[] args) {
        //创建GenericMethod对象
        GenericMethod genericMethod = new GenericMethod();

        //调用含有泛型的方法method01
        //传递什么类型，泛型就是什么类型
        genericMethod.method01("Strting类型");
        genericMethod.method01(123);
        genericMethod.method01(12.3);
        genericMethod.method01(true);

        genericMethod.method02("静态方法，不建议创建对象使用");

        //静态方法：通过类名.方法名(参数)可以直接使用
        GenericMethod.method02("静态方法");
        GenericMethod.method02(123);
    }
}
