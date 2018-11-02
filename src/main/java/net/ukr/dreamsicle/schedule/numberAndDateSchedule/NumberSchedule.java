package net.ukr.dreamsicle.schedule.numberAndDateSchedule;

import net.ukr.dreamsicle.ResourceLoader;
import net.ukr.dreamsicle.schedule.CommonMethodsForClassSchedule;
import net.ukr.dreamsicle.schedule.interfaceSchedule.ActiveItem;

import javax.swing.*;
import java.awt.*;
import java.util.TreeSet;

public class NumberSchedule implements ActiveItem {

    private CommonMethodsForClassSchedule commonMethodsForClassScheduleNumberSchedule = new CommonMethodsForClassSchedule();
    private DefaultListModel<String> dlmForClassNumberSchedule = new DefaultListModel<>();
    private TreeSet<String> stringTreeSetForClassNumberSchedule = new TreeSet<>();
    private JComboBox<?> numberScheduleField = new JComboBox();

    /**
     * Name label
     *
     * @param jPanelSchedule
     */
    public void getNumberScheduleLabel(JPanel jPanelSchedule) {
        JLabel numberSchedule = new JLabel("Номер вiдомостi");
        numberSchedule.setHorizontalAlignment(SwingConstants.LEFT);
        numberSchedule.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        numberSchedule.setBounds(25, 140, 140, 25);
        jPanelSchedule.add(numberSchedule);
    }

    /**
     * @param jPanelSchedule
     * @param tableForDateAndNumberSchedule
     * @param columnNumber
     */
    public void getButtonForInputNumber(JPanel jPanelSchedule, String tableForDateAndNumberSchedule, String columnNumber) {

        JToggleButton buttonForInputNumber = new JToggleButton();
        buttonForInputNumber.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/add_15.png")));

        buttonForInputNumber.setBackground(new Color(0x28AC0F));

        numberScheduleField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        numberScheduleField.setMaximumRowCount(200);

        commonMethodsForClassScheduleNumberSchedule.getReadDataFromDB(jPanelSchedule, tableForDateAndNumberSchedule, columnNumber, numberScheduleField, stringTreeSetForClassNumberSchedule);

        commonMethodsForClassScheduleNumberSchedule.getButtonAddData(tableForDateAndNumberSchedule, columnNumber, buttonForInputNumber, numberScheduleField, stringTreeSetForClassNumberSchedule, dlmForClassNumberSchedule);

        numberScheduleField.setBounds(170, 140, 150, 25);
        buttonForInputNumber.setBounds(330, 140, 35, 25);

        jPanelSchedule.add(numberScheduleField);
        jPanelSchedule.add(buttonForInputNumber);

        jPanelSchedule.validate();
    }

    /**
     * getting the value of the active element
     *
     * @return
     */
    @Override
    public String getActiveItem() {
        return commonMethodsForClassScheduleNumberSchedule.getActiveItemFromJComboBox(numberScheduleField);
    }
}
