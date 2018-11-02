package net.ukr.dreamsicle.schedule.updateWriteCreateTableToDB;

import net.ukr.dreamsicle.dataBase.ConnectionDataBase;
import net.ukr.dreamsicle.read_write_copy_file.ReadFileNameFromFolder;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static net.ukr.dreamsicle.dataBase.Configs.TABLE_NAME;
import static net.ukr.dreamsicle.date.TimeRightNow.getYearDate;
import static net.ukr.dreamsicle.staticData.StaticData.PATH_LIST_CADETS;

public class CreateTableToDB {
    private static ConnectionDataBase connectionDataBase = new ConnectionDataBase();
    private static Connection connection;

    public static void main(String[] args) {
        CreateTableToDB createTableToDB = new CreateTableToDB();
        createTableToDB.getCreateTableGroup();
    }

    public void getCreateTableGroup() {
        try {
            connection = connectionDataBase.getConnectionDB();
            getCreateTable(connection);

        } catch (ClassNotFoundException | SQLException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    private void getCreateTable(Connection connection) {
        ReadFileNameFromFolder readFileNameFromFolder = new ReadFileNameFromFolder();
        ArrayList<String> fileNameFromFolder = readFileNameFromFolder.getReadFileNameFromFolder(PATH_LIST_CADETS);

        try (Statement statement = connection.createStatement()) {
            for (String s : fileNameFromFolder) {
                String nameTable;
                String groupCadet;
                if (s.contains(".")) {
                    nameTable = s.replace(".", "drob") + "year" + getYearDate();
                    groupCadet = "'" + s.replace(".", "/") + "'";
                } else {
                    nameTable = s + "year" + getYearDate();
                    groupCadet = "'" + s + "'";
                }

                statement.execute("CREATE TABLE IF NOT EXISTS " + nameTable + " AS SELECT surname FROM " + TABLE_NAME
                        + " WHERE groupCadet = " + groupCadet);
                try {
                    if (!statement.execute("SELECT grade FROM " + nameTable)) {
                        statement.execute("ALTER TABLE " + nameTable + " ADD COLUMN grade INT, ADD dateEkzamen VARCHAR(60), ADD numberVedomosti VARCHAR(60)");
                    }
                } catch (Exception e) {
                    statement.execute("ALTER TABLE " + nameTable + " ADD COLUMN grade INT, ADD dateEkzamen VARCHAR(60), ADD numberVedomosti VARCHAR(60)");
                    continue;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
