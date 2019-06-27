package com.icity.javastudy.Demo22ObjectStream;

import com.icity.javastudy.common.Common;

import java.io.*;
import java.util.ArrayList;

/*
    练习：序列化异常
        若需在文件中保存多个对象的时候，可以把多个对象存储到一个集合中，对集合进行序列化和反序列化

    分析：
        1.定义一个存储Person对象的ArrayList集合
        2.往ArrayList集合中存储Person对象
        3.创建一个序列化流ObjectOutputStream对象
        4.使用ObjectOutputStream对象中的方法writeObject，对集合进行反序列化
        5.创建一个反序列化ObjectInputStream对象
        6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
        7.把Object类型的集合转换为ArrayList类型
        8.遍历ArrayList集合
        9.释放资源
 */
public class Demo2203Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> personArrayList1 = new ArrayList<>();
        personArrayList1.add(new Person("icity01", 23));
        personArrayList1.add(new Person("icity02", 24));
        personArrayList1.add(new Person("icity03", 25));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(Common.personArrayList));
        objectOutputStream.writeObject(personArrayList1);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(Common.personArrayList));
        Object object = objectInputStream.readObject();
        //7.把Object类型的集合转换为ArrayList类型
        ArrayList<Person> personArrayList2 = (ArrayList<Person>) object;
        for (Person person : personArrayList2) {
            System.out.println(person);
        }
        objectOutputStream.close();
        objectInputStream.close();
    }
}
