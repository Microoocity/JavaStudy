package com.icity.javastudy.Demo17ReaderAndWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    续写和换行
    续写：追加写：使用2个参数的构造方法
        FileWriter(String fileName, boolean append)
        FileWriter(File file, boolean append)
        参数：
            String fileName,File file:写入数据目的地
            boolean append:续写开关 true:不会创建新文件覆盖原文件，可续写 false:创建新文件覆盖原文件
    换行:换行符号
        Windows:\r\n
        Linux:/n
        Mac:/r
 */
public class Demo1705Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src" + File.separator + "com" + File.separator + "icity" + File.separator + "javastudy" + File.separator + "Demo15IO" + File.separator + "icity2.txt", true);
        for (int i = 0; i < 10; i++) {
            fileWriter.write("HelloWorld" + i + "\r\n");
        }

        fileWriter.close();
    }
}
