package com.icity.javastudy.Demo30Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo3003Reflect {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Person> personClass = Person.class;

        /*
            获取构造方法们
                Constructor<?>[] getConstructors()
                Constructor<T> getConstructor(类<?>... parameterTypes)

                Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
                Constructor<?>[] getDeclaredConstructors()
         */

        //Constructor:构造方法：创建对象
        //参数数量，顺序不符会报java.lang.NoSuchMethodException
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class, String.class, String.class, int.class, int.class);
        System.out.println(constructor);

        //用构造器创建对象
        Person person = constructor.newInstance("icity", 20, "123456789", "USA", 180, 65); // 传参
        System.out.println(person);

        //也可创建空参，构造器内也空参
        //如果使用空参构造方法创建对象，操作可以简化：class对象的getDeclaredConstructor().newInstance方法
        Person person1 = personClass.getDeclaredConstructor().newInstance();
        System.out.println(person1);
    }
}
