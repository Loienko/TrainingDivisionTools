package net.ukr.dreamsicle.archive;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.*;

public class Archive {

    public static void getArchive() {
        jPanelFiveWindowArchive.setLayout(new GridBagLayout());

        getBackMainWindow();
    }

    public static void getBackMainWindow() {
        JToggleButton back = new JToggleButton("Назад");

        back.addActionListener(e -> {
            jPanelMainWindow.setVisible(true);
            jPanelTwoWindow.setVisible(false);
            jPanelThreeWindow.setVisible(false);
            jPanelFourWindow.setVisible(false);
            jPanelFiveWindowArchive.setVisible(false);
            back.setSelected(false);
        });

        jPanelFiveWindowArchive.add(back, new GridBagConstraints(8, 0, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

}
