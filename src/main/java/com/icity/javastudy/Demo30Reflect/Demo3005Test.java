package com.icity.javastudy.Demo30Reflect;

import com.icity.javastudy.common.Common;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    写一个"框架"，可以创建任意类的对象，并且执行其中任意方法
    实现：
        1.配置文件
        2.反射
    步骤:
        1.将需要创建的对象的全类名和需要执行的方法定义在配置文件中
        2.在程序中加载读取配置文件
        3.使用反射技术加载文件进内存
        4.创建对象
        5.执行方法
 */
public class Demo3005Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.加载配置文件,转换为一个集合
        //获取class目录下的配置文件
        Properties properties = new Properties();
//        ClassLoader classLoader = Demo3005Test.class.getClassLoader();
//        InputStream inputStream = classLoader.getResourceAsStream("src/properties.properties");
//        properties.load(inputStream);
        properties.load(new FileReader(Common.properties));

        //2.获取配置文件中定义的数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //3.加载该类进内存
        Class<?> aClass = Class.forName(className);
        //4.创建对象
        Object o = aClass.getDeclaredConstructor().newInstance();
        //5.获取方法对象
        Method method = aClass.getMethod(methodName);
        //6.执行方法
        method.invoke(o);
    }
}
