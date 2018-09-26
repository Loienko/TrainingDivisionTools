package net.ukr.dreamsicle.courseOne;

import net.ukr.dreamsicle.listCadet.JFrameListCadets;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.jPanelFourWindow;
import static net.ukr.dreamsicle.courseOne.FirstCourseOneGroup.existsFile;
import static net.ukr.dreamsicle.staticData.StaticData.*;

public class FirstCourseThirdGroup {

    public FirstCourseThirdGroup() {
        getThirdOneGroup();
        getThirdTwoGroup();
        getThirdThreeGroup();
        getThirdFourGroup();
        getThirdFiveGroup();
    }

    private void getThirdOneGroup() {
        firstThreeGroupOne = new JButton("группа 213/1");

        existsFile.getExistsFile(firstThreeGroupOne, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\213.1.txt");
        firstThreeGroupOne.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("213.1");
        });
        jPanelFourWindow.add(firstThreeGroupOne, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getThirdTwoGroup() {
        firstThreeGroupTwo = new JButton("группа 213/2");

        existsFile.getExistsFile(firstThreeGroupTwo, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\213.2.txt");
        firstThreeGroupTwo.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("213.2");
        });
        jPanelFourWindow.add(firstThreeGroupTwo, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getThirdThreeGroup() {
        firstThreeGroupThird = new JButton("группа 213/3");

        existsFile.getExistsFile(firstThreeGroupThird, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\213.3.txt");
        firstThreeGroupThird.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("213.3");
        });
        jPanelFourWindow.add(firstThreeGroupThird, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getThirdFourGroup() {
        firstThreeGroupFour = new JButton("группа 213/4");

        existsFile.getExistsFile(firstThreeGroupFour, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\213.4.txt");
        firstThreeGroupFour.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("213.4");
        });
        jPanelFourWindow.add(firstThreeGroupFour, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getThirdFiveGroup() {
        firstThreeGroupFive = new JButton("группа 213/5");

        existsFile.getExistsFile(firstThreeGroupFive, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\213.5.txt");
        firstThreeGroupFive.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("213.5");
        });
        jPanelFourWindow.add(firstThreeGroupFive, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
