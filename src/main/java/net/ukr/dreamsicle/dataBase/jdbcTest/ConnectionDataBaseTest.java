package net.ukr.dreamsicle.dataBase.jdbcTest;

import net.ukr.dreamsicle.logger.Logger;
import org.junit.Test;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.swing.*;
import java.io.IOException;
import java.sql.*;

import static net.ukr.dreamsicle.dataBase.Configs.*;

public class ConnectionDataBaseTest {
    @Test
    public static void main(String[] args) {
        ConnectionDataBaseTest connectionDataBaseTest = new ConnectionDataBaseTest();
        connectionDataBaseTest.getConnectDB();
    }

    public ResultSet getConnectDB() {
        ResultSet createDBCommonTable = null;
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement statement = connection.createStatement()) {
            Class.forName(DB_DRIVER);
            if (!connection.isClosed()) {
                System.out.println("Connection successful");
                JOptionPane.showMessageDialog(null, "Соединение с БД установлено успешно!!!", "", JOptionPane.INFORMATION_MESSAGE);
            }

            createDBCommonTable = getCreateDBCommonTable(connection, statement);

        } catch (SQLException | ClassNotFoundException | IOException e) {
            e.printStackTrace();
            Logger.log(e, "No connect from DB");
            JOptionPane.showMessageDialog(null, "Нет соединения с БД", "", JOptionPane.WARNING_MESSAGE);
        }


        return createDBCommonTable;
    }

    private ResultSet getCreateDBCommonTable(Connection connection, Statement statement) throws SQLException, IOException {
        String nameTable = "BoksTest";

//        getDropTable(statement, nameTable);
//        getDBExampleDate(statement, connection);
//        getDBExampleScrollableRow(statement, connection);
//        getUpdateResultSet(statement, connection);
        ResultSet dbCash = getDBCash(statement, connection);
        return dbCash;
    }

    private ResultSet getDBCash(Statement statement, Connection connection) throws SQLException {
        String nameTable = "cashdb";

        getDropTable(statement, nameTable);
        statement.executeUpdate("create table IF NOT EXISTS " + nameTable + " (id int not null AUTO_INCREMENT, name VARCHAR(30) not null, PRIMARY KEY(id));");

        statement.executeUpdate("INSERT INTO " + nameTable + " (name) values ('Inferno')");
        statement.executeUpdate("INSERT INTO " + nameTable + " (name) values ('DaVinchi Code')");
        statement.executeUpdate("INSERT INTO " + nameTable + " (name) values ('Solomon key')");

//        CachedRowSet rowSet = new CachedRowSetImpl();
        RowSetFactory factory = RowSetProvider.newFactory();
        CachedRowSet cachedRowSet = factory.createCachedRowSet();

        Statement connectionStatement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet resultSet = connectionStatement.executeQuery("SELECT * FROM " + nameTable);
        cachedRowSet.populate(resultSet);
        return cachedRowSet;
    }

    private void getUpdateResultSet(Statement statement, Connection connection) throws SQLException {
        String nameTable = "updateRS";

        getDropTable(statement, nameTable);
        statement.executeUpdate("create table IF NOT EXISTS " + nameTable + " (id int not null AUTO_INCREMENT, name VARCHAR(30) not null, PRIMARY KEY(id));");

        statement.executeUpdate("INSERT INTO " + nameTable + " (name) values ('Inferno')");
        statement.executeUpdate("INSERT INTO " + nameTable + " (name) values ('DaVinchi Code')");
        statement.executeUpdate("INSERT INTO " + nameTable + " (name) values ('Solomon key')");

        Statement connectionStatement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet resultSet = connectionStatement.executeQuery("SELECT * FROM " + nameTable);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("name"));
        }

        resultSet.last();
        resultSet.updateString("name", "new Value");
        resultSet.updateRow();

        resultSet.moveToInsertRow();
        resultSet.updateString("name", "inserted row");
        resultSet.insertRow();

        resultSet.absolute(2);
        resultSet.deleteRow();

        resultSet.beforeFirst();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("name"));
        }


    }

    private void getDBExampleDate(Statement statement, Connection connection) throws SQLException {
        String nameTable = "date";

        statement.executeUpdate("create table IF NOT EXISTS " + nameTable + " (id int not null AUTO_INCREMENT, name VARCHAR(30) not null, dt DATE, PRIMARY KEY(id));");

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO " + nameTable + " (name, dt) values ('someName',?)");
        preparedStatement.setDate(1, new Date(1486512000021L));
        preparedStatement.execute();

        System.out.println(preparedStatement);


    }

    private void getDBExampleScrollableRow(Statement statement, Connection connection) throws SQLException {
        String nameTable = "scroll";

//        getDropTable(statement, nameTable);
        statement.executeUpdate("create table IF NOT EXISTS " + nameTable + " (id int not null AUTO_INCREMENT, name VARCHAR(30) not null, PRIMARY KEY(id));");

        statement.executeUpdate("INSERT INTO " + nameTable + " (name) values ('Inferno')");
        statement.executeUpdate("INSERT INTO " + nameTable + " (name) values ('DaVinchi Code')");
        statement.executeUpdate("INSERT INTO " + nameTable + " (name) values ('Solomon key')");

        Statement connectionStatement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//        PreparedStatement preparedStatement = connection.prepareStatement("", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

        ResultSet resultSet = connectionStatement.executeQuery("SELECT * FROM " + nameTable);
        if (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
        if (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
        if (resultSet.previous()) {
            System.out.println(resultSet.getString("name"));
        }
        if (resultSet.relative(2)) {
            System.out.println(resultSet.getString("name"));
        }
        if (resultSet.relative(-2)) {
            System.out.println(resultSet.getString("name"));
        }
        if (resultSet.absolute(2)) {
            System.out.println(resultSet.getString("name"));
        }
        if (resultSet.first()) {
            System.out.println(resultSet.getString("name"));
        }
        if (resultSet.last()) {
            System.out.println(resultSet.getString("name"));
        }

    }

    private void getDropTable(Statement statement, String nameTable) throws SQLException {
        statement.executeUpdate("drop table IF EXISTS " + nameTable);
    }
}