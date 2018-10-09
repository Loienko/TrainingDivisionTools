package net.ukr.dreamsicle.courseOne;

import net.ukr.dreamsicle.listCadet.JFrameListCadets;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.jPanelFourWindow;
import static net.ukr.dreamsicle.courseOne.FirstCourseOneGroup.existsFile;
import static net.ukr.dreamsicle.staticData.StaticData.*;

public class FirstCourseFiveGroup  implements LabelClass{

    public FirstCourseFiveGroup() {
        getFiveGroup();
        getFiveOneGroup();
        getFiveTwoGroup();
        getFiveThreeGroup();
        getFiveFourGroup();
        getFiveFiveGroup();
        getLabel();
    }

    private void getFiveGroup() {
        firstFiveGroup = new JButton("группа 215");

        firstFiveGroup.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("215");
        });
        jPanelFourWindow.add(firstFiveGroup, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFiveOneGroup() {
        firstFiveGroupOne = new JButton("группа 215/1");

        firstFiveGroupOne.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("215.1");
        });
        jPanelFourWindow.add(firstFiveGroupOne, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFiveTwoGroup() {
        firstFiveGroupTwo = new JButton("группа 215/2");

        firstFiveGroupTwo.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("215.2");
        });
        jPanelFourWindow.add(firstFiveGroupTwo, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFiveThreeGroup() {
        firstFiveGroupThird = new JButton("группа 215/3");

        firstFiveGroupThird.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("215.3");
        });
        jPanelFourWindow.add(firstFiveGroupThird, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFiveFourGroup() {
        firstFiveGroupFour = new JButton("группа 215/4");

        firstFiveGroupFour.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("215.4");
        });
        jPanelFourWindow.add(firstFiveGroupFour, new GridBagConstraints(4, 5, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFiveFiveGroup() {
        firstFiveGroupFive = new JButton("группа 215/5");

        firstFiveGroupFive.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("215.5");
        });
        jPanelFourWindow.add(firstFiveGroupFive, new GridBagConstraints(5, 5, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    @Override
    public void getLabel() {
        JLabel label = new JLabel();
        label.setBackground(new Color(0x6333DD));
        label.setText("СД");

        jPanelFourWindow.add(label, new GridBagConstraints(6, 5, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
