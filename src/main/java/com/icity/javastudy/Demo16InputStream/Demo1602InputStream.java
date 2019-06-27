package com.icity.javastudy.Demo16InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    字节输入流一次读取多个字节的方法：
        int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
        1.方法的参数byte[]的作用?
            缓冲作用，存储每次读取到的多个字节
            数组的长度一般定义为1024(1kb)或1024的整数倍
        2.方法的返回值int是什么?
            每次读取到的有效字节个数

    String类的构造方法：
        String(byte[] bytes):把字节数组转换为字符串
        String(byte[] bytes, int offset, int length):把字节数组的一部分转换为字符串 offset:数组的开始索引 length:转换的字节个数
 */
public class Demo1602InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src" + File.separator + "com" + File.separator + "icity" + File.separator + "javaStudy" + File.separator + "Demo15IO" + File.separator + "icity.txt");
        //使用FileInputStream对象中的方法read读取文件
        //int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中。
        byte[] bytes1 = new byte[20];
        int len = fileInputStream.read(bytes1);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes1));

        System.out.println(new String(bytes1));

        /*
            可以使用循环优化，不知文件中有多少字节，故用while循环，读取到-1结束
         */
        byte[] bytes2 = new byte[1024];
        int len2 = 0; // 记录每次读取的有效字节个数
        while ((len2 = fileInputStream.read(bytes2)) != -1) {
            System.out.println(bytes2);
            System.out.println(new String(bytes2, 0, len2)); // 转换有效位置成为字符串
        }

        //释放资源
        fileInputStream.close();
    }
}
