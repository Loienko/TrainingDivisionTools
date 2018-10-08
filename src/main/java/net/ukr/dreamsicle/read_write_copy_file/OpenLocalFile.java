package net.ukr.dreamsicle.read_write_copy_file;

import net.ukr.dreamsicle.logger.Logger;

import java.io.IOException;

public class OpenLocalFile {

    public static void openLocalFile(String pathFileName) {
        Runtime runtime = Runtime.getRuntime();
        Process proc = null;
        try {
            p = runtime.exec("cmd /c start " + pathFileName);
            p.waitFor();
        } catch (IOException e) {
            Logger.log(e, "Не возможно установить связь с программой");
        }
    }
}
