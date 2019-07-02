package com.icity.javastudy.Demo30Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Demo3004Reflect {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        /*
            获取成员的方法们
                Method[] getMethods()
                Method getMethod(String name, 类<?>... parameterTypes)

                Method[] getDeclaredMethods()
                Method getDeclaredMethod(String name, 类<?>... parameterTypes)
         */

        //获取指定名称的方法
        Method eat = personClass.getMethod("eat", String.class);

        //执行方法
        Person person = new Person();
        eat.invoke(person, "YangYang");

        //获取所有public修饰的方法(含Object类的一些方法)
        Method[] methods = personClass.getMethods();
        Arrays.stream(methods).forEach(method -> {
            //支持暴力反射
            method.setAccessible(true);
            //获取方法名称
            String methodName = method.getName();
            System.out.println(method);
            System.out.println(methodName);
        });

        //获取类名
        String className = personClass.getName();
        System.out.println(className); // com.icity.javastudy.Demo30Reflect.Person
    }
}
