package com.icity.javastudy.Demo09Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    卖票案例出现了线程安全的问题
    卖出不存在的票和重复的票

    方案之一：使用Lock锁
    Lock提供了比synchronized方法/语句更广泛的锁定操作
    Lock接口中的方法：
        void lock() 获取锁
        void unlock() 释放锁

    使用步骤：
        1.在成员位置创建一个ReentrantLock对象
        2.在可能会出现安全问题的代码前调用lock接口中的方法lock获取锁
        3.在可能会出现安全问题的代码后调用lock接口中的方法unlock释放锁
 */
public class RunnableImplements1 implements Runnable {

    //定义一个多线程共享的票源
    private int ticket = 100;

    //1.在成员位置创建一个ReentrantLock对象
    Lock lock = new ReentrantLock();

    //设置线程任务：卖票
    @Override
    public void run() {

        while (true) {

            //2.在可能会出现安全问题的代码前调用lock接口中的方法lock获取锁
            lock.lock();

            //先判断票是否存在
            if (ticket > 0) {
                try {
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                }catch (Exception e){

                }finally {
                    //3.在可能会出现安全问题的代码后调用lock接口中的方法unlock释放锁
                    lock.unlock();
                }
            }
        }
    }
}
