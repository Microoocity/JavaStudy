package com.icity.javastudy.Demo17ReaderAndWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    在jdk1.7之前使用try catch finally 处理流中的异常
    格式:
        try{
            可能会产出异常的代码
        }catch(异常类变量 变量名){
            异常的处理逻辑
        }finally{
            一定会指定的代码
            资源释放
        }
 */
public class Demo1706TryCatch {
    public static void main(String[] args) {
        //提高变量fileWriter的作用域，让finally可以使用，同时赋值为:null
        //变量定义时可以没有值，但使用时必须有值
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("src" + File.separator + "com" + File.separator + "icity2" + File.separator + "javastudy" + File.separator + "Demo15IO" + File.separator + "icity2.txt", true);

            for (int i = 0; i < 10; i++) {
                fileWriter.write("HelloWorld" + i + "\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        } finally {
            //若创建对象失败，fileWriter默认值是null，null不能调用方法，会抛出NullPointerException，故需增加null判断
            if (fileWriter != null) {
                try {
                    //fileWriter.close() 声明抛出IOException异常对象:throws或try catch
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
/*
    JDK7新特性:
    try后可以增加一个{}，在括号中可以定义流对象，那么这个流对象的作用域在try中有效
    try中代码执行完毕，会自动把流对象释放，不用再写finally
    格式略
 */

/*
    JDK9新特性:
    try前可以定义新对象
    try后可以直接引入流对象的名称(变量名)
    try代码执行完毕后，流对象可以释放掉，不用写finally
    格式:
        A a = new A();
        B b = new B();
        try(a, b) {

        }catch () {

        }
 */
