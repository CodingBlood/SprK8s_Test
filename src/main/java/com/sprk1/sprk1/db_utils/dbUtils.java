package com.sprk1.sprk1.db_utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbUtils {
    private static final String JDBC_MYSQL_HOST = "jdbc:mysql://localhost:3306/";
    private static final String DB_NAME = "d";
    private static final String USERNAME = "root1";
    private static final String PASSWORD = "root_admin";

    public static Connection getConnected(){
        System.out.println("-------- MySQL JDBC Connection Testing ------------");
        try{
            return DriverManager.getConnection(JDBC_MYSQL_HOST + DB_NAME, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
