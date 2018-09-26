package net.ukr.dreamsicle.courseOne;

import net.ukr.dreamsicle.listCadet.JFrameListCadets;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.jPanelFourWindow;
import static net.ukr.dreamsicle.courseOne.FirstCourseOneGroup.existsFile;
import static net.ukr.dreamsicle.staticData.StaticData.*;

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
        firstTwoGroupOne = new JButton("группа 212/1");

        existsFile.getExistsFile(firstTwoGroupOne, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\212.1.txt");
        firstTwoGroupOne.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("212.1");
        });

        jPanelFourWindow.add(firstTwoGroupOne, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSecondTwoGroup() {
        firstTwoGroupTwo = new JButton("группа 212/2");

        existsFile.getExistsFile(firstTwoGroupTwo, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\212.2.txt");
        firstTwoGroupTwo.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("212.2");
        });

        jPanelFourWindow.add(firstTwoGroupTwo, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSecondThreeGroup() {
        firstTwoGroupThird = new JButton("группа 212/3");

        existsFile.getExistsFile(firstTwoGroupThird, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\212.3.txt");
        firstTwoGroupThird.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("212.3");
        });

        jPanelFourWindow.add(firstTwoGroupThird, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSecondFourGroup() {
        firstTwoGroupFour = new JButton("группа 212/4");

        existsFile.getExistsFile(firstTwoGroupFour, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\212.4.txt");
        firstTwoGroupFour.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("212.4");
        });


        jPanelFourWindow.add(firstTwoGroupFour, new GridBagConstraints(4, 2, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSecondFiveGroup() {
        firstTwoGroupFive = new JButton("группа 212/5");

        existsFile.getExistsFile(firstTwoGroupFive, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\212.5.txt");
        firstTwoGroupFive.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("212.5");
        });

        jPanelFourWindow.add(firstTwoGroupFive, new GridBagConstraints(5, 2, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
