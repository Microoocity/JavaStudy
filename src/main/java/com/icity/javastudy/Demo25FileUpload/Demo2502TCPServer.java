package com.icity.javastudy.Demo25FileUpload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
    文件上传案例的服务器端：读取客户端上传的文件，保存到服务器的硬盘，给客户端回写"上传成功"

    数据源：客户端上传的文件
    目的地：服务器的硬盘

    步骤：
        1.创建一个服务器ServerSocket对象，和系统要指定的端口号
        2.使用ServerSocket对象中的方法accept，获取到请求到客户端Socket对象
        3.使用Socket对象中的方法getInputStream，获取到网络字节输入流InputStream对象
        4.判断服务器硬盘的文件夹是否存在，不存在则创建
        5.创建一个本地的字节输出流FileOutputStream对象,构造方法中绑定要输出的目的地
        6.使用网络字节输入流InputStream对象中的方法read读取客户端上传的文件
        7.使用本地字节输出流FileOutputStream对象中的方法write，把读取到的文件保存到服务器的硬盘上
        8.使用Socket对象中的方法getOutputSteam，获取到网络字节输出流OutputStream对象
        9.使用网络字节输出流OutputStream对象中的方法write，给客户端回写"上传成功"
        10.释放资源(FileOutputStream,Socket,ServerSocket)
 */
public class Demo2502TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);

        /*
            让服务器一直处于监听状态，持续接收文件(死循环accept方法即可)
         */
        for (; ; ) {
            Socket accept = serverSocket.accept();

            /*
                使用多线程技术提高程序效率
                有一个客户端上传文件，则开启一个线程，完成文件上传
             */

            //完成文件的上传
            new Thread(() -> {
                try {
                    InputStream inputStream = accept.getInputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                File file = new File("\\upload");
                boolean isFileExists = file.exists();
                if (!isFileExists) {
                    file.mkdirs();
                }
            }).start();

            InputStream inputStream = accept.getInputStream();
            File file = new File("\\upload");
            boolean isFileExists = file.exists();
            if (!isFileExists) {
                file.mkdirs();
            }

        /*
            自定义一个文件的命名规则：防止同名的文件被覆盖掉
            规则：域名+毫秒值+随机数
         */
            String fileName = "icity" + System.currentTimeMillis() + new Random().nextInt(999999) + ".txt";


            FileOutputStream fileOutputStream = new FileOutputStream(file + File.separator + fileName);
            int len = 0;
            byte[] bytes = new byte[1024];
            for (; (len = inputStream.read(bytes)) != -1; ) {
                fileOutputStream.write(bytes, 0, len);
            }

            accept.getOutputStream().write("上传完成".getBytes());
            accept.close();
        }
//          服务器不用关闭
//          serverSocket.close();
    }
}
