package com.icity.javastudy.Demo06Thread;

public class Demo0601GetThreadName {

    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread myThread = new MyThread();
        //调用start方法开启新线程，执行run方法
        myThread.start();

        new MyThread().start();
    }

}
