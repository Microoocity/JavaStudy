package com.icity.javastudy.Demo04Map;

import java.util.List;

/*
    jdk9新特性：
        List接口，Set接口，Map接口：内部增加了一个静态的方法if，可以给集合一次添加多个元素
    前提：集合中存储的元素的个数已确定（不再改变）
    注意：
        1.of方法仅适用于List，Set，Map接口，不适用于接口的实现类
        2.of方法返回值不能改变，故集合中不能再使用add，put方法添加元素，会抛出异常
        3.Set接口&Map接口再调用of方法时，不能有重复的元素，否则会抛出异常
 */
public class Demo0408Jdk9Setof {
    public static void main(String[] args) {
//        List<String> list = List.of("a","b","c","a","d");
//        System.out.println(list);
        //list.add("e");
    }
}
