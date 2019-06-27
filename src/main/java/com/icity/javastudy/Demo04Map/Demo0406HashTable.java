package com.icity.javastudy.Demo04Map;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.HashMap;
import java.util.Hashtable;

/*
    HashTable<K,V>集合 implements Map<K,V>接口

    HashTable：底层也是哈希表，线程安全，单线程的集合，速度慢；不可存储null值，null键
    HashMap：底层哈希表，线程不安全，多线程，速度快；可存null值，null键

    HashTable和Vector集合，jdk1.2版本后被更先进的集合（HashMap，ArrayList）取代；
    HashTable的子类Properties集合依然被使用，它是唯一和IO流结合的集合
 */
public class Demo0406HashTable {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(null, "a"); // 被取代，null值也不可重复
        hashMap.put("b", null);
        hashMap.put(null, null);
        System.out.println(hashMap);

        Hashtable<String, String> hashTable = new Hashtable<>();
//        hashTable.put(null, "a"); // NullPointerException
//        hashTable.put("a", null); // NullPointerException
        System.out.println(hashTable);
    }
}
