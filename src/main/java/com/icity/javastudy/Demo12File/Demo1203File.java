package com.icity.javastudy.Demo12File;

import java.io.File;

/*
    File判断功能的方法
        public boolean exists():此File表示的文件或目录是否实际存在
        public boolean isDirectory():此File表示的是否为目录
        public boolean isFile():此File表示的是否为文件
 */
public class Demo1203File {
    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
        public boolean exists():此File表示的文件或目录是否实际存在
        用于判断构造方法中的路径是否存在；存在为true；不存在为false
     */
    private static void show01() {

        File file1 = new File("C:" + File.separator + "Users" + File.separator + "GuoQiang");
        System.out.println(file1.exists()); // true

        File file2 = new File("C:" + File.separator + "User" + File.separator + "GuoQiang");
        System.out.println(file2.exists()); // false

        File file3 = new File("JavaStudy.iml");
        System.out.println(file3.exists()); // true

        File file4 = new File("Java.iml");
        System.out.println(file4.exists()); // false

    }

    /*
        public boolean isDirectory():此File表示的是否为目录
            判断构造方法中给定的路径是否以文件夹结尾
                是：true;否：false
        public boolean isFile():此File表示的是否为文件,是：true;否：false;
        注意：
            电脑的硬盘只有文件/文件夹，两个方法是互斥
            前提：路径必须存在，否则均返回false
     */
    private static void show02() {
        File file1 = new File("C:" + File.separator + "Users" + File.separator + "GuoQiang");
        if (file1.exists()) {
            System.out.println(file1.isDirectory());
            System.out.println(file1.isFile());
        }
    }
}