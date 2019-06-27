package com.icity.javastudy.Demo12File;

import java.io.File;

/*
    java.io.File类
    文件和目录路径名的抽象表示形式
    Java把电脑中的文件和文件夹（目录）封装成为了一个File类，可以使用File类对文件和文件夹进行操作
    可以使用File类的方法
        创建、删除、获取一个文件/文件夹；
        判断文件/文件夹是否存在；
        对文件夹进行遍历
        获取文件大小
     File类是一个与系统无关的类，任何的操作系统都可以使用这个类中的方法

     重点：
        file：文件
        directory：文件夹/目录
        path：路径
 */

/*
    绝对路径：C:\\Users\\GuoQiang\\123.txt
    相对路径：123.txt
    注意：
        1.路径不区分大小写
        2.路径中的文件名称分隔符Windows使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
 */
public class Demo1201File {

    public static void main(String[] args) {

        printPathSeparator();
        show01();
        show02("C:" + File.separator, "123.txt");
        show03();
    }

    /*
        static String pathSeparator 与系统有关的路径分隔符，为了方便，它被表示成一个字符串
        static char separatorChar 与系统有关的默认名称分隔符

        操作路径：路径不能写死
        eg:
            Windows:C:\XXXX\xxx
            Linux:/XXXX/xxx
            "C:"+File.separator+"XXXX"+File.separator+"xxx"
    */
    private static void printPathSeparator() {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator); // 路径分隔符 windows：分号； linux：冒号；

        String separator = File.separator;
        System.out.println(separator); // 文件名称分隔符 Windows：反斜杠\ linux:正斜杠/
    }

    /*
        File(String pathname) 通过将给定路径名 字符串转换为抽象路径来创建一个新File实例。
        参数：
            String pathName:字符串的路径名称
            路径可以是以文件结尾，也可以是以文件结尾
            路径可以是相对路径，也可以是绝对路径
            路径可存在，也可不存在
            创建File对象，仅把字符串路径封装为File对象，不考虑路径的真假情况
     */
    private static void show01() {
        File file1 = new File("C:" + File.separator + "Users" + File.separator + "GuoQiang" + File.separator + "123.txt");
        System.out.println(file1); // 重写了Object类的toString方法 C:\Users\GuoQiang\123.txt

        File file2 = new File("C:" + File.separator + "Users" + File.separator + "GuoQiang");
        System.out.println(file2); // 重写了Object类的toString方法 C:\Users\GuoQiang

        File file3 = new File("123.txt");
        System.out.println(file3);

    }

    /*
        File(String parent, String child) 根据parent路径名字符串和child路径名字符串创建一个新File实例。
        参数：路径分为2部分：
            String parent：父路径
            String child：子路径
        好处：
            父路径和子路径可以单独书写，灵活；父、子路径均可变化
     */
    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    /*
        File(File parent, String child) 根据parent抽象路径名和child路径名字符串创建一个新File实例
        参数：路径分为2部分：
            File parent：父路径
            String child：子路径
        好处：
            父路径和子路径可以单独书写，灵活；父、子路径均可变化
            父路径是File类型，可以用File方法对路径进行一些操作，再使用路径创建对象
     */
    private static void show03() {
        File parent = new File("C:" + File.separator);
        File file = new File(parent, "hello.java");
        System.out.println(file);
    }

}
