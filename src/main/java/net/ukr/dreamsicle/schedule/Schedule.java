package net.ukr.dreamsicle.schedule;


import net.ukr.dreamsicle.ResourceLoader;
import net.ukr.dreamsicle.logger.Logger;
import org.junit.Test;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Schedule extends JFrame {
    private static final long serialVersionUID = 1L;

    private JTable table;
    private JTextField dateScheduleField;
    private JTextField numberDateScheduleField;

    @Test
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Schedule schedule = new Schedule();
        schedule.getWindowSchedule();
    }

    /**
     * window for input grade cadets
     */
    public void getWindowSchedule() {
        JFrame jFrameSchedule = new JFrame();
        JPanel jPanelSchedule = new JPanel();
        jFrameSchedule.add(jPanelSchedule);

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(jPanelSchedule);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            Logger.log(e, "Exception to install Look and Feel");
        }

        jFrameSchedule.setTitle("Вiдомостi");
        jFrameSchedule.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit defaultToolkit = Toolkit.getDefaultToolkit();

        Dimension dimension = defaultToolkit.getScreenSize();
        jFrameSchedule.setBounds(dimension.width / 2 - (800 / 2), dimension.height / 2 - (800 / 2),
                800, 600);
        jFrameSchedule.setLocationRelativeTo(null);

        jFrameSchedule.getContentPane().add(jPanelSchedule);
//        jFrameSchedule.getContentPane().setLayout(null);
        jPanelSchedule.setLayout(null);

        getAllMainMethod(jPanelSchedule);

        jPanelSchedule.setVisible(true);
        jFrameSchedule.setVisible(true);
    }

    /**
     * getting all the methods
     *
     * @param jPanelSchedule
     */
    private void getAllMainMethod(JPanel jPanelSchedule) {
        getHeadLabel(jPanelSchedule);

        getDateSchedule(jPanelSchedule);

        getNumberSchedule(jPanelSchedule);

        getDiscipline(jPanelSchedule);

        getRadioButtonFormOfControl(jPanelSchedule);

        getTableCadets(jPanelSchedule);

        getButtonNextPrevious(jPanelSchedule);

        getListGroupCadets(jPanelSchedule);

        getSeparator(jPanelSchedule);
    }

    /**
     * getting the cadets table from the DB and writing modified data to DB
     *
     * @param jPanelSchedule
     */
    private void getTableCadets(JPanel jPanelSchedule) {
        table = new JTable();
        table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        table.setSurrendersFocusOnKeystroke(true);
        table.setFillsViewportHeight(true);
        table.setCellSelectionEnabled(true);
        table.setColumnSelectionAllowed(true);
        table.setModel(new DefaultTableModel(new Object[][]{{null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null},
                {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null},
                {null, null}, {null, null}, {null, null}, {null, null}, {null, null},}, new String[]{"ФАМИЛИЯ", "ОЦЕНКА"}) {
            Class[] columnTypes = new Class[]{String.class, String.class};

            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });
        table.setBounds(350, 280, 300, 300);
        jPanelSchedule.add(table);
    }

    /**
     * go to next or previous group cadets for input grade
     *
     * @param jPanelSchedule
     */
    private void getButtonNextPrevious(JPanel jPanelSchedule) {
        JToggleButton previous = new JToggleButton("НАЗАД");
        previous.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        previous.setIcon(new ImageIcon(ResourceLoader.getImage("/image/undo.png")));
        previous.setBounds(10, 25, 150, 30);
        jPanelSchedule.add(previous);


        JToggleButton next = new JToggleButton("ВПЕРЕД");
        next.setHorizontalTextPosition(SwingConstants.LEFT);
        next.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        next.setIcon(new ImageIcon(ResourceLoader.getImage("/image/redo.png")));
        next.setBounds(570, 25, 150, 30);
        jPanelSchedule.add(next);
    }

    /**
     * read data from DB and write grade to DB
     *
     * @param jPanelSchedule
     */
    private void getListGroupCadets(JPanel jPanelSchedule) {
        JList<Object> list = new JList<>();
        list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        ArrayList<Object> lists = new ArrayList<>();
        JButton jButton = new JButton("211/1");
        JButton jButton1 = new JButton("211/2");
        lists.add(jButton);
        lists.add(jButton1);
        list.setModel(new AbstractListModel() {

            String[] strings = new String[]{jButton.getText(), jButton1.getText()};

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int index) {
                return strings[index];
            }
        });
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setBounds(75, 302, 103, 254);
        jPanelSchedule.add(list);
    }

    /**
     * Separator
     *
     * @param jPanelSchedule
     */
    private void getSeparator(JPanel jPanelSchedule) {
        JSeparator separatorHead = new JSeparator();
        separatorHead.setBounds(10, 70, 710, 2);
        jPanelSchedule.add(separatorHead);

        JSeparator separatorDown = new JSeparator();
        separatorDown.setBounds(10, 215, 710, 2);
        jPanelSchedule.add(separatorDown);
    }

    /**
     * Discipline for schedule
     *
     * @param jPanelSchedule
     */
    private void getDiscipline(JPanel jPanelSchedule) {
        JLabel discipline = new JLabel("Дисциплiна:");
        discipline.setHorizontalAlignment(SwingConstants.LEFT);
        discipline.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        discipline.setBounds(25, 100, 140, 25);
        jPanelSchedule.add(discipline);

        JComboBox<?> comboBox = new JComboBox();
        comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        comboBox.setForeground(UIManager.getColor("Button.focus"));
        comboBox.setMaximumRowCount(200);
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"<html>\u0412\u0438\u0449\u0430 \u043C\u0430\u0442\u0435\u043C\u0430\u0442\u0438\u043A\u0430</html>",
                "<html>\u0423\u043A\u0440\u0430\u0457\u043D\u0441\u044C\u043A\u0430 \u043C\u043E\u0432\u0430 \u0437\u0430 \u043F\u0440\u043E\u0444\u0435\u0441\u0456\u0439\u043D\u0438\u043C \u0441\u043F\u0440\u044F\u043C\u0443\u0432\u0430\u043D\u043D\u044F\u043C</html>",
                "<html>\u0406\u043D\u043E\u0437\u0435\u043C\u043D\u0430 \u043C\u043E\u0432\u0430</html>",
                "<html>\u0406\u043D\u0436\u0435\u043D\u0435\u0440\u043D\u0430 \u0442\u0430 \u043A\u043E\u043C\u043F'\u044E\u0442\u0435\u0440\u043D\u0430 \u0433\u0440\u0430\u0444\u0456\u043A\u0430</html>",
                "<html>\u0424\u0456\u0437\u0438\u0447\u043D\u0435 \u0432\u0438\u0445\u043E\u0432\u0430\u043D\u043D\u044F \u0442\u0430 \u0441\u043F\u0435\u0446\u0456\u0430\u043B\u044C\u043D\u0430 \u0444\u0456\u0437\u0438\u0447\u043D\u0430 \u043F\u0456\u0434\u0433\u043E\u0442\u043E\u0432\u043A\u0430</html>",
                "<html>\u0415\u043B\u0435\u043A\u0442\u0440\u043E\u0442\u0435\u0445\u043D\u0456\u0447\u043D\u0456 \u043C\u0430\u0442\u0435\u0440\u0456\u0430\u043B\u0438 \u0442\u0430 \u0440\u0430\u0434\u0456\u043E\u0434\u0435\u0442\u0430\u043B\u0456 \u0430\u0432\u0456\u043E\u043D\u0456\u043A\u0438</html>"}));
        comboBox.setBounds(170, 100, 520, 25);
        jPanelSchedule.add(comboBox);
    }

    /**
     * Head label
     *
     * @param jPanelSchedule
     */
    private void getHeadLabel(JPanel jPanelSchedule) {
        JLabel statements = new JLabel("ВIДОМОСТI");
        statements.setIcon(new ImageIcon(Schedule.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif")));
        statements.setBackground(UIManager.getColor("Button.background"));
        statements.setFont(new Font("Times New Roman", Font.BOLD, 18));
        statements.setHorizontalAlignment(SwingConstants.CENTER);
        statements.setBounds(270, 15, 200, 35);
        jPanelSchedule.add(statements);
    }

    /**
     * Date schedule
     *
     * @param jPanelSchedule
     */
    private void getDateSchedule(JPanel jPanelSchedule) {
        JLabel dateSchedule = new JLabel("Дата вiдомостi:");
        dateSchedule.setHorizontalAlignment(SwingConstants.LEFT);
        dateSchedule.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        dateSchedule.setBounds(371, 172, 150, 25);
        jPanelSchedule.add(dateSchedule);

        dateScheduleField = new JTextField();
        dateScheduleField.setBounds(530, 174, 160, 25);
        jPanelSchedule.add(dateScheduleField);
        dateScheduleField.setColumns(10);
    }

    /**
     * input number schedule
     *
     * @param jPanelSchedule
     */
    private void getNumberSchedule(JPanel jPanelSchedule) {
        JLabel numberSchedule = new JLabel("Номер вiдомостi");
        numberSchedule.setHorizontalAlignment(SwingConstants.LEFT);
        numberSchedule.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        numberSchedule.setBounds(25, 170, 140, 25);
        jPanelSchedule.add(numberSchedule);

        numberDateScheduleField = new JTextField();
        numberDateScheduleField.setBounds(170, 170, 174, 25);
        jPanelSchedule.add(numberDateScheduleField);
        numberDateScheduleField.setColumns(10);
    }

    /**
     * input form Of Control schedule
     *
     * @param jPanelSchedule
     */
    private void getRadioButtonFormOfControl(JPanel jPanelSchedule) {
        JLabel formOfControl = new JLabel("Форма контролю:");
        formOfControl.setHorizontalAlignment(SwingConstants.LEFT);
        formOfControl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        formOfControl.setBounds(25, 135, 140, 25);
        jPanelSchedule.add(formOfControl);

        ButtonGroup groupRadioButtonFormOfControl = new ButtonGroup();
        JRadioButton homeWork = new JRadioButton("ДЗ", false);
        homeWork.setBounds(400, 135, 80, 25);
        groupRadioButtonFormOfControl.add(homeWork);
        jPanelSchedule.add(homeWork);

        JRadioButton ekzamen = new JRadioButton("Е", true);
        ekzamen.setBounds(220, 135, 80, 25);
        groupRadioButtonFormOfControl.add(ekzamen);
        jPanelSchedule.add(ekzamen);
    }
}