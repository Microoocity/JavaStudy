package com.icity.javastudy.Demo22ObjectStream;

import com.icity.javastudy.common.Common;

import java.io.*;

/*
    java.io.ObjectOutputStream extends OutputStream
    ObjectOutputStream:对象的序列化流
    作用：把对象以流的方式写入到文件中保存

    构造方法：
        ObjectOutputStream() 提供完全重新实现的子类对象不需要分配的私有数据只是用于实现对象的方式
        ObjectOutputStream(OutputStream out) 创建一个对象写入到指定的输出流
        参数：
            OutputStream out:字节输出流
    特有的成员方法：
        void writeObject(Object obj) 将指定的对象写入 ObjectOutputStream

    使用步骤：
        1.创建ObjectOutputStream对象，构造方法中传递字节输出流
        2.使用ObjectOutputStream对象中的方法writeObject，把对象写入到文件中
        3.释放资源
 */
public class Demo2201ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(Common.Person));
        //2.使用ObjectOutputStream对象中的方法writeObject，把对象写入到文件中
        objectOutputStream.writeObject(new Person("icity01", 23));
        //3.释放资源
        objectOutputStream.close();
        //NotSerializableException
    }
}
