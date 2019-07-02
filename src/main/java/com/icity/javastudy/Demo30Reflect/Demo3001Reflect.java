package com.icity.javastudy.Demo30Reflect;

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

        //todo:缺失代码
    }
}
