package net.ukr.dreamsicle.schedule;


import net.ukr.dreamsicle.ResourceLoader;
import net.ukr.dreamsicle.logger.Logger;
import net.ukr.dreamsicle.lookAndFeel.LookAndFeel;
import net.ukr.dreamsicle.schedule.actionButtonPreview.ActionButtonPreview;
import net.ukr.dreamsicle.schedule.actionButtonPreview.ActiveWindowsForPreview;
import net.ukr.dreamsicle.schedule.discipline.DisciplineSchedule;
import net.ukr.dreamsicle.schedule.formOfControlScheduleRadioButton.GroupRadioButtonFormOfControl;
import net.ukr.dreamsicle.schedule.formOfControlScheduleRadioButton.NameLabelForRadioButton;
import net.ukr.dreamsicle.schedule.listGroupCadets.ListGroupCadets;
import net.ukr.dreamsicle.schedule.numberAndDateSchedule.CreateTableNumberDateAndDisciplineSchedule;
import net.ukr.dreamsicle.schedule.numberAndDateSchedule.DateSchedule;
import net.ukr.dreamsicle.schedule.numberAndDateSchedule.NumberSchedule;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;

public class Schedule extends JFrame {
    private static final long serialVersionUID = 1L;

    private JFrame jFrameSchedule = new JFrame();
    private JPanel jPanelSchedule = new JPanel();
    private JPanel jPanelPreviewWindow = new JPanel();
    private ActiveWindowsForPreview activeWindowsForPreview = new ActiveWindowsForPreview();
    private LookAndFeel lookAndFeel = new LookAndFeel();

    //
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

        jFrameSchedule.add(jPanelSchedule);
        jFrameSchedule.add(jPanelPreviewWindow);

        try {
//            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(jPanelSchedule);
            SwingUtilities.updateComponentTreeUI(jPanelPreviewWindow);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            Logger.log(e, "Error to install Look and Feel");
        }


        jFrameSchedule.setTitle("Вiдомiсть");
//        jFrameSchedule.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrameSchedule.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit defaultToolkit = Toolkit.getDefaultToolkit();

        Dimension dimension = defaultToolkit.getScreenSize();
        jFrameSchedule.setBounds(dimension.width / 2 - (800 / 2), dimension.height / 2 - (700 / 2),
                800, 700);
        jFrameSchedule.setLocationRelativeTo(null);

        jFrameSchedule.getContentPane().add(jPanelSchedule);
//        jFrameSchedule.add(jPanelPreviewWindow);

        jPanelSchedule.setLayout(null);
        jPanelPreviewWindow.setLayout(null);

        getAllMainMethod(jPanelSchedule, jFrameSchedule);
        activeWindowsForPreview.getActiveWindowsForPreview(jPanelSchedule, jPanelPreviewWindow);


        jPanelSchedule.setOpaque(false);
        jPanelPreviewWindow.setOpaque(false);


//        jPanelSchedule.setVisible(true);
        jPanelPreviewWindow.setVisible(true);
        jFrameSchedule.setVisible(true);

        jFrameSchedule.validate();
        jPanelSchedule.validate();
        jPanelPreviewWindow.validate();
        jPanelSchedule.updateUI();
        jPanelPreviewWindow.updateUI();
    }

    /**
     * getting all the methods
     *
     * @param jPanelSchedule
     * @param jFrameSchedule
     */
    private void getAllMainMethod(JPanel jPanelSchedule, JFrame jFrameSchedule) {

        getCreateDB();

        getHeadLabel(jPanelSchedule);

        getDateSchedule(jPanelSchedule);

        getNumberSchedule(jPanelSchedule);

        getDiscipline(jPanelSchedule);

        getRadioButtonFormOfControl(jPanelSchedule);

        getTableCadets(jPanelSchedule);

        getButtonOpenSavePreview(jPanelSchedule, jFrameSchedule);

        getListGroupCadets(jPanelSchedule);

        getSeparator(jPanelSchedule);

    }

    /**
     *
     */
    private void getCreateDB() {
        CreateTableNumberDateAndDisciplineSchedule createTableNumberDateAndDisciplineSchedule = new CreateTableNumberDateAndDisciplineSchedule();
        createTableNumberDateAndDisciplineSchedule.getCreateTableNumberAndDateSchedule();
    }

    /**
     * getting the cadets table from the DB and writing modified data to DB
     *
     * @param jPanelSchedule
     */
    private void getTableCadets(JPanel jPanelSchedule) {
    }

    /**
     * go to next or previous group cadets for input grade
     *
     * @param jPanelSchedule
     * @param jFrameSchedule
     */
    private void getButtonOpenSavePreview(JPanel jPanelSchedule, JFrame jFrameSchedule) {

        JToggleButton open = new JToggleButton("ОТКРЫТЬ");
//        open.setBackground(new Color(0xA6FFF0));
//        next.setHorizontalTextPosition(SwingConstants.LEFT);
        open.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
        open.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Выберите список групп");

            open.setSelected(false);
        });

        open.setIcon(new ImageIcon(ResourceLoader.getImage("/image/open.png")));
        open.setBounds(25, 300, 230, 40);
        jPanelSchedule.add(open);


        JToggleButton save = new JToggleButton("СОХРАНИТЬ");
        save.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
        save.addActionListener(e -> {


            save.setSelected(false);
        });
        save.setIcon(new ImageIcon(ResourceLoader.getImage("/image/save.png")));
        save.setBounds(25, 400, 230, 40);
        jPanelSchedule.add(save);


        ActionButtonPreview actionButtonPreview = new ActionButtonPreview();
        actionButtonPreview.getActionButtonPreview(jPanelSchedule, jPanelPreviewWindow, jFrameSchedule);

    }

    /**
     * read data from DB and view in the table
     *
     * @param jPanelSchedule
     */
    private void getListGroupCadets(JPanel jPanelSchedule) {
        ListGroupCadets listGroupCadets = new ListGroupCadets();
        listGroupCadets.getListGroupLabel(jPanelSchedule);

        listGroupCadets.getJComboBoxListGroup(jPanelSchedule);
        listGroupCadets.getButtonActionConfirmView(jPanelSchedule);

    }

    /**
     * Separator
     *
     * @param jPanelSchedule
     */
    private void getSeparator(JPanel jPanelSchedule) {
        JSeparator separatorHead = new JSeparator();
        separatorHead.setBounds(10, 70, 760, 2);
        jPanelSchedule.add(separatorHead);

        JSeparator separatorDown = new JSeparator();
        separatorDown.setBounds(10, 170, 760, 2);
        jPanelSchedule.add(separatorDown);
    }

    /**
     * Discipline for schedule
     *
     * @param jPanelSchedule
     */
    private void getDiscipline(JPanel jPanelSchedule) {
        CreateTableNumberDateAndDisciplineSchedule createTableNumberDateAndDisciplineSchedule = new CreateTableNumberDateAndDisciplineSchedule();
        String tableForDisciplineSchedule = createTableNumberDateAndDisciplineSchedule.getTableForDisciplineSchedule();
        String columnDiscipline = createTableNumberDateAndDisciplineSchedule.getColumnDiscipline();

        DisciplineSchedule disciplineSchedule = new DisciplineSchedule();
        disciplineSchedule.getNumberScheduleLabel(jPanelSchedule);
        disciplineSchedule.getButtonForInputNumber(jPanelSchedule, tableForDisciplineSchedule, columnDiscipline);
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
        statements.setBounds(300, 15, 200, 35);
        jPanelSchedule.add(statements);
    }

    /**
     * Date schedule
     *
     * @param jPanelSchedule
     */
    private void getDateSchedule(JPanel jPanelSchedule) {
        CreateTableNumberDateAndDisciplineSchedule createTableNumberDateAndDisciplineSchedule = new CreateTableNumberDateAndDisciplineSchedule();
        String tableForDateSchedule = createTableNumberDateAndDisciplineSchedule.getTableForDateSchedule();
        String columnDate = createTableNumberDateAndDisciplineSchedule.getColumnDate();

        DateSchedule dateSchedule = new DateSchedule();
        dateSchedule.getDateScheduleLabel(jPanelSchedule);
        dateSchedule.getButtonForInputDate(jPanelSchedule, tableForDateSchedule, columnDate);
    }

    /**
     * input number schedule
     *
     * @param jPanelSchedule
     */
    private void getNumberSchedule(JPanel jPanelSchedule) {
        CreateTableNumberDateAndDisciplineSchedule createTableNumberDateAndDisciplineSchedule = new CreateTableNumberDateAndDisciplineSchedule();
        String tableForNumberSchedule = createTableNumberDateAndDisciplineSchedule.getTableForNumberSchedule();
        String columnNumber = createTableNumberDateAndDisciplineSchedule.getColumnNumber();

        NumberSchedule numberSchedule = new NumberSchedule();
        numberSchedule.getNumberScheduleLabel(jPanelSchedule);
        numberSchedule.getButtonForInputNumber(jPanelSchedule, tableForNumberSchedule, columnNumber);
    }

    /**
     * input form Of Control schedule
     *
     * @param jPanelSchedule
     */
    private void getRadioButtonFormOfControl(JPanel jPanelSchedule) {
        NameLabelForRadioButton nameLabelForRadioButton = new NameLabelForRadioButton();
        nameLabelForRadioButton.getNameLabelRadioButton(jPanelSchedule);

        GroupRadioButtonFormOfControl groupRadioButtonFormOfControl = new GroupRadioButtonFormOfControl();
        groupRadioButtonFormOfControl.getGroupRadioButtonFormOfControl(jPanelSchedule);
    }
}