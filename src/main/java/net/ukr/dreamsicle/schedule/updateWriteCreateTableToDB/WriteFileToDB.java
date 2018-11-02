package net.ukr.dreamsicle.schedule.updateWriteCreateTableToDB;

import net.ukr.dreamsicle.dataBase.ConnectionDataBase;
import net.ukr.dreamsicle.schedule.readFromExcelFile.ReadFromExcelFile;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static net.ukr.dreamsicle.staticData.StaticData.NAME_TABLE_DISCIPLINE;


public class WriteFileToDB {
    private ConnectionDataBase connectionDataBase = new ConnectionDataBase();

    public static void main(String[] args) {
        WriteFileToDB writeFileToDB = new WriteFileToDB();
        writeFileToDB.getWriteDataDisciplineToDB();
        System.out.println("0 OK");
    }

    /**
     * write disciplines to DB
     */
    public void getWriteDataDisciplineToDB() {
        ReadFromExcelFile readDisciplineFromExcelFile = new ReadFromExcelFile();
        StringBuilder readLineFromExcelFile = readDisciplineFromExcelFile.getReadLineFromExcelFile("C:\\Training_division_tools\\info\\Учебные_дисциплины.xlsx");

        String[] split = readLineFromExcelFile.toString().split("\n");

        String nameDiscipline = "nameOfTheDiscipline";
        try (Connection connectionDB = connectionDataBase.getConnectionDB();
             Statement statement = connectionDB.createStatement()) {

            statement.execute("DROP TABLE IF EXISTS " + NAME_TABLE_DISCIPLINE);
            statement.execute("CREATE TABLE IF NOT EXISTS " + NAME_TABLE_DISCIPLINE + "(id INT AUTO_INCREMENT NOT NULL PRIMARY KEY, " + nameDiscipline + " VARCHAR(200) NULL)");

            for (String s : split) {
                if (!s.equals("Навчальна дисципліна")) {
                    String replace = s.replace("'", "");
                    statement.executeUpdate("INSERT INTO " + NAME_TABLE_DISCIPLINE + " (" + nameDiscipline + ") VALUES ('" + replace + "')");
                }
            }

            /**
             * This code will be used during the next update of the program and its work with the database.
             */
            /*ResultSet resultSet = statement.executeQuery("SELECT " + nameDiscipline + " FROM " + NAME_TABLE_DISCIPLINE + " WHERE id = 4");

            String namesDisc = "Навчальна дисципліна";
            if (!resultSet.next()) {
                for (String s : split) {
                    if (!s.equals(namesDisc)) {
                        String replace = s.replace("'", "");
                        System.out.println(replace);
                        statement.executeUpdate("INSERT INTO " + NAME_TABLE_DISCIPLINE + " (" + nameDiscipline + ") VALUES ('" + replace + "')");
                    }
                }
            } else {
                ResultSet resultSetCount = statement.executeQuery("SELECT COUNT(*) FROM " + NAME_TABLE_DISCIPLINE);
                int rowCount = 0;
                if (resultSetCount.next()) {
                    rowCount = resultSetCount.getInt(1);
                    System.out.println(rowCount);
                }


                int count = split.length;
                System.out.println(count);
                for (int i = 1; i < count; i++) {
                    String s = split[i];
                    String replace = s.replace("'", "");
                    System.out.println(replace);
                    statement.execute("UPDATE " + NAME_TABLE_DISCIPLINE + " SET " + nameDiscipline + " = '" + replace + "' WHERE id = " + i);
                }
            }*/
        } catch (ClassNotFoundException | SQLException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
