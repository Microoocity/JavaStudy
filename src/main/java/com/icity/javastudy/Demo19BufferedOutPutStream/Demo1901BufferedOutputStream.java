package com.icity.javastudy.Demo19BufferedOutPutStream;

import java.io.*;

/*
    java.io.BufferedOutputStream extends OutputStream
    BufferedOutputStream:字节缓冲输出流

    继承自父类的共性成员方法：
    void flush() 刷新缓冲输出流
    void write(byte[] b)
    void write(byte[] b, int off, int len) 写 len字节 指定字节数组中的起始偏移 off 这个缓冲输出流
    void write(int b) 将指定的字节写入该缓冲输出流中

    构造方法：
        public BufferedOutputStream(OutputStream out) 创建一个新的缓冲输出流，将数据写入到指定的基本输出流中
        public BufferedOutputStream(OutputStream out, int size)创建一个新的缓冲输出流，用指定的缓冲区大小写数据到指定的基本输出流中
        参数：
            OutputStream out:字节输出流
            可以传递FileOutputStream，缓冲流会给FileOutputStream增加一个缓冲区，提高FileOutputStream的写入效率
            int size:指定缓冲流内部缓冲区的大小，不指定则默认
    操作步骤（重点）
        1.创建FileOutputStream对象，构造方法中绑定要输出的目的地
        2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileOutputStream对象效率
        3.使用BufferedOutputStream对象中的方法write，把数据写入到内部缓冲区中
        4.使用BufferedOutputStream对象中的方法flush，把内部缓冲区的数据，刷新到文件中
        5.释放资源（会先调用flush方法刷新数据，第四步可以省略）
 */
public class Demo1901BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileOutputStream对象，构造方法中绑定要输出的目的地
        FileOutputStream fileOutputStream = new FileOutputStream("src" + File.separator + "com" + File.separator + "icity" + File.separator + "javastudy" + File.separator + "Demo15IO" + File.separator + "icity3.txt");
        //2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileOutputStream对象效率
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        //3.使用BufferedOutputStream对象中的方法write，把数据写入到内部缓冲区中
        bufferedOutputStream.write("把数据写入到内部缓冲区中".getBytes());
        //4.使用BufferedOutputStream对象中的方法flush，把内部缓冲区的数据，刷新到文件中
        bufferedOutputStream.flush();
        //5.释放资源（会先调用flush方法刷新数据，第四步可以省略）
        bufferedOutputStream.close();
    }

}
