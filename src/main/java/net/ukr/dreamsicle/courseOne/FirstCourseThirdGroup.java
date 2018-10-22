package net.ukr.dreamsicle.courseOne;

import net.ukr.dreamsicle.interfacePackage.LabelClass;
import net.ukr.dreamsicle.listCadet.JFrameListCadets;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.jPanelFourWindow;
import static net.ukr.dreamsicle.staticData.StaticData.*;

public class FirstCourseThirdGroup  implements LabelClass {

    public FirstCourseThirdGroup() {
        getThirdGroup();
        getThirdOneGroup();
        getThirdTwoGroup();
        getThirdThreeGroup();
        getThirdFourGroup();
        getThirdFiveGroup();
        getLabel();
    }

    private void getThirdGroup() {
        firstThreeGroup = new JButton("группа 213");

        firstThreeGroup.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("213");
        });
        jPanelFourWindow.add(firstThreeGroup, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getThirdOneGroup() {
        firstThreeGroupOne = new JButton("группа 213/1");

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

        firstThreeGroupFive.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("213.5");
        });
        jPanelFourWindow.add(firstThreeGroupFive, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    @Override
    public void getLabel() {
        JLabel label = new JLabel();
        label.setBackground(new Color(0x6333DD));
        label.setText("СД");

        jPanelFourWindow.add(label, new GridBagConstraints(6, 3, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
