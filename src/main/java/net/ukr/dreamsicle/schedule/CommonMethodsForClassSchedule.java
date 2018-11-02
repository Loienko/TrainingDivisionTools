package net.ukr.dreamsicle.schedule;

import net.ukr.dreamsicle.dataBase.ConnectionDataBase;
import net.ukr.dreamsicle.logger.Logger;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeSet;

public class CommonMethodsForClassSchedule {
    private ConnectionDataBase connectionData = new ConnectionDataBase();

    /**
     * reading data from a database
     *
     * @param jPanelSchedule
     * @param tableForDateAndNumberSchedule
     * @param column
     * @param scheduleFieldJComboBox
     * @param treeSet
     */
    public synchronized void getReadDataFromDB(JPanel jPanelSchedule, String tableForDateAndNumberSchedule, String column, JComboBox<?> scheduleFieldJComboBox, TreeSet<String> treeSet) {
        int itemCount = scheduleFieldJComboBox.getItemCount();

        if (itemCount == 0) {
            try (Connection connectionDB = connectionData.getConnectionDB();
                 Statement statement = connectionDB.createStatement()) {
                ResultSet resultSet = statement.executeQuery("SELECT " + column + " FROM " + tableForDateAndNumberSchedule + " ORDER BY 1");

                while (resultSet.next()) {
                    String string = resultSet.getString(1);
                    treeSet.add(string);
                }
            } catch (SQLException | InstantiationException | NoSuchMethodException | InvocationTargetException | ClassNotFoundException | IllegalAccessException e) {
                Logger.log(e, "Error select data from table 'tableForDateAndNumberSchedule'");
            }

            scheduleFieldJComboBox.setModel(new DefaultComboBoxModel(treeSet.toArray()));
            jPanelSchedule.validate();
        }
    }

    /**
     * reading data from Input Dialog and writing data to a database
     *
     * @param tableForDateAndNumberSchedule
     * @param column
     * @param button
     * @param dateScheduleField
     * @param stringTreeSet
     * @param dlm
     */
    public synchronized void getButtonAddData(String tableForDateAndNumberSchedule, String column, JToggleButton button, JComboBox<?> dateScheduleField, TreeSet<String> stringTreeSet, DefaultListModel<String> dlm) {
        button.addActionListener(e -> {
            String text = JOptionPane.showInputDialog(this, "");
            try (Connection connectionDB = connectionData.getConnectionDB();
                 Statement statements = connectionDB.createStatement()) {
                statements.executeUpdate("INSERT INTO " + tableForDateAndNumberSchedule + " (" + column + ") VALUES ('" + text + "')");
            } catch (SQLException | InstantiationException | InvocationTargetException | IllegalAccessException | NoSuchMethodException | ClassNotFoundException ex) {
                ex.printStackTrace();
                Logger.log(ex, "Error select data from table 'tableForDateAndNumberSchedule'");
            }
            dlm.add(dlm.getSize(), text);

            JList<String> list = new JList<>(dlm);
            ListModel<String> model = list.getModel();

            for (int i = model.getSize() - 1; i < model.getSize(); i++) {
                String elementAt = model.getElementAt(i);
                stringTreeSet.add(elementAt);
            }

            dateScheduleField.setModel(new DefaultComboBoxModel(stringTreeSet.toArray()));
            button.setSelected(false);
        });
    }

    public synchronized String getActiveItemFromJComboBox(JComboBox<?> scheduleFieldJComboBox) {
        String s = (String) scheduleFieldJComboBox.getSelectedItem();
        System.out.println("Active item ->" + s);
        return s;
    }
}
