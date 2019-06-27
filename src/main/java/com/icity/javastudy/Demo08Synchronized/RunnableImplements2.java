package com.icity.javastudy.Demo08Synchronized;
/*
    卖票案例出现了线程安全的问题
    卖出不存在的票和重复的票

    方案之一：使用同步方法
    步骤：
        1.把访问了共享数据的代码抽取出来，放到一个方法中
        2.在方法上添加synchronized修饰符

     格式：定义方法的格式
     修饰符 synchronized 返回值类型 方法名 （参数列表） {
        可能会出现线程安全问题的代码（访问共享数据的代码）
     }

 */
public class RunnableImplements2 implements Runnable {

    //定义一个多线程共享的票源
    private /*static*/ int ticket = 100;

    //创建一个锁对象
    Object object = new Object();

    //设置线程任务：卖票
    @Override
    public void run() {

        System.out.println("this:"+this);

        while (true) {
           /* //程序睡眠10毫秒：为了安全
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            payTicket();
        }
    }

    /*  定义一个同步方法
        同步方法也会把方法内部的代码锁住，只让一个线程执行
        同步方法的锁对象是实现类对象 new RunnableImplements2()，也就是this
     */
    public synchronized void payTicket(){
            //先判断票是否存在
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;
            }
    }

    /*
        方法之一：静态方法
        锁对象不是this，this是创建对象后产生的，静态方法优先于对象
        静态方法的锁对象是本类的class属性-->class文件对象（反射）
     */
    /*public static synchronized void payTicketStatic(){
        //先判断票是否存在
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
            ticket--;
        }
    }*/
}

