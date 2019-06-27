package com.icity.javastudy.Demo19BufferedOutPutStream;

import java.io.*;

/*
    java.io.BufferedWriter extends Writer
    BufferedWriter:字符缓冲输出流，是所有字符输出流的最顶层的父类，是一个抽象类

    共性的成员方法：
        void close() 关闭流，冲洗它
        void flush() 冲流
        void newLine() 写行分隔符
        void write(char[] cbuf, int off, int len) 写入一个字符数组的一部分
        void write(int c) 写一个字符
        void write(String s, int off, int len) 写入字符串的一部分

    构造方法：
        BufferedWriter(Writer out) 创建一个使用默认大小输出缓冲区的缓冲字符输出流
        BufferedWriter(Writer out, int sz) 创建一个新的缓冲字符输出流，该流使用给定大小的输出缓冲区
        参数：
            Writer out:字符输出流，可以传递FileWriter，缓冲流会给FileWriter增加一个缓冲区，提高FileWriter的写入效率
            int sz:指定缓冲区的大小，不写默认大小

    特有的成员方法：
        void newLine() 写行分隔符。会根据不同的操作系统，获取不同的行分隔符
    使用步骤：
        1.创建字符缓冲输出流对象，构造方法中传递字符输出流
        2.调用字符缓冲输出流中的方法write，把数据写入到内存缓冲区中
        3.调用字符缓冲输出流中的方法flush，把内存缓冲区中的数据，刷新到文件中
        4.释放资源
 */
public class Demo1903BufferedWriter {
    public static void main(String[] args) throws IOException {
        //1.创建字符缓冲输出流对象，构造方法中传递字符输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src" + File.separator + "com" + File.separator + "icity" + File.separator + "javastudy" + File.separator + "Demo15IO" + File.separator + "icity3.txt"));
        //2.调用字符缓冲输出流中的方法write，把数据写入到内存缓冲区中
        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("icity05");
//            bufferedWriter.write("\r\n");
            bufferedWriter.newLine();
        }
        //3.调用字符缓冲输出流中的方法flush，把内存缓冲区中的数据，刷新到文件中
        bufferedWriter.flush();

        //4.释放资源
        bufferedWriter.close();
    }
}
