package net.ukr.dreamsicle.read_write_copy_file;

import net.ukr.dreamsicle.logger.Logger;

import javax.swing.*;
import java.io.IOException;

public class OpenLocalFileWithDifferentFormats {

    /**
     * open local file with different format
     *
     * @param pathFileName
     */
    public static void getOpenLocalFileWithDifferentFormats(String pathFileName) {
        Runtime runtime = Runtime.getRuntime();
        try {
            Process proc = runtime.exec("cmd /c start " + pathFileName);
            proc.waitFor();
            System.out.println("Waiting over");
        } catch (IOException | InterruptedException e) {
            Logger.log(e, "Не возможно установить связь с программой или прерван поток");
            JOptionPane.showMessageDialog(null, "Программе необходимо знать какую программу исполозовать для этого!",
                    "Не удалось открыть файл!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
