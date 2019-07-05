package com.icity.javastudy.Demo32JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author icity
 * @description
 * @date 2019/7/4 20:32
 **/
public class Demo3203JDBC {
    public static void main(String[] args) {
        try {
            String sql = "";
            Connection connection = DriverManager.getConnection("jdbc:MySQL://localhost:3306/student1?serverTimezone=UTC", "root", "123456");
            Statement statement = connection.createStatement();
            int i = statement.executeUpdate(sql);
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
