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
        new WriteFile("D:\\test\\BufferedWriter.txt", "fuck111");
        System.out.println("0 OK");

    }

    /**
     * write data to file
     *
     * @param filePath
     * @param text
     * @throws IOException
     */
    // обновляем файл с помощью BufferedWriter
    private void writeToFile(String filePath, String text) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(new File(filePath), true))
        ) {
            //теперь мы можем использовать метод write или метод append
            br.write(text);
            br.newLine();
        } catch (IOException e) {
            Logger.log(e, "Can`t write data to file. Problem I/O");
        }
    }
}
