package net.ukr.dreamsicle.read_write_copy_file;

import net.ukr.dreamsicle.logger.Logger;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void getCopyFile(String copyFirstInputFile, String copySecondOutputFile) {
        try (FileInputStream inputStream = new FileInputStream(copyFirstInputFile)) {
//            File directory = new File("src/res/folder");
//            if (!directory.exists()) directory.mkdir();

            try (FileOutputStream outputStream = new FileOutputStream(copySecondOutputFile)) {
                byte[] bytes = new byte[inputStream.available()];
                int length;

                while ((length = inputStream.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, length);
                    outputStream.flush();
                }
            } catch (IOException e) {
                Logger.log(e.toString());
            }
        } catch (IOException e) {
            Logger.log(e.toString());
        }
    }
}
