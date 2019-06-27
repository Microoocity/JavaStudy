package com.icity.javastudy.Demo16InputStream;

import java.io.*;

/*
    文件的复制练习

    数据源:c:\\IdeaWorkSpace\\icity\\JavaStudy\\src\\com\\icity\\javastudy\\Demo16InputStream\\Demo1601InputStream.java
    目的地:c:\\C:\\IdeaWorkSpace\\icity\\JavaStudy\\src\\com\\icity\\javastudy\\Demo15IO

    文件复制的步骤：
        1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
        2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
        3.使用字节输入流对象中的方法read读取文件
        4.使用字节输出流的方法write，把读取到的字节写入到目的地文件中
        5.释放资源
 */
public class Demo1603CopyFile {
    public static void main(String[] args) throws IOException {

        long i = 0;

        //1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fileInputStream = new FileInputStream("src" + File.separator + "com" + File.separator + "icity" + File.separator + "javastudy" + File.separator + "Demo16InputStream" + File.separator + "Demo1601InputStream.txt");
        //2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fileOutputStream = new FileOutputStream("src" + File.separator + "com" + File.separator + "icity" + File.separator + "javaStudy" + File.separator + "Demo15IO" + File.separator + "Demo1601InputStream.txt");
        //一次读取一个字节写入一个字节的方式

        long start1 = System.currentTimeMillis();

        //3.使用字节输入流对象中的方法read读取文件
        for (int len = 0; (len = fileInputStream.read()) != -1; ) {
            //4.使用字节输出流的方法write，把读取到的字节写入到目的地文件中
            fileOutputStream.write(len);

            i++;
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println("");
            }
        }

        long end1 = System.currentTimeMillis();
        System.out.println("字节流复制程序耗时" + (end1 - start1) + "ms");

        long start2 = System.currentTimeMillis();
        //每次读取一个字节太慢，使用数组缓冲流读取写入多个字节
        byte bytes1[] = new byte[1024];
        for (int len = 0; (len = fileInputStream.read(bytes1)) != -1; ) {
            fileOutputStream.write(bytes1, 0, len);
        }

        long end2 = System.currentTimeMillis();
        System.out.println("字符流复制程序耗时" + (end2 - start2) + "ms");

        //5.释放资源(先关写，再关读；写完一定读完)
        fileOutputStream.close();
        fileInputStream.close();
    }
}
