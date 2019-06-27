package com.icity.javastudy.Demo03Generic;

//定义含有泛型的方法
//格式：
//  修饰符<泛型> 返回值类型 方法名(参数列表(使用泛型)) {
//      方法体；
//  }
//含有泛型的方法，在调用方法的时候确定泛型的数据类型，泛型取决于传递参数的类型
public class GenericMethod {

    //含有泛型的方法
    public <M> void method01(M m) {
        System.out.println(m);
    }

    //含有泛型的静态方法
    public static <S> void method02(S s) {
        System.out.println(s);
    }

}
