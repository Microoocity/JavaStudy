package com.icity.javastudy.Demo12File;

import java.io.File;

/*
    File类遍历（文件夹）目录功能
        public String[] list():返回一个String数组，表示该File目录中所有子文件或目录
        public File[] listFiles():返回一个File数组，表示该File目录中的所有子文件或目录
    注意：
        list方法和listFiles方法遍历的是构造方法中给出的目录
        如果构造方法中给出的目录的路径不存在/给出的路径不是一个目录，抛出空指针异常
 */
public class Demo1205File {
    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
        public String[] list():返回一个String数组，表示该File目录中的所有子文件或目录
        遍历方法中给出的目录，会获取目录中的所有文件
     */
    private static void show01() {
        //可以获取隐藏文件夹
        File file1 = new File("C:"+File.separator+"Users"+File.separator+"GuoQiang");
        //遍历某个文件 报空指针异常
        //遍历不存在的文件夹 报空指针异常
        String[] arr = file1.list();
        for (String fileName:arr
             ) {
            System.out.println(fileName);
        }
    }

    /*
        public File[] listFiles():返回一个File数组，表示该File目录中的所有子文件或目录
        遍历构造方法中给出的目录，会获取目录中所有的文件/文件夹，把文件/文件夹封装为File类对象，多个File对象存储到File数组中
     */
    private static void show02() {
        File file2 = new File("C:"+File.separator+"Users"+File.separator+"GuoQiang");
        File[] files = file2.listFiles();
        for (File file:files){
            System.out.println(file);
        }
    }

}
