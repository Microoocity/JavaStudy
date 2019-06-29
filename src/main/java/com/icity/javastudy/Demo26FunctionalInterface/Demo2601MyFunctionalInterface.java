package com.icity.javastudy.Demo26FunctionalInterface;

/*
    函数式接口：有且只有一个抽象方法的接口
    接口中可以包含其他方法（默认方法，静态方法，私有方法）
 */

/*
    @FunctionalInterface注解作用：
        是：编译成功
        否：编译失败（接口中没有抽象方法，or抽象方法的个数多于一个）
 */
@FunctionalInterface
public interface Demo2601MyFunctionalInterface {
    //定义一个抽象方法
    public abstract void method();

    //有2个抽象方法则不是函数式接口
//    void method2();
    String toString();
}
