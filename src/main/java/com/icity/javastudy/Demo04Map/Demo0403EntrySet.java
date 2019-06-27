package com.icity.javastudy.Demo04Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map遍历的第二种方式：使用Entry对象

    Map集合中的方法：
        Set<Map,Entry<K,V> entrySet() 返回此映射中包含的映射关系的Set视图>

    实现步骤：
        1.使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个set集合中
        2.遍历Set集合，获取每一个Entry对象
        3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */
public class Demo0403EntrySet {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("key1", 1);
        hashMap.put("key2", 2);
        hashMap.put("key3", 3);

        //1.使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个Set集合中
        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();

        //2.遍历Set集合，获取每一个Entry对象
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        for (Map.Entry<String, Integer> e :
                set) {
            Map.Entry<String, Integer> entry = iterator.next();
//            3.使用Entry对象中的方法getKey()和getValue()获取键与值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }

}
