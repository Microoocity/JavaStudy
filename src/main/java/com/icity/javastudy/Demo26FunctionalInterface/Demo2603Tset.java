package com.icity.javastudy.Demo26FunctionalInterface;

/*
    函数式接口的使用：一般可以作为方法的参数和返回值类型
 */
public class Demo2603Tset {
    //定义一个方法，参数使用函数式接口MyFunctionalInterface
    public static void show(Demo2601MyFunctionalInterface myFunctionalInterface){
        myFunctionalInterface.method();
    }

    public static void main(String[] args) {
        //调用show方法，方法的参数是一个接口，所以可以传递接口的实现类对象
        show(new Demo2601MyFunctionalInterFaceImplement());

        //调用show方法，方法的参数是一个接口，所有可以传递接口的匿名内部类
        show(new Demo2601MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        //调用show方法，方法的参数是一个函数式接口，所以可以Lambda表达式
        show(()-> {
            System.out.println("使用Lambda表达式重写接口中的抽象方法");
        });

        //简化Lambda表达式
        show(()-> System.out.println("使用Lambda表达式重写接口中的抽象方法"));

    }

}
