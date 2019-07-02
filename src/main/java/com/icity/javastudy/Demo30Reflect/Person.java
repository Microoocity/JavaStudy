package com.icity.javastudy.Demo30Reflect;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;

    public String phone;
    protected String address;
    int height;
    public int weight;

    public Person() {
    }

    public Person(String name, int age, String phone, String address, int height, int weight) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.height = height;
        this.weight = weight;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public void eat() {
        System.out.println("Eating......");
    }

    public void eat(String name) {
        System.out.println(name + " is Eating......");
    }

}
