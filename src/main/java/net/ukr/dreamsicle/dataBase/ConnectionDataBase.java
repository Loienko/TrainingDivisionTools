package net.ukr.dreamsicle.dataBase;

import net.ukr.dreamsicle.logger.Logger;

import javax.swing.*;
import java.sql.*;

import static net.ukr.dreamsicle.dataBase.Configs.*;

public class ConnectionDataBase {
    static CreateDBCommonTable createDBCommonTable = new CreateDBCommonTable();
    private static Connection connection;

    private static void initDB() throws SQLException {
        String commonTable = createDBCommonTable.getCreateDBCommonTable();
        try (Statement statement = connection.createStatement()) {
            statement.execute("DROP TABLE IF EXISTS " + TABLE_NAME);
            statement.execute("CREATE TABLE " + TABLE_NAME + "(" +
                    commonTable + ")");

        } catch (Exception e) {
            Logger.log(e, "Ошибка создания таблицы в БД");
        }
    }

    private static void getAddCadets() throws SQLException {
        String initNameField = createDBCommonTable.getInsertNameField();
        String insertQuestionMarkField = createDBCommonTable.getInsertQuestionMarkField();

        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO " + TABLE_NAME + " (" + initNameField + ") VALUES (" + insertQuestionMarkField + ")")) {
//            preparedStatement.setString(1, "");
        }
    }

    public Connection getConnectionDB() throws ClassNotFoundException, SQLException {
        String connectionDB = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME_DB + "?useSSL=false";
        Class.forName(DB_DRIVER);

        connection = DriverManager.getConnection(connectionDB, DB_USERNAME, DB_PASSWORD);
        if (!connection.isClosed()) {
            System.out.println("Connection successful");
            JOptionPane.showMessageDialog(null, "Соединение с БД установлено успешно!!!", "", JOptionPane.INFORMATION_MESSAGE);
        }

        return connection;
    }

}
