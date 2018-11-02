package net.ukr.dreamsicle.schedule.formOfControlScheduleRadioButton;

import javax.swing.*;

public class GroupRadioButtonFormOfControl {
    private ButtonGroup groupRadioButtonFormOfControl = new ButtonGroup();

    /**
     * create formOfControlScheduleRadioButton
     *
     * @param jPanelSchedule
     */
    public void getGroupRadioButtonFormOfControl(JPanel jPanelSchedule) {
        JRadioButton exam = new JRadioButton("Е", true);
        exam.setActionCommand("E");
        exam.setBounds(300, 110, 80, 25);
        groupRadioButtonFormOfControl.add(exam);
        jPanelSchedule.add(exam);

        JRadioButton homeWork = new JRadioButton("ДЗ", false);
        homeWork.setActionCommand("ДЗ");
        homeWork.setBounds(580, 110, 80, 25);
        groupRadioButtonFormOfControl.add(homeWork);
        jPanelSchedule.add(homeWork);
    }

    /**
     * get active button action
     *
     * @return actionCommand
     */
    private String getActionGroupRadioButtonFormOfControl() {
        return groupRadioButtonFormOfControl.getSelection().getActionCommand();
    }
}
