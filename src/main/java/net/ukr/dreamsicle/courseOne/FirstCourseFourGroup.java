package net.ukr.dreamsicle.courseOne;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.jPanelFourWindow;
import static net.ukr.dreamsicle.courseOne.FirstCourseOneGroup.existsFile;

public class FirstCourseFourGroup {

    public FirstCourseFourGroup() {
        getFourOneGroup();
        getFourTwoGroup();
        getFourThreeGroup();
        getFourFourGroup();
        getFourFiveGroup();
    }

    private void getFourOneGroup() {
        JButton firstGroup = new JButton("группа 214/1");

        existsFile.getExistsFile(firstGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\214.1.txt");
//        firstGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Семестровый_план.xlsx"));

        jPanelFourWindow.add(firstGroup, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFourTwoGroup() {
        JButton secondGroup = new JButton("группа 214/2");

        existsFile.getExistsFile(secondGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\214.2.txt");
//        secondGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Семейное_положение.xlsx"));

        jPanelFourWindow.add(secondGroup, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFourThreeGroup() {
        JButton thirdGroup = new JButton("группа 214/3");

        existsFile.getExistsFile(thirdGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\214.3.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        jPanelFourWindow.add(thirdGroup, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFourFourGroup() {
        JButton fourGroup = new JButton("группа 214/4");

        existsFile.getExistsFile(fourGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\214.4.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        jPanelFourWindow.add(fourGroup, new GridBagConstraints(4, 4, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFourFiveGroup() {
        JButton fiveGroup = new JButton("группа 214/5");

        existsFile.getExistsFile(fiveGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\214.5.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        jPanelFourWindow.add(fiveGroup, new GridBagConstraints(5, 4, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
