package net.ukr.dreamsicle.dataBase;

import net.ukr.dreamsicle.logger.Logger;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

import static net.ukr.dreamsicle.dataBase.Configs.*;

public class ConnectionDataBase {
    public static Connection connection;
    private static CreateDBCommonTable createDBCommonTable = new CreateDBCommonTable();

    /**
     * Connect to DB
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public Connection getConnectionDB() throws ClassNotFoundException, SQLException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String connectionDB = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME_DB + "?useSSL=false";
        Class.forName(DB_DRIVER).getDeclaredConstructor().newInstance();

        connection = DriverManager.getConnection(connectionDB, DB_USERNAME, DB_PASSWORD);
//        connection.setAutoCommit(true);
//        connection = DriverManager.getConnection(connectionDB, DB_USERNAME, DB_PASSWORD_WORK);
        if (!connection.isClosed()) {
            System.out.println("Connection successful");
//            JOptionPane.showMessageDialog(null, "Соединение с БД установлено успешно!!!", "", JOptionPane.INFORMATION_MESSAGE);
        }
        return connection;
    }

    /**
     * Drop and Create DB
     */
    protected void initDB() {
        String commonTable = createDBCommonTable.getCreateDBCommonTable();
        try (Statement statement = connection.createStatement()) {

            statement.execute("DROP TABLE IF EXISTS " + TABLE_NAME);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "(" + commonTable + ")");

        } catch (SQLException e) {
            Logger.log(e, "Problem to create DB 'common table'");
        }
    }

    /**
     * INSERT data to DB
     *
     * @throws SQLException
     */
    protected void getAddCadets() {
        String initNameField = createDBCommonTable.getInsertNameField();
        String insertQuestionMarkField = createDBCommonTable.getInsertQuestionMarkField();

        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO " + TABLE_NAME + " (" + initNameField + ") VALUES (" + insertQuestionMarkField + ")")) {
            createDBCommonTable.readFromExcelToWriteDB("C:\\Training_division_tools\\2018_год_поступления\\1_курс\\commonTable.xlsx", preparedStatement);
        } catch (Exception e) {
            e.printStackTrace();
            Logger.log(e, "Error to add cadets to BD");
        }
    }
}
