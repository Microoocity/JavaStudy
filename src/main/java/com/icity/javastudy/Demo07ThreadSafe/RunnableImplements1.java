package com.icity.javastudy.Demo07ThreadSafe;

/*
    实现卖票案例
 */
public class RunnableImplements1 implements Runnable {

    //定义一个多线程共享的票源
    private int ticket = 1600;

    //设置线程任务：卖票
    @Override
    public void run() {
        //先判断票是否存在
        while (true) {

            /*//程序睡眠10毫秒：为了安全
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
