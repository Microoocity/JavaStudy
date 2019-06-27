package com.icity.javastudy.Demo22ObjectStream;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;

/*
    序列化和反序列化的时候，会抛出NotSerializableException没有序列化异常
    类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化
    Serializable接口也叫标记型接口
        要进行序列化和反序列化的类必须实现Serializable接口，就会给类添加一个标记
        进行序列化和反序列化时，会检测类上是否有此标记

    static关键字：静态关键字
        静态优先于非静态加载到内存中(静态优先于对象进入到内存中)
        被static修饰的成员变量不能被序列化，序列化的都是对象
        private static int age;
        ObjectOutputStream.writeObject(new Person("icity01", 23));
        Object object = objectInputStream.readObject();
        Person{name='icity01', age=0}

    transient关键字：瞬态关键字
        被transient修饰的成员变量不能被序列化
        private transient int age;
 */
public class Person implements Serializable {
    //无论类是否修改，序列化的ID均不会改变
    private static final long serialVersionUID = 42L;

    private String name;
    //private static int age;
    private transient int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
