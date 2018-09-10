package net.ukr.dreamsicle.courseOne;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.jPanelFourWindow;
import static net.ukr.dreamsicle.courseOne.FirstCourseOneGroup.existsFile;

public class FirstCourseSecondGroup {

    public FirstCourseSecondGroup() {
        getSecondOneGroup();
        getSecondTwoGroup();
        getSecondThreeGroup();
        getSecondThreeGroup();
        getSecondFourGroup();
        getSecondFiveGroup();
    }

    private void getSecondOneGroup() {
        JButton firstGroup = new JButton("группа 212/1");

        existsFile.getExistsFile(firstGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\212.1.txt");
//        firstGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Семестровый_план.xlsx"));

        jPanelFourWindow.add(firstGroup, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSecondTwoGroup() {
        JButton secondGroup = new JButton("группа 212/2");

        existsFile.getExistsFile(secondGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\212.2.txt");
//        secondGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Семейное_положение.xlsx"));

        jPanelFourWindow.add(secondGroup, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSecondThreeGroup() {
        JButton thirdGroup = new JButton("группа 212/3");

        existsFile.getExistsFile(thirdGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\212.3.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        jPanelFourWindow.add(thirdGroup, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSecondFourGroup() {
        JButton fourGroup = new JButton("группа 212/4");

        existsFile.getExistsFile(fourGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\212.4.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        jPanelFourWindow.add(fourGroup, new GridBagConstraints(4, 2, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSecondFiveGroup() {
        JButton fiveGroup = new JButton("группа 212/5");

        existsFile.getExistsFile(fiveGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\212.5.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        jPanelFourWindow.add(fiveGroup, new GridBagConstraints(5, 2, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
