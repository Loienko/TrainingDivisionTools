package net.ukr.dreamsicle.mainWindows;

import net.ukr.dreamsicle.ResourceLoader;
import net.ukr.dreamsicle.addNewCourse.AddNewCourse;
import net.ukr.dreamsicle.logger.Logger;

import javax.swing.*;
import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static net.ukr.dreamsicle.Window.*;
import static net.ukr.dreamsicle.date.TimeRightNow.getMonthDate;
import static net.ukr.dreamsicle.mainWindows.TwoMainWindow.jLabel;

/**
 * update class in constructor
 */

public class MainWindow {

    public MainWindow() {
        getMainWindow();
    }

    public static void getMainWindow() {

        jPanelMainWindow.setLayout(new GridBagLayout());

        getAddNewCourse();
        getFirstCourse();
        getSecondCourse();
        getThirdCourse();
        getFourthCourse();
        getFifthCourse();
        getArchive();
//        getConnectDB();

        jPanelMainWindow.updateUI();

    }

    private static void getConnectDB() {
        JToggleButton dataBase = new JToggleButton("Подключится к БД");
        dataBase.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/soldier.png")));

        final String URL = "jdbc:mysql://localhost:3306/cadets?useSSL=false";
        final String USERNAME = "root";
        final String PASSWORD = "dream";


        dataBase.addActionListener(e -> {
            try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {

                Class.forName("com.mysql.jdbc.Driver").newInstance();

                if (!connection.isClosed()) {
                    JOptionPane.showMessageDialog(null, "Соединение с Базой данных установлено успешно!!!");
                }
            } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException e1) {
                Logger.log(e1, "No connect to BD");
                JOptionPane.showMessageDialog(null, "Нет соединения с БД", null, JOptionPane.WARNING_MESSAGE);
            }
            dataBase.setSelected(false);
        });

        jPanelMainWindow.add(dataBase, new GridBagConstraints(5, 7, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getAddNewCourse() {
        JToggleButton addNewCourse = new JToggleButton();
        addNewCourse.setToolTipText("Добавить новый курс в БД");
        addNewCourse.setIcon(new ImageIcon(ResourceLoader.getImage("/image/add.png")));

        addNewCourse.setText("Добавить новый курс");

        /**
         * переделать проверку активное кнопки addNewCourse
         * нужно указать путь к папке и получать ее имя
         */
        Path path = Paths.get("C://Training_division_tools//2018_год_поступления");

        if (getMonthDate() == 7 && !Files.exists(path)) {
            addNewCourse.setEnabled(true);
            addNewCourse.addActionListener(e -> {
                if (addNewCourse.isSelected()) {
                    new AddNewCourse().createFolder();
                    addNewCourse.setSelected(false);
                    addNewCourse.setEnabled(false);
                }
            });

        } else {
            addNewCourse.setEnabled(false);
        }

        jPanelMainWindow.add(addNewCourse, new GridBagConstraints(4, 1, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getFirstCourse() {
        JToggleButton firstCourse = new JToggleButton("1 курс");
        firstCourse.setToolTipText("...");
        firstCourse.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/soldier.png")));
        firstCourse.addActionListener(e -> {
            if (firstCourse.isSelected()) {
                getActiveWindows(firstCourse);
            }
        });

        jPanelMainWindow.add(firstCourse, new GridBagConstraints(1, 2, 3, 1, 0.0, 0.5,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getSecondCourse() {
        JToggleButton secondCourse = new JToggleButton("2 курс");
        secondCourse.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/head_cadets.png")));
        secondCourse.setEnabled(false);
        secondCourse.addActionListener(e -> {
            if (secondCourse.isSelected()) {
                getActiveWindows(secondCourse);
            }
        });

        jPanelMainWindow.add(secondCourse, new GridBagConstraints(8, 2, 3, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getThirdCourse() {
        JToggleButton thirdCourse = new JToggleButton("3 курс");
        thirdCourse.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/head_cadets.png")));
        thirdCourse.setEnabled(false);
        thirdCourse.addActionListener(e -> {
            if (thirdCourse.isSelected()) {
                getActiveWindows(thirdCourse);
            }
        });

        jPanelMainWindow.add(thirdCourse, new GridBagConstraints(1, 3, 3, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getFourthCourse() {
        JToggleButton fourthCourse = new JToggleButton("4 курс");
        fourthCourse.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/head_cadets.png")));
        fourthCourse.setEnabled(false);
        fourthCourse.addActionListener(e -> {
            if (fourthCourse.isSelected()) {
                getActiveWindows(fourthCourse);
            }
        });

        jPanelMainWindow.add(fourthCourse, new GridBagConstraints(8, 3, 3, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getFifthCourse() {
        JToggleButton fifthCourse = new JToggleButton("5 курс");
        fifthCourse.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/5.png")));
        fifthCourse.setEnabled(false);
        fifthCourse.addActionListener(e -> {
            if (fifthCourse.isSelected()) {
                getActiveWindows(fifthCourse);
            }
        });

        jPanelMainWindow.add(fifthCourse, new GridBagConstraints(4, 4, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getActiveWindows(JToggleButton jButton) {
        jPanelMainWindow.setVisible(false);
        jPanelTwoWindow.setVisible(true);
        jPanelThreeWindow.setVisible(false);
        jPanelFourWindow.setVisible(false);
        jPanelFiveWindowArchive.setVisible(false);
        jLabel.setText(jButton.getText());

        jButton.setSelected(false);
    }

    private static void getArchive() {
        JToggleButton archive = new JToggleButton("Архив");
        archive.setIcon(new ImageIcon(ResourceLoader.getImage("/image/archive.png")));
        archive.setBackground(Color.green);
        archive.setEnabled(false);
        archive.addActionListener(e -> {
            if (archive.isSelected()) {
                jPanelMainWindow.setVisible(false);
                jPanelTwoWindow.setVisible(false);
                jPanelThreeWindow.setVisible(false);
                jPanelFourWindow.setVisible(false);
                jPanelFiveWindowArchive.setVisible(true);
                archive.setSelected(false);
            }
        });

        jPanelMainWindow.add(archive, new GridBagConstraints(4, 5, 4, 2, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
