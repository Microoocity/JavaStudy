package com.icity.javastudy.Demo32JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author icity
 * @description account表 添加一条记录 insert 语句
 * @date 2019/7/4 19:17
 **/
public class Demo3202JDBC {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        try {
            String sql = "insert into student1 values(3, 'icity03', 19, 80, '1998.01.01' , null)";
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/icity?serverTimezone=UTC", "root", "123456");
            statement = connection.createStatement();
            int count = statement.executeUpdate(sql);
            System.out.println(count);
            System.out.println(count > 0 ? "添加成功" : "添加失败");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

    }
}
