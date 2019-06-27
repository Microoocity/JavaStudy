package com.icity.javastudy.Demo16InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    java.io.InputStream:字节输入流
    此抽象类是表示字节输入流的所有类的超类

    定义了所有子类共性的方法：
        int read():从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
        int read(byte[] b):从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
        void close():关闭此输入流并释放与该流关联的所有系统资源

    java.io.FileInputStream extends InputStream
    FileInputStream:文件字节输入流
    作用：把硬盘文件中的数据，读取到内存中使用

    构造方法:
        FileInputStream(String name)
        FIleInputStream(File file)
        参数：读取文件的数据源
            String name:文件的路径
            File file:文件
        构造方法的作用：
            1.会创建一个FileInputStream对象
            2.会把FileInputStream对象指定的构造方法中要读取的文件

    读取数据的原理(硬盘-->内存)
        java程序-->JVM-->OS-->OS读取数据的方法-->读取文件

    字节输入流的使用步骤(重点):
        1.创建FileInputStream对象，构造方法中绑定要读取的数据源
        2.使用FileInputStream对象中的方法read读取文件
        3.释放资源
 */
public class Demo1601InputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fileInputStream = new FileInputStream("src" + File.separator + "com" + File.separator + "icity" + File.separator + "javaStudy" + File.separator + "Demo15IO" + File.separator + "icity.txt");
        //2.使用FileInputStream对象中的方法read读取文件
        //int read()读取文件中的一个字节并返回，读取到文件的末尾返回-1
        int len = fileInputStream.read();
        System.out.println(len);

        /*
        int len2 = fileInputStream.read();
        System.out.println(len2);
         */

        //使用while循环读取
        int len3 = 0;
        while ((len3 = fileInputStream.read()) != -1) {
            System.out.println(len3);
            System.out.println((char) len3);
        }
        //固定写法，必须用变量接收读取到的数据

        while(fileInputStream.read()!=-1){
            System.out.println(fileInputStream.read());
        }
        //fileInputStream.read()读取了2次，故不行；read函数读一次移一位

        //3.释放资源
        fileInputStream.close();
    }
}
