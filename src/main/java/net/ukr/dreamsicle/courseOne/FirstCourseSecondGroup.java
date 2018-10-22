package net.ukr.dreamsicle.courseOne;

import net.ukr.dreamsicle.interfacePackage.LabelClass;
import net.ukr.dreamsicle.listCadet.JFrameListCadets;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.jPanelFourWindow;
import static net.ukr.dreamsicle.staticData.StaticData.*;

public class FirstCourseSecondGroup  implements LabelClass {

    public FirstCourseSecondGroup() {
        getSecondGroup();
        getSecondOneGroup();
        getSecondTwoGroup();
        getSecondThreeGroup();
        getSecondFourGroup();
        getSecondFiveGroup();
        getLabel();
    }

    private void getSecondGroup() {
        firstTwoGroup = new JButton("группа 212");

        firstTwoGroup.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("212");
        });

        jPanelFourWindow.add(firstTwoGroup, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSecondOneGroup() {
        firstTwoGroupOne = new JButton("группа 212/1");

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

        firstTwoGroupFive.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("212.5");
        });

        jPanelFourWindow.add(firstTwoGroupFive, new GridBagConstraints(5, 2, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    @Override
    public void getLabel() {
        JLabel label = new JLabel();
        label.setBackground(new Color(0x6333DD));
        label.setText("....");

        jPanelFourWindow.add(label, new GridBagConstraints(6, 2, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
