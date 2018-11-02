package net.ukr.dreamsicle.schedule.numberAndDateSchedule;

import net.ukr.dreamsicle.dataBase.ConnectionDataBase;
import net.ukr.dreamsicle.logger.Logger;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableNumberDateAndDisciplineSchedule {
    private final String tableForDateSchedule = "table_for_date_schedule";
    private final String tableForNumberSchedule = "table_for_number_schedule";
    private final String tableForDisciplineSchedule = "table_for_discipline_schedule";

    private final String columnDate = "date";
    private final String columnNumber = "number";
    private final String columnDiscipline = "discipline";
    private ConnectionDataBase connectionDataBase = new ConnectionDataBase();

    public String getTableForDateSchedule() {
        return tableForDateSchedule;
    }

    public String getTableForNumberSchedule() {
        return tableForNumberSchedule;
    }

    public String getTableForDisciplineSchedule() {
        return tableForDisciplineSchedule;
    }

    public String getColumnDiscipline() {
        return columnDiscipline;
    }

    public String getColumnDate() {
        return columnDate;
    }

    public String getColumnNumber() {
        return columnNumber;
    }

    public void getCreateTableNumberAndDateSchedule() {
        try (Connection connectionDB = connectionDataBase.getConnectionDB();
             Statement statement = connectionDB.createStatement()) {
//            statement.execute("DROP TABLE IF EXISTS " + getTableForDateAndNumberSchedule());
            statement.execute("CREATE TABLE IF NOT EXISTS " + getTableForDateSchedule() + "(id INT AUTO_INCREMENT NOT NULL PRIMARY KEY," + getColumnDate() + " VARCHAR(200) NULL)");
            statement.execute("CREATE TABLE IF NOT EXISTS " + getTableForNumberSchedule() + "(id INT AUTO_INCREMENT NOT NULL PRIMARY KEY," + getColumnNumber() + " VARCHAR(200) NULL)");
            statement.execute("CREATE TABLE IF NOT EXISTS " + getTableForDisciplineSchedule() + "(id INT AUTO_INCREMENT NOT NULL PRIMARY KEY," + getColumnDiscipline() + " VARCHAR(500) NULL)");

        } catch (InstantiationException | InvocationTargetException | IllegalAccessException | NoSuchMethodException | ClassNotFoundException e) {
//            e.printStackTrace();
            Logger.log(e, "Error to create Table 'tableForDateAndNumberSchedule' and 'table_for_number_schedule' and 'table_for_discipline_schedule'");
        } catch (SQLException e) {
//            e.printStackTrace();
            Logger.log(e, "Error to write sql request");
        }
    }
}
