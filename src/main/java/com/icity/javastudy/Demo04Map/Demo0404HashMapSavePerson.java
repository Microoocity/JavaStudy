package com.icity.javastudy.Demo04Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的
        作为key的元素，必须重写hashCode方法和equals方法以保证key唯一
 */
public class Demo0404HashMapSavePerson {
    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
        HashMap存储自定义类型键值
        key:String类型
            String类重写hashCode方法和equals方法，可以保证key唯一
        value:Person类型
            value可以重复（同名同年龄的人视为同一个）
     */
    private static void show01() {
        //创建HashMap集合
        HashMap<String, Person> hashMap = new HashMap<>();
        //向集合中添加元素
        hashMap.put("key1", new Person("icity01", 18));
        hashMap.put("key2", new Person("icity02", 19));
        hashMap.put("key3", new Person("icity03", 20));
        hashMap.put("key4", new Person("icity04", 18));
        //使用keySet foreach循环遍历hashMap集合
        Set<String> set = hashMap.keySet();
        for (String key : set
        ) {
            Person value = hashMap.get(key);
            System.out.println(key + "-->" + value);
        }
    }

    /*
       HashMap存储自定义类型键值
       key:Person类型
           Person类重写hashCode方法和equals方法，以保证key唯一
       value:String类型
           可以重复
    */
    private static void show02() {

        //创建HashMap集合
        HashMap<Person, String> hashMap2 = new HashMap<>();
        //向集合中添加元素
        hashMap2.put(new Person("icity01", 18), "value1");
        hashMap2.put(new Person("icity02", 20), "value2");
        hashMap2.put(new Person("icity03", 22), "value3");
        hashMap2.put(new Person("icity01", 18), "value1");
//        使用EntrySet和foreach遍历Map集合
        Set<Map.Entry<Person, String>> set = hashMap2.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "--->" + value);
            //Person类需重写Hashcode方法和equal方法
        }
    }

}
