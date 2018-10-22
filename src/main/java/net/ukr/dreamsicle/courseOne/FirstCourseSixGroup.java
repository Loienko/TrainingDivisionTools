package net.ukr.dreamsicle.courseOne;

import net.ukr.dreamsicle.interfacePackage.LabelClass;
import net.ukr.dreamsicle.listCadet.JFrameListCadets;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.jPanelFourWindow;
import static net.ukr.dreamsicle.staticData.StaticData.*;

public class FirstCourseSixGroup  implements LabelClass {

    public FirstCourseSixGroup() {
        getSixGroup();
        getSixOneGroup();
        getSixTwoGroup();
        getSixThreeGroup();
        getSixFourGroup();
        getSixFiveGroup();
        getLabel();
    }

    private void getSixGroup() {
        firstSixGroup = new JButton("группа 216");

        firstSixGroup.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("216");
        });
        jPanelFourWindow.add(firstSixGroup, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getSixOneGroup() {
        firstSixGroupOne = new JButton("группа 216/1");

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

        firstSixGroupFive.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("216.5");
        });
        jPanelFourWindow.add(firstSixGroupFive, new GridBagConstraints(5, 6, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    @Override
    public void getLabel() {
        JLabel label = new JLabel();
        label.setBackground(new Color(0x6333DD));
        label.setText("СД");

        jPanelFourWindow.add(label, new GridBagConstraints(6, 6, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
