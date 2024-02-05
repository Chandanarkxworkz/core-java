package com.xworkz.crud.repo.utils;

import com.xworkz.crud.constants.DBProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankUtils {
    public static Connection getConnection(){
        try {
            Class.forName(DBProperties.DRIVER_PATH.value);
            return DriverManager.getConnection(DBProperties.URL.value,DBProperties.USER.value, DBProperties.PASSWORD.value);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public static Connection getConnection() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            return DriverManager.getConnection(DBProperties.URL.value, DBProperties.USER.value, DBProperties.PASSWORD.value);
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return null;
//}
}

//public class BankUtils {
//    public static Connection getConnection() {
//        try {
//            Class.forName("DBProperties.DRIVER_PATH.value");
//           // Class.forName("com.mysql.cj.jdbc.Driver");
//
//
//            // Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Laptop_25_jan_2024", "root", "root@2024");
//           // return connection;
//           return DriverManager.getConnection(DBProperties.URL.value,DBProperties.USER.value,DBProperties.PASSWORD.value);
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return null;
//
//
//    }
//
//}
//
//
