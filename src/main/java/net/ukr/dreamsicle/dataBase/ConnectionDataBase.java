package net.ukr.dreamsicle.dataBase;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDataBase {
    private final static String DB_URL = "jdbc:mysql://localhost:3306/cadets?useSSL=false";
    private final static String DB_USERNAME = "root";
    private final static String DB_PASSWORD = "dream";
    private final static String DB_DRIVER = "com.mysql.jdbc.Driver";

    @Test
    public static void main(String[] args) {
        ConnectionDataBase connectionDataBase = new ConnectionDataBase();
        connectionDataBase.getConnectDB();
    }

    void getConnectDB() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connection successful!!!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }


    }
}
