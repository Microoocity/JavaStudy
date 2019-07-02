package com.icity.javastudy.Demo27Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
    使用Stream流的方式，遍历集合，对集合中的数据进行过滤
    Stream流是JDK1.8之后出现的，关注"做什么"，而不是"怎么做"
 */
public class Demo2702StreamFilter {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("acity00");
        arrayList.add("icty01");
        arrayList.add("icity02");
        arrayList.add("bcity3");
        arrayList.add("ccy04");
        arrayList.add("dcity05");

        //Stream<T> filter(Predicate<? super T> predicate);
        arrayList.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("i") && (s.length() == 7);
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        arrayList.stream()
                .filter(name -> name.startsWith("i"))
                .filter(name -> (name.length() == 7))
                .forEach(name -> System.out.println(name));

    }
}
