package com.icity.javastudy.Demo21ReverseStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static com.icity.javastudy.common.Common.utf_8;

/*
    java.io.InputStreamReader extends Reader
    InputStreamReader:是字节流通向字符流的桥梁，它使用指定的charset读取字节并将其解码为字符。（解码：把看不懂的变成能看懂的）

    继承自父类的共性成员方法：
        void close() 关闭流并释放与它相关联的任何系统资源
        int read(char[] cbuf, int off, int len) 将字符读入一个数组的一部分
        int read() 读取单个字符

    构造方法：
        InputStreamReader(InputStream in) 创建一个inputstreamreader使用默认字符集
        InputStreamReader(InputStream in, Charset cs) 创建一个inputstreamreader使用给定的字符集
        InputStreamReader(InputStream in, CharsetDecoder dec) 创建一个inputstreamreader使用给定的字符集解码
        InputStreamReader(InputStream in, String charsetName) 创建一个inputstreamreader使用指定的字符集
        参数：
            InputStream in:字节输入流，用来读取文件中保存的字节
            String charsetName:指定的编码表名称，不区分大小写，可以是utf-8/gbk/......不指定默认使用UTF-8
    使用步骤：
        1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        2.使用InputStreamReader对象中的方法read读取文件
        3.释放资源
    注意事项：
        构造方法中指定的编码表名称要和文件的编码相同，否则会发生乱码
 */
public class Demo2103InputStreamWriter {
    public static void main(String[] args) throws IOException {
        read_utf_8();
        read_GBK();
    }

    /*
        使用InputStreamWriter读取UTF-8格式的文件
     */
    private static void read_utf_8() throws IOException {
        //1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(utf_8), StandardCharsets.UTF_8);
        //2.使用InputStreamReader对象中的方法read读取文件00
        for (int len = 0; (len = inputStreamReader.read()) != -1; ) {
            System.out.print((char) len);
        }
        //3.释放资源
        inputStreamReader.close();
    }

    /*
        使用InputStreamReader读取GBK格式的文件
     */
    private static void read_GBK() throws IOException {
        //1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(utf_8), "GBK");
        //2.使用InputStreamReader对象中的方法read读取文件
        for (int len = 0; (len = inputStreamReader.read()) != -1; ) {
            System.out.print((char) len);
        }
        //3.释放资源
        inputStreamReader.close();
    }
}
