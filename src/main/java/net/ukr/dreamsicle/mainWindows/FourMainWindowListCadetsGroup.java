package net.ukr.dreamsicle.mainWindows;

import net.ukr.dreamsicle.ResourceLoader;
import net.ukr.dreamsicle.courseOne.*;
import net.ukr.dreamsicle.read_write_copy_file.ExistsFile;
import net.ukr.dreamsicle.removeFiles.RemoveAllFilesInFolder;
import net.ukr.dreamsicle.showActiveButton.ShowActiveButtonGroup;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.*;

public class FourMainWindowListCadetsGroup {

    static ExistsFile existsFile = new ExistsFile();

    public static void getFourMainListWindow() {
        jPanelFourWindow.setLayout(new GridBagLayout());

        getBackTwoWindows();

        getGroupFirstPulpit();
        getGroupSecondPulpit();
        getGroupThirdPulpit();
        getGroupFourPulpit();
        getGroupFivePulpit();
        getGroupSixPulpit();
        getUpdateList();

        jPanelFourWindow.updateUI();
        jPanelFourWindow.revalidate();
    }

    private static void getGroupFirstPulpit() {
        new FirstCourseOneGroup();
    }

    private static void getGroupSecondPulpit() {
        new FirstCourseSecondGroup();
    }

    private static void getGroupThirdPulpit() {
        new FirstCourseThirdGroup();
    }

    private static void getGroupFourPulpit() {
        new FirstCourseFourGroup();
    }

    private static void getGroupFivePulpit() {
        new FirstCourseFiveGroup();
    }

    private static void getGroupSixPulpit() {
        new FirstCourseSixGroup();
    }

    public static void getBackTwoWindows() {
        JButton back = new JButton("Назад");
        back.setIcon(new ImageIcon(ResourceLoader.getImage("/image/undo.png")));

        back.addActionListener(e -> {
            jPanelMainWindow.setVisible(false);
            jPanelTwoWindow.setVisible(true);
            jPanelThreeWindow.setVisible(false);
            jPanelFourWindow.setVisible(false);
            jPanelFiveWindowArchive.setVisible(false);

            back.setSelected(false);
        });

        jPanelFourWindow.add(back, new GridBagConstraints(10, 0, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    public static void getUpdateList() {
        JToggleButton update = new JToggleButton("Обновить списки");
        update.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/update.png")));

        update.addActionListener(e -> {
            new RemoveAllFilesInFolder("C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\");
            new SortingCadetsByGroups("C:\\Training_division_tools\\2018_год_поступления\\1_курс\\commonTable.xlsx");

            ShowActiveButtonGroup showActiveButtonGroup = new ShowActiveButtonGroup();
            showActiveButtonGroup.getShowActiveButtonGroupCadets();

            update.setSelected(false);
        });


        jPanelFourWindow.add(update, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
