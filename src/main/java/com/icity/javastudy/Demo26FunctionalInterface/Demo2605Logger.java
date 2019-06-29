package com.icity.javastudy.Demo26FunctionalInterface;

/*
    使用Lambda优化日志案例
    Lambda特点：延迟加载
    Lambda的使用前提：必须存在函数式接口
 */
public class Demo2605Logger {
    //定义一个显示日志的方法，方法的参数传递日志的等级和MessageBuilder接口
    public static void showLog(int level, Demo2605MessageBuilder messageBuilder) {
        //对日志的等级进行判断，如果是一级，则调用MessageBuilder接口中的MessageBuilder接口中的builderMessage方法
        if (level == 1) {
            System.out.println(messageBuilder.builderMessage());
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        //调用showLog方法，参数MessageBuilder是一个函数式接口，所以可以传递Lambda表达式
        showLog(1, () -> {
            System.out.println("不满足条件不执行");
            //返回一个拼接好的字符串
            return msg1 + msg2 + msg3;
        });

        /*
            使用Lambda表达式作为参数传递，仅仅把参数传递到showLog方法中
            只有满足条件，日志的等级是一级，才会调用接口MessageBuilder中的方法builderMessage
            才会进行字符串的拼接
            若条件不满足，日志的等级不是一级，那么MessageBuilder接口中的方法builderMessage不会执行
            故拼接字符串的代码不会执行
         */
    }

}
