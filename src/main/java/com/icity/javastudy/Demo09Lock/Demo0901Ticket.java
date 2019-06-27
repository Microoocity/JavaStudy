package com.icity.javastudy.Demo09Lock;

/*
    模拟卖票案例
    创建3个线程，同时开启，共享票源出售
 */
public class Demo0901Ticket {

    public static void main(String[] args) {
        //创建runnable接口的实现类对象
        RunnableImplements1 runnableImplements1 = new RunnableImplements1();
//        RunnableImplements2 runnableImplements2 = new RunnableImplements2();
        System.out.println("runnableImplements1:"+runnableImplements1);
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread thread0 = new Thread(runnableImplements1);
        Thread thread1 = new Thread(runnableImplements1);
        Thread thread2 = new Thread(runnableImplements1);
        //调用start方法开启多线程
        thread0.start();
        thread1.start();
        thread2.start();
    }

}
