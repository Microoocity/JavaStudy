package com.icity.javastudy.Demo15OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    一次写多个字节的方法：
        public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流
        public void write(byte[] b, int off, int len):从指定的字节数组写入len字节，从偏移量off开始输出到此输出流。
 */
public class Demo1502OutputStream {
    public static void main(String[] args) throws IOException {
        //创建FileOutputStream对象，构造方法中绑定要写入数据的目的地
        FileOutputStream fileOutputStream = new FileOutputStream("src" + File.separator + "com" + File.separator + "icity" + File.separator + "javaStudy" + File.separator + "Demo15IO" + File.separator + "icity.txt");
        //调用FileOuputStream对象中的方法write,把数据写入到文件中
        //eg:在文件中显示100，写3个字节
        fileOutputStream.write(49); // 1
        fileOutputStream.write(48); // 0
        fileOutputStream.write(48); // 0

        /*
            public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流
            一次写多个字节：
                如果写的第一个字节是正数(0-127)，那么显示的时候会查询ASCII表
                如果写的第一个字节是负数，那第一个字节会和第二个字节，两个字节组成一个中文显示，查询系统默认码表(GBK)
         */
        byte[] bytes = {65,66,67,68,69}; // ABCDE
        byte[] bytes2 = {-65,-66,-67,68,69}; // 烤紻
        fileOutputStream.write(bytes);
        fileOutputStream.write(bytes2);

        /*
            public void write(byte[] b, int off, int len):把字节数组的一部分写入到文件中
                int off:数组开始的索引
                int len:写几个字节
         */
        fileOutputStream.write(bytes,1,2);

        /*
            写入字符的方法：可以使用String类中的方法把字符串转换为字节数组
                byte[] getBytes 把字符串转换为字节数组
         */
        byte[] bytes3 = "你好".getBytes();
        System.out.println(bytes3);
        fileOutputStream.write(bytes3);

        fileOutputStream.close();
    }
}
