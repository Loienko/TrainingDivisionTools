package net.ukr.dreamsicle.courseOne;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.jPanelFourWindow;
import static net.ukr.dreamsicle.courseOne.FirstCourseOneGroup.existsFile;

public class FirstCourseFiveGroup {

    public FirstCourseFiveGroup() {
        getFiveOneGroup();
        getFiveTwoGroup();
        getFiveThreeGroup();
        getFiveFourGroup();
        getFiveFiveGroup();
    }

    private void getFiveOneGroup() {
        JButton firstGroup = new JButton("группа 215/1");

        existsFile.getExistsFile(firstGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\215.1.txt");
//        firstGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Семестровый_план.xlsx"));

        jPanelFourWindow.add(firstGroup, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFiveTwoGroup() {
        JButton secondGroup = new JButton("группа 215/2");

        existsFile.getExistsFile(secondGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\215.2.txt");
//        secondGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Семейное_положение.xlsx"));

        jPanelFourWindow.add(secondGroup, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFiveThreeGroup() {
        JButton thirdGroup = new JButton("группа 215/3");

        existsFile.getExistsFile(thirdGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\215.3.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        jPanelFourWindow.add(thirdGroup, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFiveFourGroup() {
        JButton fourGroup = new JButton("группа 215/4");

        existsFile.getExistsFile(fourGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\215.4.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        jPanelFourWindow.add(fourGroup, new GridBagConstraints(4, 5, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFiveFiveGroup() {
        JButton fiveGroup = new JButton("группа 215/5");

        existsFile.getExistsFile(fiveGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\215.5.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        jPanelFourWindow.add(fiveGroup, new GridBagConstraints(5, 5, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
