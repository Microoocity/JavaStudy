package com.icity.javastudy.Demo12File;

import java.io.File;
import java.io.IOException;

/*
    File类创建删除功能的方法
        public boolean createNewFile():当且仅当具有该名称的文件不存在时，创建一个新的空文件
        public boolean delete():删除由此File表示的文件或目录
        public boolean mkdir():创建由此File表示的目录
        public boolean mkdirs():创建由此File表示的目录，包括任何必需但不存在的父目录
 */
public class Demo1204File {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
        show03();
    }

    /*
        public boolean createNewFile():当且仅当具有该名称的文件不存在时，创建一个新的空文件
        创建文件的路径和名称在构造方法中给出（构造方法的参数）
        返回值：布尔值
            true：文件不存在，创建文件返回true
            false:文件存在不创建，返回false
         注意：
            1.此方法只能创建文件不能创建文件夹
            2.创建文件的路径必须存在，否则会抛出异常

          public boolean createNewFile() throws IOException
          createNewFile声明抛出了IOException，调用此方法必须处理异常
     */
    private static void show01() throws IOException {
        File file1 = new File("C:" + File.separator + "Users" + File.separator + "GuoQiang" + File.separator + "456.txt");
        boolean newFile1 = file1.createNewFile();
        System.out.println(newFile1);

        File file2 = new File("457.txt");
        boolean newFile2 = file2.createNewFile();
        System.out.println(newFile2);

        File file3 = new File("新建文件夹");
        System.out.println(file3.createNewFile()); // 创建的仍然是文件而非文件夹
    }

    /*
        public boolean mkdir():创建单极文件夹
        public boolean mkdirs():既可创建单极空文件夹，又可创建多级文件夹
        创建文件夹的路径和名称在构造方法中给出（构造方法的参数）
        返回值：布尔值
            true：文件夹不存在，创建文件夹返回true
            false:文件夹存在不创建，返回false；构造方法中给出的路径不存在返回false
         注意：
            1.此方法只能创建文件夹不能创建文件

     */
    private static void show02() {

        File file1 = new File("icity");
        System.out.println(file1.mkdir());

        File file2 = new File("icity" + File.separator + "icity");
        System.out.println(file2.mkdirs());

        File file3 = new File("icity" + File.separator + "icity.txt");
        System.out.println(file3.mkdirs()); // 创建的仍然是个文件夹！！！

        File file4 = new File("icity2"+File.separator+"icity2.txt");
        System.out.println(file4.mkdirs()); // 不会抛出异常，
    }

    /*
        public boolean delete():删除由此File表示的文件或目录
        返回值：布尔值
            true:文件/文件夹删除成功，返回true
            false:文件夹中有内容，不会删除返回false；构造方法路径中不存在false
         注意：
            delete方法是直接在硬盘中删除文件/文件夹，不走回收站
     */
    private static void show03() {
        File file1 = new File("icity"+File.separator+"icity.txt");
        System.out.println(file1.delete());
    }


}
