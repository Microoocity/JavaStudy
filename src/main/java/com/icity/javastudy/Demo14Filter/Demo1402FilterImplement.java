package com.icity.javastudy.Demo14Filter;

import java.io.File;
import java.io.FileFilter;

/*
    创建过滤器FileFilter的实现类，重写过滤方法，定义过滤规则
 */
public class Demo1402FilterImplement implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        /*
            自定义过滤的规则：
            accept方法中，判断File对象是否以.java结尾
         */
        //如果pathname是一个文件夹，返回true，继续遍历这个文件夹
        if (pathname.isDirectory()){
            return true;
        }

        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
