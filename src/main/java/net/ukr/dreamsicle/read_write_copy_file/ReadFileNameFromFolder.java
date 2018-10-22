package net.ukr.dreamsicle.read_write_copy_file;

import java.io.File;
import java.util.ArrayList;

import static net.ukr.dreamsicle.staticData.StaticData.pathListCadets;

public class ReadFileNameFromFolder {
    public static void main(String[] args) {
        ReadFileNameFromFolder readFileNameFromFolder = new ReadFileNameFromFolder();
        readFileNameFromFolder.getReadFileNameFromFolder(pathListCadets);
    }

    /**
     * Read File Name From Folder
     *
     * @param pathToFolder
     */
    public ArrayList<String> getReadFileNameFromFolder(String pathToFolder) {
        File file = new File(pathToFolder);

        File[] files = file.listFiles();

        ArrayList<String> list = new ArrayList<>();

        for (File fileName : files) {
            String name = fileName.getName();
            if (!name.equals("garbage.txt")) {
                list.add(name.substring(0, name.lastIndexOf(".")));
            }
        }
        return list;
    }
}
