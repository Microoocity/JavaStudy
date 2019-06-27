package com.icity.javastudy.Demo06Thread;

public class Demo0602SetThreadName {

    public static void main(String[] args) {
        //开启多线程
        MyThread myThread = new MyThread();
        myThread.setName("线程名称icity1");
        myThread.start();

        //开启多线程
        new MyThread("icity2").start();
    }

}