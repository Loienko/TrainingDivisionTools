package net.ukr.dreamsicle.read_write_copy_file;

import net.ukr.dreamsicle.listCadet.Users;
import net.ukr.dreamsicle.logger.Logger;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadFileLineByLine {

    @Test
    public static void main(String[] args) {
        ReadFileLineByLine readFile = new ReadFileLineByLine();
//        readFile.getLinesFromFile("C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\211.1.txt");
    }


    /**
     * line by line read from file
     *
     * @param fileName
     * @param beans
     */
    public void getLinesFromFile(String fileName, ArrayList<Users> beans) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String line;
            String[] split;
            while ((line = reader.readLine()) != null) {
                split = line.split("\t\t");

                beans.add(new Users(split[0], split[1], split[2], split[3]));
            }
        } catch (Exception e) {
            Logger.log(e, "Файл не найден");
        }
    }
}
