package net.ukr.dreamsicle.read_write_copy_file;

import javax.swing.*;
import java.io.File;

public class ExistsFile {
    public void getExistsFile(JButton jButton, String path) {
        File files = new File(path);
        if (files.exists()) {
            jButton.setEnabled(true);
        } else {
            jButton.setEnabled(false);
        }
    }
}
