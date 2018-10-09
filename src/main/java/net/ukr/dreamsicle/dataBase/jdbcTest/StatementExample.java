package net.ukr.dreamsicle.dataBase.jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import static net.ukr.dreamsicle.dataBase.Configs.*;

public class StatementExample {
    void getStatement() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             java.sql.Statement statement = connection.createStatement()) {
            Class.forName(DB_DRIVER);
            if (!connection.isClosed()) {
                System.out.println("Connection successful");
            }

            String nameTable = "Books";

            getDropTable(statement, nameTable);
            statement.executeUpdate("create table IF NOT EXISTS " + nameTable + " (id int not null AUTO_INCREMENT, name VARCHAR(30) not null, PRIMARY KEY(id));");
            statement.executeUpdate("insert into " + nameTable + "(name) values ('Inferno')");
            statement.executeUpdate("insert into " + nameTable + " set name = 'Solomon key'");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + nameTable);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println("------------");
            }
            System.out.println("___________________");

            ResultSet resultSet1 = statement.executeQuery("SELECT name from " + nameTable + " where id = 1");
            while (resultSet1.next()) {
//                System.out.println(resultSet1.getInt("id"));
                System.out.println(resultSet1.getString("name"));
                System.out.println(resultSet1.getFetchSize());
            }

            System.out.println(resultSet1.getFetchSize());


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private void getDropTable(java.sql.Statement statement, String nameTable) throws SQLException {
        statement.executeUpdate("drop table " + nameTable);
    }
}
