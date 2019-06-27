package com.icity.javastudy.Demo06Thread;

public class Demo0603Sleep {

    public static void main(String[] args) {
        //模拟秒表
        for (int i = 20; i >= 0; i--) {
            System.out.println(i);

            //使用Thread类的sleep方法让程序睡眠1秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
