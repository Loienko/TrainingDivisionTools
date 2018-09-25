package net.ukr.dreamsicle.read_write_copy_file;

import net.ukr.dreamsicle.logger.Logger;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public WriteFile(String filePath, String text) {
        writeToFile(filePath, text);
    }

    @Test
    public static void main(String[] args) {
        new WriteFile("D:\\test\\BufferedWriter.txt", "OK");
        System.out.println("0 OK");

    }

    // обновляем файл с помощью BufferedWriter
    private void writeToFile(String filePath, String text) {
        File file = new File(filePath);

        try (FileWriter fr = new FileWriter(file, true);
             BufferedWriter br = new BufferedWriter(fr)
        ) {
            br.newLine();
            //теперь мы можем использовать метод write или метод append
            br.write(text);
        } catch (IOException e) {
            Logger.log(e, "Не возмножно записать данные в файл");
        }
    }
}
