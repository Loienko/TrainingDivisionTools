package net.ukr.dreamsicle.dataBase.jdbcTest;

import java.sql.*;

import static net.ukr.dreamsicle.dataBase.Configs.*;

public class PreparedStatementExample {
    void getPreparedStatement() {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement statement = connection.createStatement()) {

            Class.forName(DB_DRIVER);
            if (!connection.isClosed()) {
                System.out.println("Connection successful");
            }


            String nameTable = "Users";

            getDropTable(statement, nameTable);
            statement.executeUpdate("create table IF NOT EXISTS " + nameTable + " (id int not null AUTO_INCREMENT, name VARCHAR(30) not null, password VARCHAR(30) not null, PRIMARY KEY(id));");
            statement.executeUpdate("insert into " + nameTable + "(name, password) values ('max', '123')");
            statement.executeUpdate("insert into " + nameTable + " set name = 'Other guy', password = '321'");


            String userID = "2";
            java.sql.PreparedStatement preparedStatement = connection.prepareStatement("SELECT  * FROM " + nameTable + " WHERE id = ?");
            preparedStatement.setString(1, userID);
//            preparedStatement.setString(2, "userName");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("userName: " + resultSet.getString("name"));
                System.out.println("userPassword: " + resultSet.getString("password"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private void getDropTable(Statement statement, String nameTable) throws SQLException {
        statement.executeUpdate("drop table " + nameTable);
    }
}
