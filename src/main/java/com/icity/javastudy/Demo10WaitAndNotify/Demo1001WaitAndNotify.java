package com.icity.javastudy.Demo10WaitAndNotify;

/*
    等待唤醒案例：线程之间的通信
        创建一个顾客线程（消费者）：告知老板要的包子的种类和数量，调用wait方法，放弃cpu的执行，进入到waiting状态（无限等待）
        创建一个老板线程（生产者）：做好包子后，调用notify方法，唤醒顾客吃包子

     注意：顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
           同步使用的锁对象必须保证唯一
           只有锁对象才能调用wait和notify方法

     Object()类中的方法
     void wait()
        其他线程调用此对象的notify()方法或notify()方法前，导致当前线程等待
     void notify()
        唤醒在此对象监视器上的单个线程
        会继续执行wait方法之后的代码
 */
public class Demo1001WaitAndNotify {

    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object object = new Object();
        //创建一个顾客线程（消费者）
        new Thread() {
            @Override
            public void run() {
                //保证等待和唤醒的线程只能一个执行，需要同步技术
                synchronized (object) {
                    System.out.println("告知老板要的包子的种类和数量");
                    //调用wait方法，放弃cpu的执行，进入到waiting状态无限等待
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("包子已经做好了，开吃");
                }
            }
        }.start();

        //创建一个老板线程（生产者）
        new Thread(){
            @Override
            public void run() {
                //花3秒时间做包子
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object){
                    System.out.println("老板花3秒钟做好包子，告知顾客，可以吃包子了");
                    //做好包子后，调用notify方法，唤醒顾客吃包子
                    object.notify();
                }
            }
        }.start();
    }

}
