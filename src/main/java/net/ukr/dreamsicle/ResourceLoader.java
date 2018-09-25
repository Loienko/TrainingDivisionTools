package net.ukr.dreamsicle;

import java.awt.*;
import java.io.File;
import java.net.URL;

public class ResourceLoader {
    static ResourceLoader rl = new ResourceLoader();

    public static Image getImage(String pathFileAndFileName) {
        return Toolkit.getDefaultToolkit().getImage(rl.getClass().getResource(pathFileAndFileName));
    }

    public static String getFile(String pathFileAndFileName) {
        URL resource = rl.getClass().getResource(pathFileAndFileName);
        File file = new File(resource.getPath());
        String s = file.toString();
        return s;
    }
}
