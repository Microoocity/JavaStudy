package com.icity.javastudy.Demo25FileUpload;

import com.icity.javastudy.common.Common;

import java.io.*;
import java.net.Socket;

/*
    文件上传案例的客户端：读取本地文件，上传到服务器，读取服务器回写的数据

    数据源：Demo15IO\\icity.txt
    目的地：服务器

    实现步骤：
        1.创建一个本地字节输入流FileInputStream对象，构造方法中绑定要读取到数据源
        2.创建一个客户端Socket对象，构造方法中绑定服务器的IP地址和端口号
        3.使用Socket中的方法getOutputStream获取网络字节输出流对象
        4.使用本地字节输入流FileInputStream对象中的方法read读取本地文件
        5.使用网络字节输出流OutputStream对象中的方法write，把读取到的文件上传到服务器
        6.使用Socket中的方法getInputStream，获取网络字节输入流InputStream对象
        7.使用网络字节输入流InputStream对象中的方法read读取服务回写的数据
        8.释放资源（FileInputStream,Socket）
 */
public class Demo2501TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(Common.ICITY);
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream outputStream = socket.getOutputStream();

        int len1 = 0;
        byte[] bytes1 = new byte[1024];
        for (; (len1 = fileInputStream.read(bytes1)) != -1; ) {
            //读取不到-1
            /*
                解决：上传完文件，给服务器写一个结束标记
                void shutsownOutput():禁用此套接字的输出流
                对于TCP套接字，任何以前写入的数据都将被发送，并且后续TCP的正常连接中止序列
             */
            outputStream.write(bytes1, 0, len1);
        }
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();

        for (; (len1 = inputStream.read(bytes1)) != -1; ) {
            System.out.println(new String(bytes1, 0, len1));
        }

        fileInputStream.close();
        socket.close();
    }
}