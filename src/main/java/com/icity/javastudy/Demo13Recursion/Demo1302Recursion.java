package com.icity.javastudy.Demo13Recursion;

import java.io.File;
import java.nio.file.Files;

/*
    递归打印多级目录
    搜索文件的实现
 */
public class Demo1302Recursion {
    public static void main(String[] args) {
        File file = new File("c:" + File.separator + "IdeaWorkSpace" + File.separator + "icity" + File.separator + "JavaStudy" + File.separator + "src" + File.separator + "com" + File.separator + "icity" + File.separator + "javastudy");
        getAllFiles(file);
    }

    private static void getAllFiles(File file) {
        //打印目录名称
        System.out.println(file);
        File[] files = file.listFiles();
        for (File file2 : files
        ) {
            //对遍历得到的File类对象file2进行判断，判断是否文件夹
            if (file2.isDirectory()) {
                //若是，则递归继续
                getAllFiles(file2);
            }

            //打印文件
            System.out.println(file2);

            /*
                只要.java结尾的文件
                1.把File对象file转为字符串对象
             */
            String name = file2.getName(); // 文件名only
            String path = file2.getPath(); // 完整路径
            String string = file2.toString();
            //字符串转换为小写
            String s = string.toLowerCase();

            //调用String类中的方法endsWith判断字符串是否以.java结尾
            boolean b = s.endsWith(".java");

            if (b) {
                System.out.println(file2);
            }

            //链式编程
            if (file2.getName().toString().toLowerCase().endsWith(".java")){
                System.out.println(file2);
            }

        }
    }
}
