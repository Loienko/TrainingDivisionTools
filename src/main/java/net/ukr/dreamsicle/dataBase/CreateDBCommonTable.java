package net.ukr.dreamsicle.dataBase;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import static net.ukr.dreamsicle.dataBase.Configs.TABLE_NAME;

public class CreateDBCommonTable {
    static ArrayList<String> list = new ArrayList<>();

    /**
     * static add data to array
     * need to change this action
     */
    static {
        list.add("id");
        list.add("groupCadet");
        list.add("rank");
        list.add("surname");
        list.add("name");
        list.add("middleName");
        list.add("faculty");
        list.add("date");
        list.add("endSchoolPlace");
        list.add("endSchoolYear");
        list.add("wedding");
        list.add("livePlace");
        list.add("birthdayPlace");
        list.add("nationality");
        list.add("pilings");
        list.add("enrolledByOrder");
        list.add("outsideTheCompetition");
        list.add("registrationNumber");
        list.add("entranceRating");
        list.add("violation");
        list.add("positive");
        list.add("reasonForDeduction");
        list.add("orderNumber");
        list.add("orderDate");
        list.add("yearOfTheSet");
        list.add("transferToSpeciality");
        list.add("phone");
        list.add("transferredToSpecialization");
        list.add("transferToFaculty");
    }

    @Test
    public static void main(String[] args) {
        CreateDBCommonTable createDBCommonTable = new CreateDBCommonTable();
        String commonTable = createDBCommonTable.getInsertNameField();
        System.out.println(commonTable);
//        createDBCommonTable.readFromExcelToWriteDB("D:\\test\\tets.xlsx");
//        String s = createDBCommonTable.readFromExcelToWriteDB("C:\\Training_division_tools\\2018_год_поступления\\1_курс\\commonTable.xlsx");
//        System.out.println(s);

    }


    /**
     * Create column name for DB 'commonTable'
     *
     * @return String
     */
    protected String getCreateDBCommonTable() {
        StringBuilder builder = new StringBuilder();

        String s = list.get(0);
        builder.append(s).append(" INT NOT NULL AUTO_INCREMENT, ");

        for (int i = 1; i < list.size(); i++) {
            String getArrayData = list.get(i);
            builder.append(getArrayData + " VARCHAR(80), ");
        }

        builder.append("PRIMARY KEY(" + s + ")");
        return builder.toString();
    }

    /**
     * Create input param and count column for DB 'commonTable'
     *
     * @return
     */
    protected String getInsertQuestionMarkField() {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < list.size(); i++) {
            builder.append("?, ");
        }
        builder.deleteCharAt(builder.lastIndexOf(", "));
        return builder.toString();
    }

    /**
     * Create name column for INSERT data to DB 'columnTable'
     *
     * @return
     */
    protected String getInsertNameField() {
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i < list.size(); i++) {
            String s = list.get(i);
            builder.append(s + ", ");
        }
        builder.deleteCharAt(builder.lastIndexOf(", "));
        return builder.toString();
    }

    /**
     * read data from Excel file and write to DB
     *
     * @param path
     */
    protected synchronized void readFromExcelToWriteDB(String path, PreparedStatement preparedStatement) {
        try (FileInputStream inputStream = new FileInputStream(new File(path));
             XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator();
                String stringCellValue = "";
                for (int j = 1; j < list.size(); j++) {
                    try {
                        Cell cell = cellIterator.next();
                        stringCellValue = cell.getStringCellValue();
                    } catch (Exception e) {
                        stringCellValue = e.getLocalizedMessage();
                        continue;
                    }
                    preparedStatement.setString(j, stringCellValue);
                }
                preparedStatement.executeUpdate();
            }

            preparedStatement.execute("DELETE FROM " + TABLE_NAME + " WHERE id = 1");
            preparedStatement.executeUpdate();
            /*for (int i = 1; i < 300; i++) {

            }*/
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}
