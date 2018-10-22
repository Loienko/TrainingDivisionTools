package net.ukr.dreamsicle.dataBase;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class UpdateDBCommonTable {
    public static void main(String[] args) {
        UpdateDBCommonTable updateDBCommonTable = new UpdateDBCommonTable();
        updateDBCommonTable.getUpdateDBCommonTable();
    }

    public void getUpdateDBCommonTable() {
        ConnectionDataBase connectionDataBase = new ConnectionDataBase();
        try {
            connectionDataBase.getConnectionDB();
            connectionDataBase.initDB();
            connectionDataBase.getAddCadets();
        } catch (SQLException | ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
