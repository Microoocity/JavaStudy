package com.icity.javastudy.Demo06Thread;

//创建一个Runnable接口的实现类
public class RunnableImplements1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread());
        }
    }
}
