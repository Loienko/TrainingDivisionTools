package net.ukr.dreamsicle.read_write_copy_file;

import net.ukr.dreamsicle.logger.Logger;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {
    private void getReadFile(String path) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {

            while (bufferedReader.readLine() != null) {
                System.out.println(bufferedReader.readLine());
            }
        } catch (IOException e) {
            Logger.log(e.toString());
        }
    }

    @Test
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        readFile.getReadFile("C:\\Training_division_tools\\Log\\logger.txt");
    }
}
