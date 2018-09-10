package net.ukr.dreamsicle.test;

import net.ukr.dreamsicle.read_write_copy_file.CopyFile;
import resourses.ResourceLoader;

public class Test {
    public static void main(String[] args) {
//        OpenLocalFile.openLocalFile(ResourceLoader.getFile("file/Год.xlsx"));
        CopyFile.getCopyFile(ResourceLoader.getFile("file/Год.xlsx"), "D:/Год.xlsx");
    }
}
