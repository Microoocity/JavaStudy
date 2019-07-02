package com.icity.javastudy.Demo30Reflect;

import java.lang.reflect.Field;
import java.util.Arrays;

/*

 */
public class Demo3002Reflect {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //获取Person的Class对象
        Class<Person> personClass = Person.class;

        /*
            1.获取成员变量们
                Field[] getFields():获取所有public修饰的成员变量
                Field getField(String name):获取指定public修饰的成员变量

                Field[] getDeclaredFields()
                Field getDeclaredField(String name)
         */
        Field[] personClassFields = personClass.getFields();
        Arrays.stream(personClassFields).forEach(System.out::println);

        Field personClassField = personClass.getField("phone"); // 类的名字

        //获取成员变量a的值
        Person person = new Person();
        Object value = personClassField.get(person);
        System.out.println(value);
        //设置personClassField的值
        personClassField.set(person, "123456789");
        System.out.println(person);

        System.out.println("===========================");

        //Field[] getDeclaredFields():获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        Arrays.stream(declaredFields).forEach(System.out::println);

        //Field getDeclaredField(String name):获取指定的成员变量，尝试获取private时会报错
        //java.lang.IllegalAccessException: class XXX cannot access a member of class XXX with modifiers "private"
        Field declaredField = personClass.getDeclaredField("name");

        //忽略访问权限修饰符的安全检查
        declaredField.setAccessible(true); // 暴力反射

        Object value2 = declaredField.get(person);
        System.out.println(value2);
    }

}
