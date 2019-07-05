package com.icity.javastudy.Demo31Annotation;

/**
 * @author icity
 * @description 注解演示
 * @date 2019/7/2 19:47
 **/

/*
    注解作用：
        1.编写文档：通过代码中标识的注解生成文档(生成doc文档)
        2.代码分析：通过代码中标识的注解对代码进行分析(使用反射)
        3.编译检查：通过代码里标识的注解让编译器实现基本的编译检查(Override)

    JDK中预定义的一些注解
        @Override:检测被该注解标注的方法是否继承自父类(接口)
        @Deprecated:该注解标注的内容表示已过时
        @SuppressWarnings:压制警告,传递参数all

    自定义注解内容：
    格式：
        元注解
        public @interface 注解名称 {}
    本质(javap:反编译)：
        public interface XXX extends java.lang.annotation.Annotation {}
        本质上是一个接口，改接口默认继承java.lang.annotation.Annotation
    属性：
        接口中可以定义的成员方法
 */
@SuppressWarnings("all")
public class Demo3101Annotation {

    //计算2数的和
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void showTest1(){
        //过时
    }

    public void showTest2(){
        //替代showTest1方法
    }

    //todo：注解 未完成

}
