package com.icity.javastudy.Demo26FunctionalInterface;

import java.util.function.Supplier;

/*
    练习：使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值
    提示：接口的泛型使用java.lang.Interger类
 */
public class Demo2609Test {
    //定义一个方法，用于获取int类型数组中元素的最大值，方法的参数传递Supplier接口，泛型使用Interger
    public static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        int[] arr = {100, 0, -50, 88, 99, 33, -30};
        int max1 = getMax(() -> {
            //获取数组的最大值并返回
            //定义一个遍历，把数组第一个元素赋值给该元素，记录数组中元素的最大值
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            //返回最大值
            return max;
        });

        System.out.println("数组中元素最大值：" + max1);
    }
}
