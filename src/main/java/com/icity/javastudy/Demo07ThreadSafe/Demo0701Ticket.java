package com.icity.javastudy.Demo07ThreadSafe;

/*
    模拟卖票案例
    创建3个线程，同时开启，共享票源出售
 */
public class Demo0701Ticket {

    public static void main(String[] args) {
        //创建runnable接口的实现类对象
        RunnableImplements1 runnableImplements1 = new RunnableImplements1();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread thread0 = new Thread(runnableImplements1);
        Thread thread1 = new Thread(runnableImplements1);
        Thread thread2 = new Thread(runnableImplements1);
        Thread thread3 = new Thread(runnableImplements1);
        Thread thread4 = new Thread(runnableImplements1);
        Thread thread5 = new Thread(runnableImplements1);
        Thread thread6 = new Thread(runnableImplements1);
        Thread thread7 = new Thread(runnableImplements1);
        Thread thread8 = new Thread(runnableImplements1);
        Thread thread9 = new Thread(runnableImplements1);
        Thread thread10 = new Thread(runnableImplements1);
        Thread thread11 = new Thread(runnableImplements1);
        Thread thread12 = new Thread(runnableImplements1);
        Thread thread13 = new Thread(runnableImplements1);
        Thread thread14 = new Thread(runnableImplements1);
        Thread thread15 = new Thread(runnableImplements1);
        Thread thread16 = new Thread(runnableImplements1);

        //调用start方法开启多线程
        thread0.start();
        thread1.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        thread11.start();
        thread12.start();
        thread13.start();
        thread14.start();
        thread15.start();
        thread16.start();
    }

}
