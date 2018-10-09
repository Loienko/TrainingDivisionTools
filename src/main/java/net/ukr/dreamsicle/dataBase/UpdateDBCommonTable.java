package net.ukr.dreamsicle.dataBase;

public class UpdateDBCommonTable {
    ConnectionDataBaseTest connectionDataBaseTest = new ConnectionDataBaseTest();

    public static void main(String[] args) {
        UpdateDBCommonTable updateDBCommonTable = new UpdateDBCommonTable();
        updateDBCommonTable.getUpdateDBCommonTable();
    }

    private void getUpdateDBCommonTable() {
        connectionDataBaseTest.getConnectDB();
    }
}
