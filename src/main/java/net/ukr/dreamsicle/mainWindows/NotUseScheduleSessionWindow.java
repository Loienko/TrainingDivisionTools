package net.ukr.dreamsicle.mainWindows;

import net.ukr.dreamsicle.ResourceLoader;
import net.ukr.dreamsicle.interfacePackage.Back;
import net.ukr.dreamsicle.schedule.Schedule;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.*;
import static net.ukr.dreamsicle.Window.jPanelFiveWindowArchive;
import static net.ukr.dreamsicle.Window.jPanelFourWindow;

public class NotUseScheduleSessionWindow implements Back {
    public void getScheduleSession() {

//        jPanelScheduleSession.setLayout(new GridBagLayout());

        getGroupScheduleSession();
//        getBack();

//        jPanelScheduleSession.updateUI();
//        jPanelScheduleSession.revalidate();
    }

    private void getGroupScheduleSession() {
        Schedule schedule = new Schedule();
    }

    @Override
    public void getBack() {
        JButton back = new JButton("Назад");
        back.setIcon(new ImageIcon(ResourceLoader.getImage("/image/undo.png")));

        back.addActionListener(e -> {
            jPanelMainWindow.setVisible(false);
            jPanelTwoWindow.setVisible(true);
            jPanelThreeWindow.setVisible(false);
            jPanelFourWindow.setVisible(false);
            jPanelFiveWindowArchive.setVisible(false);
            jPanelScheduleSession.setVisible(false);

            back.setSelected(false);
        });

        jPanelScheduleSession.add(back, new GridBagConstraints(10, 0, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
