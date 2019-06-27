package com.icity.javastudy.Demo11ThreadPool;

public class RunnableImplements1 implements Runnable {
    //2.创建一个类，实现Runnable接口，重写run方法，设置线程任务
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }
}