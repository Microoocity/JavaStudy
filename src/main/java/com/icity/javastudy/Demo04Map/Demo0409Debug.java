package com.icity.javastudy.Demo04Map;

//可以让代码逐行执行，查看代码的执行过程，调式过程中出现的bug
//使用方式：添加断点至每个方法的第一行，或哪里有bug，添加至哪里
//F8:逐行执行程序
//F7：进入至方法中
//shift+F8：跳出方法
//f9：跳至下个断点，若无则中止程序
//Ctrl+f2:退出debug模式，停止程序
public class Demo0409Debug {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }

}
