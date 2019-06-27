package com.icity.javastudy.Demo19BufferedOutPutStream;

import java.io.*;

/*
    java.io.BufferedInputStream extends InputStream
    BufferedInputStream:字节缓冲输入流

    继承自父类的成员方法:
        int read() 从输入流中读取数据的下一个字节
        int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储至缓冲区数组b中。
        void close() 关闭此输入流并释放与该流关联的所有系统资源

    构造方法：
        BufferedInputStream(InputStream in) 创建一个 BufferedInputStream和保存它的参数 输入流 in
        BufferedInputStream(InputStream in, int size) 创建一个具有指定的缓冲区大小 BufferedInputStream，并保存它的参数，输入流 in
        参数：
            InputStream in:字节输入流
                可以传递FileOutputStream，缓冲流会给FileOutputStream增加一个缓冲区，提高FileOutputStream的写入效率
            int size:指定缓冲流内部缓冲区的大小，不指定则默认

        使用步骤(重点)：
            1.创建FileInputStream对象，构造方法中绑定要读取的数据源
            2.创建BufferedInputStream对象，构造方法中传递FileInputStream对象，提高FileInputStream对象的读取效率
            3.使用BufferedInputStream对象中的方法read，读取文件
            4.释放资源
 */
public class Demo1902BufferedInputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fileInputStream = new FileInputStream("src" + File.separator + "com" + File.separator + "icity" + File.separator + "javastudy" + File.separator + "Demo15IO" + File.separator + "icity2.txt");
        //2.创建BufferedInputStream对象，构造方法中传递FileInputStream对象，提高FileInputStream对象的读取效率
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        //3.使用BufferedInputStream对象中的方法read，读取文件
        for (int len = 0;/*记录每次读取到的字节*/ (len = bufferedInputStream.read()) != -1; ) {
            System.out.println(len);
        }

        //int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储至缓冲区数组b中。
        byte[] bytes = new byte[1024]; // 存储每次读取的数据
        int len = 0; // 记录每次读取的有效字节个数
        for (len = 0; (len = bufferedInputStream.read(bytes)) != -1; ) {
            System.out.println(new String(bytes, 0, len));
        }

        //4.释放资源
        bufferedInputStream.close();
    }
}
