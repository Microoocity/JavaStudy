package com.icity.javastudy.Demo32JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author icity
 * @description
 * @date 2019/7/4 15:54
 **/

/*
    JDBC:Java DataBase Connectivity Java数据库连接，Java语言操作数据库
    JDBC本质:定义了一套操作所有关系型数据库的规则(接口)；接口的实现类却是由各个数据库厂商完成的

    快速入门：
        步骤：
            1.导入jar包 1.复制jar包至libs，2.Add as library
            2.注册驱动
            3.获取数据库连接对象 Connection
            4.定义sql
            5.获取执行SQL语句的对象 Statement
            6.执行SQL，接受返回的结果
            7.处理结果
            8.释放资源
 */
public class Demo3201JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/icity?serverTimezone=UTC", "root", "123456");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///icity?serverTimezone=UTC", "root", "123456");
            String sql = "update student1 set score = 70 where id = 1";
        Statement statement = connection.createStatement();
        int executeUpdate = statement.executeUpdate(sql);
        System.out.println(executeUpdate);
        statement.close();
        connection.close();
    }

    /*
        详解各个对象：
            1.DriverManager:驱动管理对象
                功能：
                    1.注册驱动：static void registerDriver(Driver driver)：注册与给定的驱动程序 DriverManager
                        告知程序该使用哪一个数据库驱动jar包
                    写代码使用：class.forName("com.mysql.jc.jdbc.Driver") 可省略
                    在com.mysql.cj.jdbc.Driver类中，存在静态代码块
                    static {
                        try {
                            DriverManager.registerDriver(new Driver());
                        } catch (SQLException var1) {
                            throw new RuntimeException("Can't register driver!");
                        }
                    }
                    2.获取数据库连接：public static Connection getConnection(String url, String user, String password)
                        url：指定连接的路径(jdbc:mysql://ip地址(域名):端口号/数据库名称)；user：用户名；password：密码
            2.Connection:数据库连接对象
                1.功能:
                    1.获取执行sql的对象
                        Statement createStatement()
                        PreparedStatement preparedStatement(String sql)
                    2.管理事务：
                        开启事务：void setAutoCommit(boolean autoCommit) 调用该方法，设置参数为false，即开启事务
                        提交事务：commit()
                        回滚事务：rollback()
            3.Statement:执行SQL的对象
                1.execute(String sql):可以执行任意sql
                2.int executeUpdate(String sql):执行DML(insert, update, delete)语句、DDL(create, alter, drop)语句
                    返回值：影响的行数
            4.Result:结果集对象
            5.PreparedStatement:执行SQL的对象(更强大)
     */

}
