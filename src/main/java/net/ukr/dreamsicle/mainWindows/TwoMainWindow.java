package net.ukr.dreamsicle.mainWindows;

import net.ukr.dreamsicle.ResourceLoader;
import net.ukr.dreamsicle.dataBase.UpdateDBCommonTable;
import net.ukr.dreamsicle.showActiveButton.ShowActiveButtonGroup;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.*;
import static net.ukr.dreamsicle.read_write_copy_file.OpenLocalFile.openLocalFile;


public class TwoMainWindow {

    public static JLabel jLabel;

    public static void getTwoMainWindow() {
        jPanelTwoWindow.setLayout(new GridBagLayout());

        getCommonTable();
        getBack();
        getScheduleSession();
//        getTest();
        getRating();
        getAddInfo();
        getLabel();
        getGroup();

        jPanelTwoWindow.updateUI();
    }

    public static void getBack() {
        JButton back = new JButton("Назад");
        back.setIcon(new ImageIcon(ResourceLoader.getImage("/image/undo.png")));
        back.addActionListener(e -> {
            jPanelMainWindow.setVisible(true);
            jPanelTwoWindow.setVisible(false);
            jPanelThreeWindow.setVisible(false);
            jPanelFourWindow.setVisible(false);
        });

        jPanelTwoWindow.add(back, new GridBagConstraints(10, 0, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getLabel() {
        jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon(ResourceLoader.getImage("/image/about.png")));
        jLabel.setFont(new Font("Arial", Font.BOLD, 30));

        jPanelTwoWindow.add(jLabel, new GridBagConstraints(0, 0, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getCommonTable() {
        JButton commonTable = new JButton("Общая таблица");
        commonTable.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/infoAboutCadets.png")));
        commonTable.addActionListener(e -> openLocalFile("C://Training_division_tools//2018_год_поступления//1_курс//commonTable.xlsx"));
        UpdateDBCommonTable updateDBCommonTable = new UpdateDBCommonTable();

        jPanelTwoWindow.add(commonTable, new GridBagConstraints(4, 2, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getScheduleSession() {
        JButton scheduleSession = new JButton("Ведомость сессия");
        scheduleSession.setEnabled(false);
        scheduleSession.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/scheduleSession.png")));

        scheduleSession.addActionListener(e -> openLocalFile("C://Training_division_tools//2018_год_поступления//1_курс//statement.xlsx"));

        jPanelTwoWindow.add(scheduleSession, new GridBagConstraints(1, 5, 3, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getTest() {
        /*
        another data
         */
        /*JComboBox<String> groupCadets = new JComboBox();

        groupCadets.addItem("211/1");
        groupCadets.addItem("211/2");
        groupCadets.addItem("211/3");
        groupCadets.addItem("211/4");*/


//        JLabel jLabel = new JLabel();
//        jLabel.setIcon(new ImageIcon("image/app.png"));
        JToggleButton button = new JToggleButton("test");

        button.addActionListener(e -> {
            //getCopyFile("src/res/file/commonTable.xlsx","src/res/folder/file.xlsx");
//            openLocalFile("C://Java_task//test.docx");
//            CopyFile.getCopyFile(ResourceLoader.getFile("/file/Год.xlsx"), "C://Training_division_tools/2018_year_input/1_course/Год.xlsx");
//            System.out.println(ResourceLoader.getFile("file/Год.xlsx"));
//            ResourceLoader.getFile("file/Год.xlsx");
        });

        jPanelTwoWindow.add(button, new GridBagConstraints(4, 5, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getGroup() {
        JToggleButton group = new JToggleButton("Список групп");
        group.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/info.png")));
        group.addActionListener(e -> {
            if (group.isSelected()) {
                jPanelMainWindow.setVisible(false);
                jPanelTwoWindow.setVisible(false);
                jPanelThreeWindow.setVisible(false);
                jPanelFourWindow.setVisible(true);
                jPanelFiveWindowArchive.setVisible(false);

                ShowActiveButtonGroup showActiveButtonGroup = new ShowActiveButtonGroup();
                showActiveButtonGroup.getShowActiveButtonGroupCadets();

                jPanelFourWindow.updateUI();
                jFrame.revalidate();

                group.setSelected(false);
            }
        });

        jPanelTwoWindow.add(group, new GridBagConstraints(4, 7, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getRating() {
        JButton rating = new JButton("Рейтинг курсантов");
        rating.setEnabled(false);
        rating.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/raiting.png")));

        rating.addActionListener(e -> openLocalFile("C://Training_division_tools//2018_год_поступления//1_курс//rating.xlsx"));

        jPanelTwoWindow.add(rating, new GridBagConstraints(8, 5, 3, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getAddInfo() {
        JToggleButton addInfo = new JToggleButton("Дополнительная информация");
        addInfo.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/about.png")));
        addInfo.addActionListener(e -> {
            if (addInfo.isSelected()) {
                jPanelMainWindow.setVisible(false);
                jPanelTwoWindow.setVisible(false);
                jPanelThreeWindow.setVisible(true);
                jPanelFourWindow.setVisible(false);
                jPanelFiveWindowArchive.setVisible(false);
                addInfo.setSelected(false);
            }
        });

        jPanelTwoWindow.add(addInfo, new GridBagConstraints(4, 9, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
