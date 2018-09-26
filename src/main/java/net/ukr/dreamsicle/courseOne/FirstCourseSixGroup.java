package net.ukr.dreamsicle.courseOne;

import net.ukr.dreamsicle.listCadet.JFrameListCadets;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.jPanelFourWindow;
import static net.ukr.dreamsicle.courseOne.FirstCourseOneGroup.existsFile;
import static net.ukr.dreamsicle.staticData.StaticData.*;

public class FirstCourseSixGroup {

    public FirstCourseSixGroup() {
        getSixOneGroup();
        getSixTwoGroup();
        getSixThreeGroup();
        getSixFourGroup();
        getSixFiveGroup();
    }

    private void getSixOneGroup() {
        firstSixGroupOne = new JButton("группа 216/1");

        existsFile.getExistsFile(firstSixGroupOne, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\216.1.txt");
        firstSixGroupOne.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("216.1");
        });
        jPanelFourWindow.add(firstSixGroupOne, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSixTwoGroup() {
        firstSixGroupTwo = new JButton("группа 216/2");

        existsFile.getExistsFile(firstSixGroupTwo, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\216.2.txt");
//        firstSixGroupTwo.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Семейное_положение.xlsx"));
        firstSixGroupTwo.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("216.2");
        });
        jPanelFourWindow.add(firstSixGroupTwo, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSixThreeGroup() {
        firstSixGroupThird = new JButton("группа 216/3");

        existsFile.getExistsFile(firstSixGroupThird, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\216.3.txt");
//        firstSixGroupThird.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));
        firstSixGroupThird.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("216.3");
        });
        jPanelFourWindow.add(firstSixGroupThird, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSixFourGroup() {
        firstSixGroupFour = new JButton("группа 216/4");

        existsFile.getExistsFile(firstSixGroupFour, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\216.4.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));
        firstSixGroupFour.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("216.4");
        });
        jPanelFourWindow.add(firstSixGroupFour, new GridBagConstraints(4, 6, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSixFiveGroup() {
        firstSixGroupFive = new JButton("группа 216/5");

        existsFile.getExistsFile(firstSixGroupFive, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\216.5.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));
        firstSixGroupFive.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("216.5");
        });
        jPanelFourWindow.add(firstSixGroupFive, new GridBagConstraints(5, 6, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

}
