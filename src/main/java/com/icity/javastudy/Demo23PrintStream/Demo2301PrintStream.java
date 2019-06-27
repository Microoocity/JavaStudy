package com.icity.javastudy.Demo23PrintStream;

import com.icity.javastudy.common.Common;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/*
    java.io.PrintStream:打印流
        PrintStream 为其他输出流增加了功能，使他们能够方便的打印各种数据值表示形式
    PrintStream特点：
        1.只负责数据的输出，不负责数据的读取
        2.与其他输出流不同，PrintStream永远不会抛出 IOException
        3.特有的方法：print,println
    构造方法：
        1.PrintStream(File file):输出的目的地是一个文件
        2.PrintStream(OutputStream out):输出目的地是一个字节输出流
        3.PrintStream(String fileName):输出的目的地是一个文件路径
    PrintStream extends OutputStream
    继承自父类的共性成员方法：
        void close() 关闭流，冲洗它
        void flush() 冲流
        void write(byte[] b, int off, int len) 写入一个字符数组的一部分
        void write(byte[] b) 写一个字符
        void write(int b) 写入字符串的一部分
    注意：
        如果使用继承自父类的write方法写数据，查看数据的时候会查询编码表
        若使用特有方法print/println方法写数据，写的数据原样输出
 */
public class Demo2301PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println("HelloWorld");

        //创建打印流PrintStream对象，构造方法中绑定要输出的目的地
        PrintStream printStream = new PrintStream(Common.Person);
        //如果使用继承自父类的write方法写数据，查看数据的时候会查询编码表
        printStream.write(97);

        //释放资源
        printStream.close();
    }
}
