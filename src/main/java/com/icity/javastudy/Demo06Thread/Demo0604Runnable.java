package com.icity.javastudy.Demo06Thread;

/*
    创建多线程的第二种方式：实现Runnable接口
    Thread类的构造方法：
        Thread(Runnable target)分配新的Thread对象.
        Thread(Runnable target, String name)分配新的Thread对象.

    实现步骤：
        1.创建新的Runnable接口的实现类；
        2.再实现类中重写Runnable接口的 run方法，设置线程任务；
        3.创建一个Runnable接口的实现类对象；
        4.创建Thread类对象，构造方法中传递Runnable接口的实现对象；
        5.调用Thread类中的start方法，开启新的线程执行run方法；

    实现Runnable接口创建多线程程序的好处：
        1.避免了单继承的局限性
            一个类只能继承自一个类，继承Thread类同理；
            实现Runnable接口，还可继承自其他的类，实现其他的接口；
        2.增强程序扩展性，降低程序耦合性（解耦）
            实现Runnable接口的方式，把设置线程任务和开启新线程进行了分离（解耦）；
            实现类中，重写了run方法，用来设置线程任务；
            创建Thread类对象，调用start方法，用来开启新线程；
*/
public class Demo0604Runnable {

    //3.创建一个Runnable接口的实现类对象
    private static RunnableImplements1 runnableImplements1 = new RunnableImplements1();
    private static RunnableImplements2 runnableImplements2 = new RunnableImplements2();

    //4.创建Thread类对象，构造方法中传递Runnable接口的实现对象
    private static Thread thread = new Thread(runnableImplements1);
    private static Thread thread2 = new Thread(runnableImplements2); // 打印"HelloWorld"

    public static void main(String[] args) {

        thread.start();

        thread2.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }

}
