package net.ukr.dreamsicle.removeFiles;

import java.io.File;

public class RemoveAllFilesInFolder {
    public RemoveAllFilesInFolder(String path) {
        for (File myFile : new File(path).listFiles())
            if (myFile.isFile()) myFile.delete();


    }
}
