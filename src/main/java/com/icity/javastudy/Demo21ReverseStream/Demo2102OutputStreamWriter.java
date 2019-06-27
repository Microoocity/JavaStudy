package com.icity.javastudy.Demo21ReverseStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

import static com.icity.javastudy.common.Common.utf_8;

/*
    java.io.OutputStreamWriter extends Writer
    OutputStreamWriter:是字符流通向字节流的桥梁，可使用指定的charset将要写入流中的字符编码成字节。（编码：把能看懂的变成看不懂的）

    继承自父类的共性成员方法：
        void close() 关闭流，冲洗它
        void flush() 冲流
        void newLine() 写行分隔符
        void write(char[] cbuf, int off, int len) 写入一个字符数组的一部分
        void write(int c) 写一个字符
        void write(String s, int off, int len) 写入字符串的一部分

    构造方法：
        OutputStreamWriter(OutputStream out) 创建一个outputstreamwriter使用默认的字符编码
        OutputStreamWriter(OutputStream out, Charset cs) 创建一个outputstreamwriter使用给定的字符集
        OutputStreamWriter(OutputStream out, CharsetEncoder enc) 创建一个outputstreamwriter使用给定的字符集编码
        OutputStreamWriter(OutputStream out, String charsetName) 创建一个outputstreamwriter使用指定的字符集
        参数：
            OutputStream out:字节输出流，可以用来写转换之后的字节到文件中
            String charsetName:指定的编码表名称，不区分大小写，可以是utf-8/gbk/......不指定默认使用UTF-8

    使用步骤：
        1.创建OutputStreamWriter对象：构造方法中传递字节输出流和指定的编码表名称
        2.使用OutputStreamWriter对象中的方法write，把字符转换为字节存储到缓冲区中（编码）
        3.使用OutputStreamWriter对象中的方法flush，把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
        4.释放资源
 */
public class Demo2102OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        write_utf_8();
    }

    /*
        使用转换流OutputStreamWriter写UTF-8格式的文件
     */
    private static void write_utf_8() throws IOException {
        //1.创建OutputStreamWriter对象：构造方法中传递字节输出流和指定的编码表名称
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(utf_8), StandardCharsets.UTF_8);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(utf_8), "GBK");
        //2.使用OutputStreamWriter对象中的方法write，把字符转换为字节存储到缓冲区中（编码）
        outputStreamWriter.write("你好");
        //3.使用OutputStreamWriter对象中的方法flush，把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
        outputStreamWriter.flush();
        //4.释放资源
        outputStreamWriter.close();
    }
}
