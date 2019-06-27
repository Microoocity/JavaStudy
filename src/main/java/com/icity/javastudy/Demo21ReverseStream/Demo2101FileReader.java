package com.icity.javastudy.Demo21ReverseStream;

import java.io.FileReader;
import java.io.IOException;

import static com.icity.javastudy.common.Common.GBK格式的文本;

/*
    FileReader可以读取IDE默认编码格式(UTF-8)的文件
    FileReader读取系统默认编码(中午GBK)会产生乱码
 */
public class Demo2101FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(GBK格式的文本);
        for (int len = 0; (len = fileReader.read()) != -1; ) {
            System.out.println((char)len);
        }

    }

}
