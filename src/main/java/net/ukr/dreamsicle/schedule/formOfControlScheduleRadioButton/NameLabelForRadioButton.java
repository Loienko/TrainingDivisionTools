package net.ukr.dreamsicle.schedule.formOfControlScheduleRadioButton;

import javax.swing.*;
import java.awt.*;

/**
 * Name label for radio button
 */
public class NameLabelForRadioButton {
    public void getNameLabelRadioButton(JPanel jPanelSchedule) {
        JLabel formOfControl = new JLabel("Форма контролю:");
        formOfControl.setHorizontalAlignment(SwingConstants.LEFT);
        formOfControl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        formOfControl.setBounds(25, 110, 140, 25);
        jPanelSchedule.add(formOfControl);
    }
}
