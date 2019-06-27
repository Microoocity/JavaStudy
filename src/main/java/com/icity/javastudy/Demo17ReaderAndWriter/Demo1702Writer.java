package com.icity.javastudy.Demo17ReaderAndWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.Writer:字符输出流，所有字符输出流最顶层的父类，是一个抽象类

    共性的成员方法：
        void write(int c):写一个字符
        void write(char[] cbuf):写一个字符数组
        abstract void write(char[] cbuf, int off, int len):写入一个字符数组的一部分
        void write(String str):写一个字符串
        void write(String str, int off, int len):写入字符串的一部分
        abstract void flush():冲流
        abstract void close():关闭流，冲洗它

    java.io.FileWriter extends OutputStreamWriter extends Writer
    FileWriter:文件字符输出流
    作用:把内存中字符数据写入到文件中

    构造方法:
        FileWriter(File file):根据指定的File对象构造一个FileWriter对象
        FileWriter(String fileName):根据指定的文件名构造一个FileWriter对象
        参数:写入数据的目的地
            String fileName:文件的路径
            File file:是一个文件
        构造方法的作用:
            1.会创建一个FileWriter对象
            2.会根据构造方法中传递的文件/文件的路径，创建文件
            3.会把FileWriter对象指向创建好的文件

     字符输出流的使用步骤(重点):
        1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
        2.使用FileWriter中的方法write，把数据写入到内存缓冲区中(字符转换为字节的过程)
        3.使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中
        4.释放资源(会先把内存缓冲区中的数据刷新到文件中)
 */
public class Demo1702Writer {
    public static void main(String[] args) throws IOException {
        //1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
        FileWriter fileWriter = new FileWriter("src" + File.separator + "com" + File.separator + "icity" + File.separator + "javastudy" + File.separator + "Demo15IO" + File.separator + "icity2.txt");
        //2.使用FileWriter中的方法write，把数据写入到内存缓冲区中(字符转换为字节的过程)
        //指定的字节输出流
        fileWriter.write(97); // a
        //3.使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中
        fileWriter.flush();
        //4.释放资源(会先把内存缓冲区中的数据刷新到文件中)
        fileWriter.close();
    }
}
