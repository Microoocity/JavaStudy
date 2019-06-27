package com.icity.javastudy.Demo19BufferedOutPutStream;

import java.io.*;
import java.util.HashMap;

import static com.icity.javastudy.common.Common.出师表;
import static com.icity.javastudy.common.Common.出师表排序;

/*
    练习：
        对文本内容进行排序
        按照(1,2,3...)顺序排序
    分析：
        1.创建HashMap集合对象，key存储每行文本的序号；value存储每行文本
        2.创建字符缓存输入流对象，构造方法中绑定字符输入流
        3.创建字符缓冲输出流对象，构造方法中绑定字符输出流
        4.使用字符缓冲输入流中的方法readLine，逐行读取文本
        5.对读取到的文本进行切割，获取行中的序号和文本内容
        6.把切割好的序号和文本的内容存储到HashMap集合中(key序号有序，会自动排序1，2，3，4.。。)
        7.遍历HashMap集合，获取每一个键值对
        8.把每一个键值对，拼接为一个文本行
        9.把拼接好的文本，使用字符缓冲输出流中的方法write，写入到文件中
        10.释放资源
 */
public class Demo1905Test {
    public static void main(String[] args) throws IOException {
        //1.创建HashMap集合对象，key存储每行文本的序号；value存储每行文本
        HashMap<String, String> hashMap = new HashMap<>();
        //2.创建字符缓存输入流对象，构造方法中绑定字符输入流
        BufferedReader bufferedReader = new BufferedReader(new FileReader(出师表));
        //3.创建字符缓冲输出流对象，构造方法中绑定字符输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(出师表排序));
        //4.使用字符缓冲输入流中的方法readLine，逐行读取文本
        String line;
        for (; (line = bufferedReader.readLine()) != null; ) {
            //5.对读取到的文本进行切割，获取行中的序号和文本内容
            String[] split = line.split("\\."); // "\\.是转义符号"，根据 "." 区分， 切割返回后是个数组
            //6.把切割好的序号和文本的内容存储到HashMap集合中(key序号有序，会自动排序1，2，3，4.。。)
            hashMap.put(split[0], split[1]);
        }

        //7.遍历HashMap集合，获取每一个键值对
        for (String key : hashMap.keySet()) {
            String value = hashMap.get(key);

            //8.把每一个键值对，拼接为一个文本行
            line = key + "." + value + "\r\n";

            //9.把拼接好的文本，使用字符缓冲输出流中的方法write，写入到文件中
            bufferedWriter.write(line);
        }
        //10.释放资源
        bufferedReader.close();
        bufferedWriter.close();

    }

}
