package net.ukr.dreamsicle.schedule.readFromExcelFile;

import net.ukr.dreamsicle.logger.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ReadFromExcelFile {


    public static void main(String[] args) {
        ReadFromExcelFile readDisciplineFromExcelFile = new ReadFromExcelFile();
        StringBuilder readLineFromExcelFile = readDisciplineFromExcelFile.getReadLineFromExcelFile("C:\\Training_division_tools\\info\\Учебные_дисциплины.xlsx");

        String[] split = readLineFromExcelFile.toString().split("\n");
        for (String s : split) {
            System.out.println(s);
        }
    }

    /**
     * read file line by line from excel
     *
     * @param file
     * @return
     */
    public synchronized StringBuilder getReadLineFromExcelFile(String file) {
        StringBuilder builder = new StringBuilder();
        try (FileInputStream inputStream = new FileInputStream(new File(file));
             XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

            //инициализация листа под номером
            XSSFSheet sheet = workbook.getSheetAt(0);
            //проходимся по всем строкам
            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                //получаем ячейки в строке
                Iterator<Cell> cellIterator = row.cellIterator();
                //цикл в котором будем перебирать ячейки по строчно

                for (int i = 0; i < 1; i++) {
                    Cell cell = cellIterator.next();
                    String stringCellValue = cell.getStringCellValue();
                    builder.append(stringCellValue).append("\n");
                }
            }


        } catch (IOException e) {
            Logger.log(e, "Problem to open or found Excel file");
            JOptionPane.showMessageDialog(null, "Проблемы с открытием файла перезапустите программу!", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return builder;
    }
}
