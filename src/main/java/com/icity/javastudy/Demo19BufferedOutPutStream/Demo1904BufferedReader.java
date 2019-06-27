package com.icity.javastudy.Demo19BufferedOutPutStream;

import java.io.*;

import static com.icity.javastudy.common.Common.ICITY3;

/*
    java.io.BufferedReader

    继承自父类的共性成员方法：
        void close() 关闭流并释放与它相关联的任何系统资源
        int read(char[] cbuf, int off, int len) 将字符读入一个数组的一部分
        int read() 读取单个字符

    构造方法：
        BufferedReader(Reader in, int sz) 创建一个使用指定大小的输入缓冲区的缓冲字符输入流
        BufferedReader(Reader in) 创建一个使用默认大小输入缓冲区的缓冲字符输入流
        参数：
            Reader in:字符输入流
                可以传递FileReader，缓冲流会给FileReader增加一个缓冲区，提高FileReader的读取效率

    特有的成员方法：
        String readLine() 读取一个文本行，读取一行数据
            行的终止符号：通过下列字符之一即可认为某行已终止；换行('\n')、回车('\r')或回车后直接跟着换行(\r\n)。
        返回值：
            包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回null

    使用步骤：
        1.创建字符缓冲输入流对象，构造方法中传递字符输入流
        2.使用字符缓冲输入流对象中的方法read/readline读取文本
        3.释放资源
 */
public class Demo1904BufferedReader {
    public static void main(String[] args) throws IOException {
        //1.创建字符缓冲输入流对象，构造方法中传递字符输入流
        BufferedReader bufferedReader = new BufferedReader(new FileReader(ICITY3));

        //2.使用字符缓冲输入流对象中的方法read/readline读取文本
        String line = bufferedReader.readLine();
        System.out.println(line);

        //循环不断读取
        for (String line2 = bufferedReader.readLine(); (line = bufferedReader.readLine()) != null; ) {
            System.out.println(line2);
        }

        //3.释放资源
        bufferedReader.close();
    }
}
