package com.icity.javastudy.Demo08Synchronized;

/*
    卖票案例出现了线程安全的问题
    卖出不存在的票和重复的票

    方案之一：使用同步代码块
    格式：
        synchronized(锁对象){
            可能会出现线程安全问题的代码（访问共享数据的代码）
        }

     注意：
        1.通过代码块中的锁对象，可以使用任意对象
        2.但必须保证多个线程使用的锁对象是同一个
        3.锁对象作用：
            把同步代码块锁住，只让一个线程在同步代码块中执行

 */
public class RunnableImplements1 implements Runnable {

    //定义一个多线程共享的票源
    private int ticket = 100;

    //创建一个锁对象
    Object object = new Object();

    //设置线程任务：卖票
    @Override
    public void run() {

        while (true) {
           /* //程序睡眠10毫秒：为了安全
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            synchronized (object) {
                //先判断票是否存在
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                }
            }

        }
    }
}
