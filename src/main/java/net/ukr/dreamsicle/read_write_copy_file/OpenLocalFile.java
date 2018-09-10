package net.ukr.dreamsicle.read_write_copy_file;

import net.ukr.dreamsicle.logger.Logger;

import java.io.IOException;

public class OpenLocalFile {
//    String pathFileName;

    public static void openLocalFile(String pathFileName) {
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("cmd /c start " + pathFileName);
        } catch (IOException e) {
            Logger.log(e.toString());
        }
    }
}
