package com.tom.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Tester {
    public static void main(String[] args) {
        try {
            //Driver
            Class.forName("org.mariadb.jdbc.Driver");
            //Connection
            Connection connection = DriverManager
                    .getConnection("jdbc:mariadb://localhost:3306/demo?user=root&password=123123555");
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into students values('000003', 'Jenny')");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
