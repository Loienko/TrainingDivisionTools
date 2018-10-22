package net.ukr.dreamsicle.dataBase;

import net.ukr.dreamsicle.date.TimeRightNow;

public class Configs {
    public static TimeRightNow timeRightNow = new TimeRightNow();


    public final static String DB_HOST = "localhost";
    public final static String DB_PORT = "3306";
    public final static String DB_URL = "jdbc:mysql://localhost:3306/cadets?useSSL=false";
    public final static String DB_USERNAME = "root";
    public final static String DB_PASSWORD = "dream";
    public final static String DB_PASSWORD_WORK = "root";
    public final static String DB_DRIVER = "com.mysql.jdbc.Driver";
    public final static String DB_NAME_DB = "cadets";
    public final static String TABLE_NAME = "commonTable_" + TimeRightNow.getYearDate() + "_" + "entrance";
    public final static String CREATE_TABLE_COMMON_TABLE = "";

}
