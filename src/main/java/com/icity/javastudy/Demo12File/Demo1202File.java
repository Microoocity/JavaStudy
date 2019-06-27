package com.icity.javastudy.Demo12File;

import java.io.File;

/*
    File类获取功能的方法：
        public String getAbsolutePath():返回此File的绝对路径名字符串
        public String getPath():将此file转换为路径名字符串
        public String getName():返回由此file表示的文件或目录的名称
        public Long length():返回由此File表示的文件的长度
 */
public class Demo1202File {

    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }

    /*
        public String getAbsolutePath():返回此File的绝对路径名字符串
        获取构造方法中传递的路径
        无论路径是相对的还是绝对的,getAbsolutePath()方法返回的都是绝对路径
     */
    private static void show01() {
        File file1 = new File("C:" + File.separator + "Users" + File.separator + "GuoQiang" + File.separator + "123.txt");
        String absolutePath1 = file1.getAbsolutePath();
        System.out.println(absolutePath1); // C:\Users\GuoQiang\123.txt

        File file2 = new File("src" + File.separator + "com" + File.separator + "icity" + File.separator + "javaStudy" + File.separator + "Demo15IO" + File.separator + "icity.txt");
        String absolutePath2 = file2.getAbsolutePath();
        System.out.println(absolutePath2); // C:\IdeaWorkSpace\icity\JavaStudy\src\com\icity\javaStudy\Demo15IO\icity.txt
    }

    /*
        public String getPath():将此file转换为路径名字符串
        获取构造方法中传递的路径

        toString方法调用的就是getPath方法：
            public String toString() {
                return getPath();
            }
     */
    private static void show02() {

        File file1 = new File("C:" + File.separator + "Users" + File.separator + "GuoQiang" + File.separator + "123.txt");
        File file2 = new File("123.txt");
        String path1 = file1.getPath();
        System.out.println(path1);
        String path2 = file2.getPath();
        System.out.println(path2);

        System.out.println(file1);
        System.out.println(file1.toString());

    }

    /*
        public String getName():返回由此file表示的文件或目录的名称
        获取的是构造方法传递路径的结尾部分（文件/文件夹）
     */
    private static void show03() {

        File file1 = new File("C:" + File.separator + "Users" + File.separator + "GuoQiang" + File.separator + "123.txt");
        String name1 = file1.getName();
        System.out.println(name1); // 123.txt

        File file2 = new File("C:" + File.separator + "Users" + File.separator + "GuoQiang");
        String name2 = file2.getName();
        System.out.println(name2);

    }

    /*
        public long length()：返回由此File表示的文件的长度。
        获取的是构造方法指定的问价的大小，以字节为单位
        注意：
            文件夹无大小的概念，不能获取文件夹的大小
            如果构造方法中给出的路径不存在，那么length方法返回0
     */
    private static void show04() {

        File file1 = new File("C:" + File.separator + "Users" + File.separator + "GuoQiang" + File.separator + "NTUSER.dat");
        long long1 = file1.length();
        System.out.println(long1); // 2621440字节

        File file2 = new File("C:" + File.separator + "Users" + File.separator + "GuoQiang" + File.separator + "123.txt");
        System.out.println(file2.length()); // 0字节

        File file3 = new File("C:" + File.separator + "Users" + File.separator + "GuoQiang");
        System.out.println(file3.length()); // 0 文件夹无大小概念

    }

}
