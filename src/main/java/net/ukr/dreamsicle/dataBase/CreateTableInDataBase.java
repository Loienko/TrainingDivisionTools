package net.ukr.dreamsicle.dataBase;

public class CreateTableInDataBase {
    ConnectionDataBase connectionDataBase = new ConnectionDataBase();

    public static void main(String[] args) {
        CreateTableInDataBase createTableInDataBase = new CreateTableInDataBase();
        createTableInDataBase.getCreateTableInDataBase();

    }

    private void getCreateTableInDataBase() {
        connectionDataBase.getConnectDB();

    }
}
