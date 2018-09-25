package net.ukr.dreamsicle.dataBase;

public class UpdateDBCommonTable {
    ConnectionDataBase connectionDataBase = new ConnectionDataBase();

    private void getUpdateDBCommonTable() {
        connectionDataBase.getConnectDB();

    }

    public static void main(String[] args) {
        UpdateDBCommonTable updateDBCommonTable = new UpdateDBCommonTable();
        updateDBCommonTable.getUpdateDBCommonTable();

    }
}
