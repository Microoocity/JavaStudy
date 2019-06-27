package com.icity.javastudy.Demo15OutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    追加写/续写：使用2个参数的构造方法
        FileOutputStream(String name, boolean append):创建一个向具有指定name的文件中写入数据的输出文件流
        FIleOutPutStream(File file, boolean append):创建一个向指定File对象表示的文件中写入数据的文件输出流
        参数：
            String name, File file:写入数据的目的地
            boolean append:追加写开关
                true:创建对象不会覆盖原文件，继续在文件末尾追加写数据
                false:创建一个新文件，覆盖原文件
    写换行：写换行符号
        Windows:\r\n
        Linux:\n
        mac:\r
 */
public class Demo1503OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src" + File.separator + "com" + File.separator + "icity" + File.separator + "javaStudy" + File.separator + "Demo15IO" + File.separator + "icity.txt",true);
        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("你好".getBytes());
            fileOutputStream.write("\r\n".getBytes());
        }
        fileOutputStream.close();
    }
}
