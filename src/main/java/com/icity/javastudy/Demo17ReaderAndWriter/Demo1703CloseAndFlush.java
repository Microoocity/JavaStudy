package com.icity.javastudy.Demo17ReaderAndWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    flush方法和close方法的区别：
        1.flush:刷新缓冲区，流对象可以继续使用
        2.close:先刷新缓冲区，然后通知系统释放资源。流对象不可用继续使用了
 */
public class Demo1703CloseAndFlush {
    public static void main(String[] args) throws IOException {
        //1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
        FileWriter fileWriter = new FileWriter("src" + File.separator + "com" + File.separator + "icity" + File.separator + "javastudy" + File.separator + "Demo15IO" + File.separator + "icity2.txt");
        //2.使用FileWriter中的方法write，把数据写入到内存缓冲区中(字符转换为字节的过程)
        //指定的字节输出流
        fileWriter.write(97); // a
        //3.使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中
        fileWriter.flush();

        fileWriter.write(98); // b
        fileWriter.flush();

        //4.释放资源(会先把内存缓冲区中的数据刷新到文件中)
        fileWriter.close();
    }
}
