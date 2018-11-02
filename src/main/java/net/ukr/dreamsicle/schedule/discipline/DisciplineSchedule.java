package net.ukr.dreamsicle.schedule.discipline;

import net.ukr.dreamsicle.ResourceLoader;
import net.ukr.dreamsicle.schedule.CommonMethodsForClassSchedule;
import net.ukr.dreamsicle.schedule.interfaceSchedule.ActiveItem;

import javax.swing.*;
import java.awt.*;
import java.util.TreeSet;

public class DisciplineSchedule implements ActiveItem {

    private CommonMethodsForClassSchedule commonMethodsForClassDisciplineDateSchedule = new CommonMethodsForClassSchedule();
    private DefaultListModel<String> dlmForClassDisciplineSchedule = new DefaultListModel<String>();
    private TreeSet<String> stringTreeSetForClassDisciplineSchedule = new TreeSet<String>();
    private JComboBox<?> disciplineScheduleField = new JComboBox();

    public void getNumberScheduleLabel(JPanel jPanelSchedule) {
        JLabel discipline = new JLabel("Дисциплiна:");
        discipline.setHorizontalAlignment(SwingConstants.LEFT);
        discipline.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        discipline.setBounds(25, 80, 140, 25);
        jPanelSchedule.add(discipline);
    }

    public void getButtonForInputNumber(JPanel jPanelSchedule, String tableForDisciplineSchedule, String columnDiscipline) {

        JToggleButton buttonForDisciplineDate = new JToggleButton();
        buttonForDisciplineDate.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/add_15.png")));
        buttonForDisciplineDate.setBackground(new Color(0x28AC0F));

        disciplineScheduleField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        disciplineScheduleField.setMaximumRowCount(200);

        commonMethodsForClassDisciplineDateSchedule.getReadDataFromDB(jPanelSchedule, tableForDisciplineSchedule, columnDiscipline, disciplineScheduleField, stringTreeSetForClassDisciplineSchedule);

        commonMethodsForClassDisciplineDateSchedule.getButtonAddData(tableForDisciplineSchedule, columnDiscipline, buttonForDisciplineDate, disciplineScheduleField, stringTreeSetForClassDisciplineSchedule, dlmForClassDisciplineSchedule);

        disciplineScheduleField.setBounds(170, 80, 550, 25);
        buttonForDisciplineDate.setBounds(730, 80, 35, 25);


        jPanelSchedule.add(disciplineScheduleField);
        jPanelSchedule.add(buttonForDisciplineDate);

        jPanelSchedule.validate();
    }


    @Override
    public String getActiveItem() {
        return commonMethodsForClassDisciplineDateSchedule.getActiveItemFromJComboBox(disciplineScheduleField);
    }
}
