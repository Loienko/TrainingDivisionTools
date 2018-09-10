package net.ukr.dreamsicle.courseOne;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.jPanelFourWindow;
import static net.ukr.dreamsicle.courseOne.FirstCourseOneGroup.existsFile;

public class FirstCourseSixGroup {

    public FirstCourseSixGroup() {
        getSixOneGroup();
        getSixTwoGroup();
        getSixThreeGroup();
        getSixFourGroup();
        getSixFiveGroup();
    }

    private void getSixOneGroup() {
        JButton firstGroup = new JButton("группа 216/1");

        existsFile.getExistsFile(firstGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\216.1.txt");
//        firstGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Семестровый_план.xlsx"));

        jPanelFourWindow.add(firstGroup, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSixTwoGroup() {
        JButton secondGroup = new JButton("группа 216/2");

        existsFile.getExistsFile(secondGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\216.2.txt");
//        secondGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Семейное_положение.xlsx"));

        jPanelFourWindow.add(secondGroup, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSixThreeGroup() {
        JButton thirdGroup = new JButton("группа 216/3");

        existsFile.getExistsFile(thirdGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\216.3.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        jPanelFourWindow.add(thirdGroup, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSixFourGroup() {
        JButton fourGroup = new JButton("группа 216/4");

        existsFile.getExistsFile(fourGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\216.4.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        jPanelFourWindow.add(fourGroup, new GridBagConstraints(4, 6, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSixFiveGroup() {
        JButton fiveGroup = new JButton("группа 216/5");

        existsFile.getExistsFile(fiveGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\216.5.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        jPanelFourWindow.add(fiveGroup, new GridBagConstraints(5, 6, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

}
