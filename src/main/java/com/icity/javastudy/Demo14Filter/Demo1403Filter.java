package com.icity.javastudy.Demo14Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo1403Filter {

    public static void main(String[] args) {
        File file = new File("c:" + File.separator + "IdeaWorkSpace" + File.separator + "icity" + File.separator + "JavaStudy" + File.separator + "src" + File.separator + "com" + File.separator + "icity" + File.separator + "javastudy");
        getAllFiles(file);
    }

    private static void getAllFiles(File file) {

        //传递过滤器对象：使用匿名内部类
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                //过滤规则，pathname是文件夹或者.java结尾的文件返回true
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
            }
        });

        File[] files2 = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //将2个参数封装为一个类
                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });

        for (File file2 : files
        ) {
            //对遍历得到的File类对象file2进行判断，判断是否文件夹
            if (file2.isDirectory()) {
                //若是，则递归继续
                getAllFiles(file2);
            }

            //打印文件
            System.out.println(file2);
        }
    }

}
