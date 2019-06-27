package com.icity.javastudy.Demo14Filter;

import java.io.File;
import java.io.FileFilter;

/*
    可以使用过滤器实现，在File类中有2个和ListFiles重载的方法，方法的参数传递的就是过滤器
    File类中有2个和ListFiles重载的方法，方法的参数传递的就是过滤器
    File[] listFiles(FileFilter filter)
        java.io.FileFilter接口：用于抽象路径名（File对象）的过滤器
            作用：过滤文件；
            抽象方法：用来过滤文件的方法
        boolean accept(File pathname)测试指定抽象路径名是否应该包含在某个路径名列表中
        参数：
            File pathname：使用ListFiles方法遍历目录，得到每一个文件对象
    File[] listFiles(FilenameFilter filter)
    java.io.FilenameFilter接口：实现此接口的类的实例可用于过滤文件名
        作用：用于过滤文件名称
        抽象方法：用来过滤文件的方法
            boolean accept(File dir, String name) 测试指定文件是否应该包含在某一文件列表中
            参数：
                1.File dir:构造方法中传递的被遍历的目录
                2.String name:使用ListFiles方法遍历目录，获取每一个文件/文件夹的名称
     注意：
        两个过滤器接口时没有实现类的，需要重写实现类，重写过滤的方法accept，在方法中自己定义过滤的规则

 */
public class Demo1401Filter {
    public static void main(String[] args) {
        File file = new File("c:" + File.separator + "IdeaWorkSpace" + File.separator + "icity" + File.separator + "JavaStudy" + File.separator + "src" + File.separator + "com" + File.separator + "icity" + File.separator + "javastudy");
        getAllFiles(file);
    }

    private static void getAllFiles(File file) {
        //打印目录名称
//        System.out.println(file);

        File[] files = file.listFiles(new Demo1402FilterImplement()); // 传递过滤器
        /*
            listFiles方法做了三件事：
                1.listFiles方法会对构造方法中传递的目录进行遍历，获取目录中的每一个文件/文件夹-->封装为File对象
                2.listFiles方法会调用参数传递的过滤器中的方法accept
                3.listFiles方法会把遍历得到的每一个File对象，传递至accept方法的参数pathname
         */


        for (File file2 : files
        ) {
            //对遍历得到的File类对象file2进行判断，判断是否文件夹
            if (file2.isDirectory()) {
                //若是，则递归继续
                getAllFiles(file2);
            }

            //打印文件
            System.out.println(file2);

            //链式编程
            /*if (file2.getName().toLowerCase().endsWith(".java")) {
                System.out.println(file2);
            }*/
        }
    }
}