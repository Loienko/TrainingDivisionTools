package net.ukr.dreamsicle.courseOne;

import net.ukr.dreamsicle.interfacePackage.LabelClass;
import net.ukr.dreamsicle.listCadet.JFrameListCadets;
import net.ukr.dreamsicle.read_write_copy_file.ShowActiveButtonIfFileExists;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.jPanelFourWindow;
import static net.ukr.dreamsicle.staticData.StaticData.*;

public class FirstCourseOneGroup implements LabelClass {


    static ShowActiveButtonIfFileExists showActiveButtonIfFileExists = new ShowActiveButtonIfFileExists();

    public FirstCourseOneGroup() {
        getLabel();

        getFirstGroup();
        getFirstOneGroup();
        getFirstTwoGroup();
        getFirstThreeGroup();
        getFirstFourGroup();
        getFirstFiveGroup();
    }

    private void getFirstGroup() {
        firstOneGroup = new JButton("группа 211");

        firstOneGroup.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("211");
        });

        jPanelFourWindow.add(firstOneGroup, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    public void getLabel() {
        JLabel label = new JLabel();
        label.setBackground(new Color(0x6333DD));
        label.setText("СД");

        jPanelFourWindow.add(label, new GridBagConstraints(6, 1, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }


    private void getFirstOneGroup() {
        firstOneGroupOne = new JButton("группа 211/1");

        firstOneGroupOne.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("211.1");
        });

        jPanelFourWindow.add(firstOneGroupOne, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFirstTwoGroup() {
        firstOneGroupTwo = new JButton("группа 211/2");

        firstOneGroupTwo.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("211.2");
        });

        jPanelFourWindow.add(firstOneGroupTwo, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }


    private void getFirstThreeGroup() {
        firstOneGroupThird = new JButton("группа 211/3");

        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstOneGroupThird, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\211.3.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFileWithDifferentFormats.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        firstOneGroupThird.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("211.3");
        });
        jPanelFourWindow.add(firstOneGroupThird, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFirstFourGroup() {
        firstOneGroupFour = new JButton("группа 211/4");

        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstOneGroupFour, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\211.4.txt");

        firstOneGroupFour.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("211.4");
        });
//        thirdGroup.addActionListener(e -> OpenLocalFileWithDifferentFormats.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        jPanelFourWindow.add(firstOneGroupFour, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFirstFiveGroup() {
        firstOneGroupFive = new JButton("группа 211/5");

        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstOneGroupFive, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\211.5.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFileWithDifferentFormats.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        firstOneGroupFive.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("211.5");
        });

        jPanelFourWindow.add(firstOneGroupFive, new GridBagConstraints(5, 1, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
