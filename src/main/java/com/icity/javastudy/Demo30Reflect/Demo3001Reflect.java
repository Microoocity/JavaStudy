package com.icity.javastudy.Demo30Reflect;

/*
    获取Class对象的方式：
        1.Class.forName("全类名"):将字节码文件加载进内存，返回class对象
            多用于配置文件，将类名定义在配置文件中，读取文件加载类
        2.类名.class:通过类名的属性class获取
            多用于参数的传递
        3.对象.getClass():getClass()方法在Object类中定义着
            对象的获取字节码的方式
 */
public class Demo3001Reflect {
    public static void main(String[] args) throws ClassNotFoundException {

        //1.Class.forName("全类名")
        Class cls1 = Class.forName("com.icity.javastudy.Demo30Reflect.Person");
        System.out.println(cls1);

        //2.类名.class
        Class<Person> personClass1 = Person.class;
        System.out.println(personClass1);

        //3.对象.getclass
        Person person = new Person();
        Class<? extends Person> personClass2 = person.getClass();
        System.out.println(personClass2);

        //比较三个对象 (均为true)
        System.out.println(cls1 == personClass1);
        System.out.println(cls1 == personClass2);
        System.out.println(personClass1 == personClass2);

        Class c = Student.class;
        System.out.println(c == cls1);
    }
}
