package net.ukr.dreamsicle.courseOne;

import net.ukr.dreamsicle.logger.Logger;
import net.ukr.dreamsicle.read_write_copy_file.WriteExcelFile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Iterator;

public class SortingCadetsByGroups {

    public SortingCadetsByGroups(String file, int numberCell) {
        readFromExcelSortedCadetsWriteToExcel(file, numberCell);
    }

    @Test
    public static void main(String[] args) {
        long start = new Date().getTime();
        System.out.println("go ->");
        new SortingCadetsByGroups("C:\\Training_division_tools\\2018_год_поступления\\1_курс\\commonTable.xlsx", 0);
        long end = new Date().getTime();
        System.out.println();
        long l = (end - start) / 1000;
        System.out.println(l + " сек");
    }

    private synchronized void readFromExcelSortedCadetsWriteToExcel(String file, int numberCell) {
        try {
            FileInputStream inputStream = new FileInputStream(new File(file));
            //инициализация листа для доступа к файлу
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            //инициализация листа под номером
            XSSFSheet sheet = workbook.getSheetAt(numberCell);
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

                    getSortedCadets(cellIterator, cell, stringCellValue);
                }
            }
        } catch (Exception e) {
            Logger.log(e.toString());
        }
    }

    private void getSortedCadets(Iterator<Cell> cellIterator, Cell cell, String stringCellValue) {
        StringBuilder builder = new StringBuilder();
        switch (stringCellValue) {
            case "211/1":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\211.1.txt");
                break;
            case "211/2":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\211.2.txt");
                break;
            case "211/3":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\211.3.txt");
                break;
            case "211/4":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\211.4.txt");
                break;
            case "211/5":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\211.5.txt");
                break;
            case "212/1":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\212.1.txt");
                break;
            case "212/2":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\212.2.txt");
                break;
            case "212/3":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\212.3.txt");
                break;
            case "212/4":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\212.4.txt");
                break;
            case "212/5":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\212.5.txt");
                break;
            case "213/1":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\213.1.txt");
                break;
            case "213/2":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\213.2.txt");
                break;
            case "213/3":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\213.3.txt");
                break;
            case "213/4":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\213.4.txt");
                break;
            case "213/5":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\213.5.txt");
                break;
            case "214/1":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\214.1.txt");
                break;
            case "214/2":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\214.2.txt");
                break;
            case "214/3":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\214.3.txt");
                break;
            case "214/4":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\214.4.txt");
                break;
            case "214/5":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\214.5.txt");
                break;
            case "215/1":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\215.1.txt");
                break;
            case "215/2":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\215.2.txt");
                break;
            case "215/3":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\215.3.txt");
                break;
            case "215/4":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\215.4.txt");
                break;
            case "215/5":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\215.5.txt");
                break;
            case "216/1":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\216.1.txt");
                break;
            case "216/2":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\216.2.txt");
                break;
            case "216/3":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\216.3.txt");
                break;
            case "216/4":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\216.4.txt");
                break;
            case "216/5":
                readAndWriteData(cellIterator, cell, builder, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\216.5.txt");
                break;
            default:
                            /*JOptionPane.showMessageDialog(null, "Возникла проблема при сортировке!!! " +
                                    "Перезапустите программу и попробуйте произвести действия еще раз!!! " +
                                    "При возникновении повторной ошибки, обратитесь к разработчику ПО.");*/
                break;
        }
    }

    private void readAndWriteData(Iterator<Cell> cellIterator, Cell cell, StringBuilder builder, String pathFile) {
        builder.append(cell + "\t\t");
        for (int j = 0; j < 4; j++) {
            Cell cells = cellIterator.next();
            builder.append(cells.getStringCellValue()).append("\t\t");
        }
        new WriteExcelFile(pathFile, builder.toString());
    }
}
