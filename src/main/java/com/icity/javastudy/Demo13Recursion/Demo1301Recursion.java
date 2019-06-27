package com.icity.javastudy.Demo13Recursion;
/*
    递归：方法自己调自己
    递归的分类：直接递归和间接递归
    直接递归称为方法自身调用自己
    间接递归可以称为A方法调用B方法，B调C，C调A
    注意：
        递归要有条件限定，保证递归能停下来，否则会发送栈内存溢出
        构造方法禁止递归
       递归使用前提：当调用方法的时候，方法的主体不变，每次调用方法的参数不同，可以使用递归
 */
public class Demo1301Recursion {
    static int i=0;
    static Demo1301Recursion demo13Recursion = new Demo1301Recursion();
    public static void main(String[] args) {
        demo13Recursion.a();
    }

    /*
        构造方法禁止递归
        编译报错：构造方法是创建对象使用的，一直递归会导致内存中有无数多个对象，直接编译报错
     */
    public Demo1301Recursion() {
        //Demo1301Recursion();
    }

    /*
            递归要有条件限定，保证递归能停下来，否则会发送栈内存溢出
            递归次数太多也会溢出
            Exception in thread "main" java.lang.StackOverflowError
         */
    private void a() {
        i++;
        System.out.println("调用a方法次数:"+i);
        a();
    }
}
