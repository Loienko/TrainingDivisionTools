package net.ukr.dreamsicle.schedule.actionButtonPreview;

import net.ukr.dreamsicle.schedule.informationForSaveAndPreviewSchedule.InfoForSaveAndPreviewSchedule;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ActiveWindowsForPreview {
    private JTable table;
    private InfoForSaveAndPreviewSchedule infoForSaveAndPreviewSchedule = new InfoForSaveAndPreviewSchedule();


    public void getActiveWindowsForPreview(JPanel jPanelSchedule, JPanel jPanelPreviewWindow) {

        getActionSaveButtonFromPreviewWindow(jPanelPreviewWindow);

        getBack(jPanelSchedule, jPanelPreviewWindow);

        getLabelFromWindowPreviewSchedule(jPanelPreviewWindow);

        getTableFromWindowPreviewSchedule(jPanelPreviewWindow);
    }

    /**
     * view table from window preview schedule
     *
     * @param jPanelPreviewWindow
     */
    private void getTableFromWindowPreviewSchedule(JPanel jPanelPreviewWindow) {
        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null},
                        {null, null, null, null}, {null, null, null, null},},
                new String[]{"\u0424\u0410\u041C\u0418\u041B\u0418\u042F", "\u0418\u041C\u042F", "\u041E\u0422\u0427\u0415\u0421\u0422\u0412\u041E", "\u041E\u0426\u0415\u041D\u041A\u0410"}) {
            Class[] columnTypes = new Class[]{String.class, Object.class, Object.class, Integer.class};

            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });
        table.setBounds(32, 113, 718, 510);
        jPanelPreviewWindow.add(table);
    }

    /**
     * get label from window preview schedule
     *
     * @param jPanelPreviewWindow
     */
    private void getLabelFromWindowPreviewSchedule(JPanel jPanelPreviewWindow) {
        JLabel labelDisciplineSchedule = new JLabel();
        String textLabelDisciplineSchedule = infoForSaveAndPreviewSchedule.getItemDisciplineFromScheduleWindow();
        labelDisciplineSchedule.setText(textLabelDisciplineSchedule);
        labelDisciplineSchedule.setHorizontalAlignment(SwingConstants.CENTER);
        labelDisciplineSchedule.setBounds(40, 70, 690, 25);
        jPanelPreviewWindow.add(labelDisciplineSchedule);

        JLabel labelDateSchedule = new JLabel();
        String textLabelDateSchedule = "Дата ведомости";
        labelDateSchedule.setText(textLabelDateSchedule);
        labelDateSchedule.setHorizontalAlignment(SwingConstants.CENTER);
        labelDateSchedule.setBounds(180, 40, 90, 25);
        jPanelPreviewWindow.add(labelDateSchedule);

        JLabel labelGroupSchedule = new JLabel();
        String textLabelGroupSchedule = "Група";
        labelGroupSchedule.setText(textLabelGroupSchedule);
        labelGroupSchedule.setHorizontalAlignment(SwingConstants.CENTER);
        labelGroupSchedule.setBounds(360, 40, 46, 25);
        jPanelPreviewWindow.add(labelGroupSchedule);

        JLabel labelNumberSchedule = new JLabel();
        String textLabelNumberSchedule = "Номер ведомости";
        labelNumberSchedule.setText(textLabelNumberSchedule);
        labelNumberSchedule.setHorizontalAlignment(SwingConstants.CENTER);
        labelNumberSchedule.setBounds(490, 40, 102, 25);
        jPanelPreviewWindow.add(labelNumberSchedule);
    }

    /**
     * get action button save from window preview schedule
     *
     * @param jPanelPreviewWindow
     */
    private void getActionSaveButtonFromPreviewWindow(JPanel jPanelPreviewWindow) {
        JToggleButton save = new JToggleButton("СОХРАНИТЬ");
        save.setSelected(false);
        save.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
        save.setBounds(30, 35, 120, 25);
        jPanelPreviewWindow.add(save);
    }

    /**
     * action button back from window preview schedule
     *
     * @param jPanelSchedule
     * @param jPanelPreviewWindow
     */
    private void getBack(JPanel jPanelSchedule, JPanel jPanelPreviewWindow) {
        JToggleButton back = new JToggleButton("НАЗАД");
        back.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
        back.addActionListener(e -> {
            if (back.isSelected()) {
                jPanelPreviewWindow.setVisible(false);
                jPanelSchedule.setVisible(true);

                back.setSelected(false);
            }
        });

        back.setBounds(630, 35, 120, 25);
        jPanelPreviewWindow.add(back);
    }
}
