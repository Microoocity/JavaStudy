package com.icity.javastudy.Demo21ReverseStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static com.icity.javastudy.common.Common.GBK格式的文本;
import static com.icity.javastudy.common.Common.UTF格式的文本;

/*
    练习：转换文件编码
        将GBK编码的文本文件，转换为UTF-8编码的文本文件

    分析：
        1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称GBK
        2.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称UTF-8
        3.使用InputStreamReader对象中的方法read读取文件
        4.使用OutputStreamWriter对象中的方法write，把读取的数据写入到文件中
        5.释放资源
 */
public class Demo2104Test {
    public static void main(String[] args) throws IOException {
        //1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称GBK
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(GBK格式的文本), "GBK");
        //2.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称UTF-8
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(UTF格式的文本), StandardCharsets.UTF_8);
        //3.使用InputStreamReader对象中的方法read读取文件
        for (int len = 0; (len = inputStreamReader.read()) != -1; ) {
            //4.使用OutputStreamWriter对象中的方法write，把读取的数据写入到文件中
            outputStreamWriter.write(len);
        }
        //5.释放资源
        inputStreamReader.close();
        outputStreamWriter.close();
    }
}
