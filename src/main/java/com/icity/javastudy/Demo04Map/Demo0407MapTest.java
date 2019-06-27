package com.icity.javastudy.Demo04Map;

import java.nio.charset.CharacterCodingException;
import java.util.HashMap;
import java.util.Scanner;

/*
    计算一个字符串中每个字符出现的个数

    1.使用Scanner获取用户输入的字符串
    2.创建Map集合，key是字符串中的字符，value是字符的个数
    3.遍历字符串，获取每一个字符
    4.使用获取到的字符，去Map集合判断key是否存在
        key存在：
            通过字符(key)，获取value(字符个数)
            value++
            put(key,value)把新的value存储到Map集合中
        Key不存在：
            put(key,1)\
    5.遍历Map集合，输出结果
 */
public class Demo0407MapTest {

    public static void main(String[] args) {
        //1.使用Scanner获取用户输入的字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String string = scanner.next();

        //2.创建Map集合，key是字符串中的字符，value是字符的个数
        HashMap<Character, Integer> hashMap = new HashMap<>();

        //3.遍历字符串，获取每一个字符
        for (char c :
                string.toCharArray()) {
            //toCharArray()方法：字符串返回char类型数组
            //4.使用获取到的字符，去Map集合判断key是否存在
            if (hashMap.containsKey(c)) {
                //key存在
                Integer value = hashMap.get(c);
                value++;
                hashMap.put(c, value);
            } else {
                //key不存在
                hashMap.put(c, 1);
            }
        }
        //5.遍历Map集合，输出结果
        for (Character key : hashMap.keySet()) {
            Integer value = hashMap.get(key);
            System.out.println(key + " = " + value);
        }
    }

}
