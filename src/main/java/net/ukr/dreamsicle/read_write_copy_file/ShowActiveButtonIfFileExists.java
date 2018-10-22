package net.ukr.dreamsicle.read_write_copy_file;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ShowActiveButtonIfFileExists {
    /**
     * Show Active Button If File Exists
     *
     * @param jButton
     * @param path
     */
    public void getShowActiveButtonIfFileExists(JButton jButton, String path) {
        File files = new File(path);
        if (files.exists()) {
            jButton.setEnabled(true);
            jButton.setBackground(new Color(0x5BC2B5));
        } else {
            jButton.setEnabled(false);
        }
    }
}
