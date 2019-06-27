package com.icity.javastudy.Demo04Map;

import java.util.HashMap;
import java.util.Map;

/*
    java.util.Map<K,V>集合
    Map集合的特点：
        1.Map是一个双列集合，一个元素包含2个值（key，value）
        2.Map集合中元素，key&value的数据类型可以相同也可不同
        3.Map集合中元素，key&value一一对应
        4.Map集合中元素，key不能重复，value可以重复

    HashMap集合的特点：
        1.HashMap集合底层是哈希表，查询速度特别快，JDK1.8之前：数组+单向链表；JDK1.8之后：数组+单向链表/红黑树（链表长度超过8）：提高查询速度
        2.HashMap为无序数组，存储取出未必一致
    LinkedHashMap特点：
        1.LinkedMap集合底层是哈希表+链表
        2.LinkedMap为有序集合，存储取出元素顺序一致
 */
public class Demo0401Map {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }

    /*
    public V put(K key, V value)：添加指定的键-值到Map集合中
        返回值：v
        存储键值对应时，key不重复，返回值v是null；若key重复，会用新value替换key中重复的value，返回被替换的value值
     */
    private static void show01() {
        //创建Map集合对象，多态
        Map<String, String> hashMap = new HashMap<>();

        String v1 = hashMap.put("key01", "value01");
        System.out.println("v1:" + v1); // 无重复，故为空

        String v2 = hashMap.put("key01", "value02");
        System.out.println("v2:" + v2);

        System.out.println(hashMap); // {key01=value02}

        hashMap.put("key02", "value02");
        hashMap.put("key03", "value03");
        hashMap.put("key04", "value03");
        hashMap.put("key05", "value02");
        System.out.println(hashMap);
    }

    /*
        public V remove(Object key):把指定的键 所对应的键值对元素 从Map集合中删除，返回被删元素的值。
            返回值：V
            key存在，v返回被删除的值；key不存在，v返回空；
    */
    private static void show02() {
        Map<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("key06", 6);
        hashMap2.put("key07", 7);
        hashMap2.put("key08", 8);
        System.out.println(hashMap2);

        Integer v1 = hashMap2.remove("key08");
        System.out.println("Remove key08，v1:" + v1);

        System.out.println(hashMap2);

        Integer v2 = hashMap2.remove("key09");
        System.out.println("Remove key09，v2:" + v2);

//        int v3 = hashMap2.remove("key09"); // 自动拆箱，空值可以赋值给Integer，不可以赋值给int
        Integer v3 = hashMap2.remove("key09");
        // NullPointerException
        System.out.println("v3:" + v3);
    }

    /*
        public V get(Object key) 根据指定的键，在Map中获取对应的值。
            返回值：
                key存在，返回对应的value值；
                key不存在，返回null
     */
    private static void show03() {

        Map<String, Integer> hashMap3 = new HashMap<>();
        hashMap3.put("key09", 9);
        hashMap3.put("key10", 10);
        hashMap3.put("key11", 11);

        Integer v4 = hashMap3.get("key09");
        System.out.println("v4:" + v4);

        Integer v5 = hashMap3.get("key12");
        System.out.println("v5:" + v5); // v5:null
    }

    /*
    boolean containsKey(Object key) 判断集合中是否包含指定的键
    包含返回true，不包含返回false
 */
    private static void show04() {
        Map<String, Integer> hashMap4 = new HashMap<>();
        hashMap4.put("key12", 12);
        hashMap4.put("key13", 13);
        hashMap4.put("key14", 14);

        boolean b1 = hashMap4.containsKey("key12");
        System.out.println("b1:" + b1);

        boolean b2 = hashMap4.containsKey("key15");
        System.out.println("b2:" + b2);
    }

}
