package net.ukr.dreamsicle.schedule.numberAndDateSchedule;


import net.ukr.dreamsicle.ResourceLoader;
import net.ukr.dreamsicle.schedule.CommonMethodsForClassSchedule;
import net.ukr.dreamsicle.schedule.interfaceSchedule.ActiveItem;

import javax.swing.*;
import java.awt.*;
import java.util.TreeSet;

public class DateSchedule implements ActiveItem {

    private CommonMethodsForClassSchedule commonMethodsForClassScheduleDateSchedule = new CommonMethodsForClassSchedule();
    private DefaultListModel<String> dlmForClassDateSchedule = new DefaultListModel<String>();
    private TreeSet<String> stringTreeSetForClassDateSchedule = new TreeSet<String>();
    private JComboBox<?> dateScheduleField = new JComboBox();

    /**
     * get date schedule label
     *
     * @param jPanelSchedule
     */
    public void getDateScheduleLabel(JPanel jPanelSchedule) {
        JLabel dateSchedule = new JLabel("Дата вiдомостi:");
        dateSchedule.setHorizontalAlignment(SwingConstants.LEFT);
        dateSchedule.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        dateSchedule.setBounds(410, 140, 160, 25);
        jPanelSchedule.add(dateSchedule);
    }

    /**
     * get date schedule text field
     *
     * @param jPanelSchedule
     * @param tableForDateAndNumberSchedule
     * @param columnDate
     * @param jPanelSchedule
     */
    public void getButtonForInputDate(JPanel jPanelSchedule, String tableForDateAndNumberSchedule, String columnDate) {
        JComboBox<?> dateScheduleField = new JComboBox();
        JToggleButton buttonForInputDate = new JToggleButton();
        buttonForInputDate.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/add_15.png")));
//        buttonForInputDate.setIcon(new ImageIcon(ResourceLoader.getImage("")));
        buttonForInputDate.setBackground(new Color(0x2AC80F));

//        dateScheduleField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        dateScheduleField.setMaximumRowCount(200);

        commonMethodsForClassScheduleDateSchedule.getReadDataFromDB(jPanelSchedule, tableForDateAndNumberSchedule, columnDate, dateScheduleField, stringTreeSetForClassDateSchedule);

        commonMethodsForClassScheduleDateSchedule.getButtonAddData(tableForDateAndNumberSchedule, columnDate, buttonForInputDate, dateScheduleField, stringTreeSetForClassDateSchedule, dlmForClassDateSchedule);

        dateScheduleField.setBounds(570, 140, 150, 25);
        buttonForInputDate.setBounds(730, 140, 35, 25);

        jPanelSchedule.add(dateScheduleField);
        jPanelSchedule.add(buttonForInputDate);

        jPanelSchedule.validate();
    }

    @Override
    public String getActiveItem() {
        return commonMethodsForClassScheduleDateSchedule.getActiveItemFromJComboBox(dateScheduleField);
    }
}
