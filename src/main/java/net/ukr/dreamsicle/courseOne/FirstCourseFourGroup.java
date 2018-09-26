package net.ukr.dreamsicle.courseOne;

import net.ukr.dreamsicle.listCadet.JFrameListCadets;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.jPanelFourWindow;
import static net.ukr.dreamsicle.staticData.StaticData.*;

public class FirstCourseFourGroup {

    public FirstCourseFourGroup() {
        getFourOneGroup();
        getFourTwoGroup();
        getFourThreeGroup();
        getFourFourGroup();
        getFourFiveGroup();
    }

    private void getFourOneGroup() {
        firstFourGroupOne = new JButton("группа 214/1");

        firstFourGroupOne.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("214.1");
        });
        jPanelFourWindow.add(firstFourGroupOne, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFourTwoGroup() {
        firstFourGroupTwo = new JButton("группа 214/2");

        firstFourGroupTwo.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("214.2");
        });
        jPanelFourWindow.add(firstFourGroupTwo, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFourThreeGroup() {
        firstFourGroupThird = new JButton("группа 214/3");

        firstFourGroupThird.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("214.3");
        });
        jPanelFourWindow.add(firstFourGroupThird, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFourFourGroup() {
        firstFourGroupFour = new JButton("группа 214/4");

        firstFourGroupFour.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("214.4");
        });
        jPanelFourWindow.add(firstFourGroupFour, new GridBagConstraints(4, 4, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private void getFourFiveGroup() {
        firstFourGroupFive = new JButton("группа 214/5");

        firstFourGroupFive.addActionListener(e -> {
            JFrameListCadets jFrameListCadets = new JFrameListCadets();
            jFrameListCadets.getJFrameListCadets("214.5");
        });
        jPanelFourWindow.add(firstFourGroupFive, new GridBagConstraints(5, 4, 1, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
