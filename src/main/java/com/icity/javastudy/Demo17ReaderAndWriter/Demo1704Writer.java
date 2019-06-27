package com.icity.javastudy.Demo17ReaderAndWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    字符输出流写数据的其他方法
        void write(char[] cbuf, int off, int len) 写入字符数组的某一部分，off数组的开始索引，len写的字符个数
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的某一部分，off数组的开始索引，len写的字符个数
        void write(String str) 写入字符串
        void write(String str, int off, int len) 写入字符串的某一部分，off字符串开始索引，len写的字符个数
 */
public class Demo1704Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src" + File.separator + "com" + File.separator + "icity" + File.separator + "javastudy" + File.separator + "Demo15IO" + File.separator + "icity2.txt");
        char[] cs = {'a', 'b', 'c', 'd', 'e'};
        //void write(char[] cbuf) 写入字符数组
        fileWriter.write(cs); // abcde

        //void write(char[] cbuf, int off, int len) 写入字符数组的某一部分，off数组的开始索引，len写的字符个数
        fileWriter.write(cs, 0, 3); //abc

        //void write(String str) 写入字符串
        fileWriter.write("icity2");

        //void write(String str, int off, int len) 写入字符串的某一部分，off字符串开始索引，len写的字符个数
        fileWriter.write("icity2", 2, 3);

        fileWriter.close();
    }
}
