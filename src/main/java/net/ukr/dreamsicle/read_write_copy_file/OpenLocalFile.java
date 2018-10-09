package net.ukr.dreamsicle.read_write_copy_file;

import net.ukr.dreamsicle.logger.Logger;

import java.io.IOException;

public class OpenLocalFile {

    public static void openLocalFile(String pathFileName) {
        Runtime runtime = Runtime.getRuntime();
        Process process = null;
        try {
            process = runtime.exec("cmd /c start " + pathFileName);
            process.waitFor();
        } catch (InterruptedException | IOException e) {
            Logger.log(e, "Не возможно установить связь с программой или не закрыт поток");
        }
    }
}
