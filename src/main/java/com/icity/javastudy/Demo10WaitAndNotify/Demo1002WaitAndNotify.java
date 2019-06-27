package com.icity.javastudy.Demo10WaitAndNotify;

/*
    进入TimeWaiting(计时等待)有2种方式
    1.使用sleep(long m)方法，在毫秒值结束后，线程睡醒进入到Runnable/Blocked状态
    2.使用wait(long m)方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来，线程睡醒进入到Runnable/Blocked状态

    唤醒的方法：
        1.void notify() 唤醒在此对象监视器上等待的单个线程
        2.void notifyAll() 唤醒在此对象监视器上等待的所有线程。
 */
public class Demo1002WaitAndNotify {

    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object object = new Object();
        //创建一个顾客线程（消费者）
        while (true) {
            new Thread() {
                @Override
                public void run() {
                    //保证等待和唤醒的线程只能一个执行，需要同步技术
                    synchronized (object) {
                        System.out.println("告知老板要的包子的种类和数量");
                        //调用wait方法，放弃cpu的执行，进入到waiting状态无限等待
                        try {
                            object.wait(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了，开吃");
                    }
                }
            }.start();
        }
    }

}
