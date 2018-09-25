package net.ukr.dreamsicle.courseOne;

import net.ukr.dreamsicle.listCadet.JFrameListCadets;
import net.ukr.dreamsicle.read_write_copy_file.ExistsFile;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.jPanelFourWindow;

public class FirstCourseOneGroup {

    static ExistsFile existsFile = new ExistsFile();

    public FirstCourseOneGroup() {
        getLabel();

        getFirstOneGroup();
        getFirstTwoGroup();
        getFirstThreeGroup();
        getFirstFourGroup();
        getFirstFiveGroup();
    }

    private void getLabel() {
        JLabel label = new JLabel();
        label.setBackground(new Color(122, 45, 255));
        label.setForeground(new Color(255, 21, 0));
        label.setText(".........");

//        firstGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Семестровый_план.xlsx"));

        jPanelFourWindow.add(label, new GridBagConstraints(6, 1, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }


    private void getFirstOneGroup() {
        JButton firstGroup = new JButton("группа 211/1");


        existsFile.getExistsFile(firstGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\211.1.txt");
//        firstGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Семестровый_план.xlsx"));

        firstGroup.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("211.1");
        });


        jPanelFourWindow.add(firstGroup, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFirstTwoGroup() {
        JButton secondGroup = new JButton("группа 211/2");

        existsFile.getExistsFile(secondGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\211.2.txt");

        secondGroup.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("211.2");
        });
//        secondGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Семейное_положение.xlsx"));

        jPanelFourWindow.add(secondGroup, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }


    private void getFirstThreeGroup() {
        JButton thirdGroup = new JButton("группа 211/3");

        existsFile.getExistsFile(thirdGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\211.3.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        thirdGroup.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("211.2");
        });
        jPanelFourWindow.add(thirdGroup, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFirstFourGroup() {
        JButton fourGroup = new JButton("группа 211/4");

        existsFile.getExistsFile(fourGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\211.4.txt");

        fourGroup.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("211.4");
        });
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        jPanelFourWindow.add(fourGroup, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFirstFiveGroup() {
        JButton fiveGroup = new JButton("группа 211/5");

        existsFile.getExistsFile(fiveGroup, "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\211.5.txt");
//        thirdGroup.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Год.xlsx"));

        jPanelFourWindow.add(fiveGroup, new GridBagConstraints(5, 1, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
