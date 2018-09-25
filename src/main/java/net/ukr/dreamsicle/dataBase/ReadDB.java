package net.ukr.dreamsicle.dataBase;

import java.sql.*;

public class ReadDB {

    private final static String URL = "jdbc:mysql://localhost:3306/cadets?useSSL=false";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "dream";

    public ReadDB() {
        getReadDB();
    }

    public static void main(String[] args) {
        new ReadDB();

    }

    private void getReadDB() {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement()) {

            statement.execute("drop TABLE people");
            statement.executeUpdate("CREATE TABLE people (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, name CHAR(30) NOT NULL, password CHAR(30) NOT NULL)");
            statement.executeUpdate("INSERT INTO people (name, password) VALUES ('max', '123')");
            statement.executeUpdate("INSERT INTO people SET name = 'otherGuy', password = '321'");

            String userId = "1";
            ResultSet resultSet = statement.executeQuery("select * from people where id = " + userId + "");
            while (resultSet.next()) {
                System.out.println("userName: " + resultSet.getString("name"));
                System.out.println("userPassword: " + resultSet.getString("password"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
