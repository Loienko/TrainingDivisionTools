package net.ukr.dreamsicle.schedule.listGroupCadets;

import net.ukr.dreamsicle.ResourceLoader;
import net.ukr.dreamsicle.dataBase.ConnectionDataBase;
import net.ukr.dreamsicle.logger.Logger;
import net.ukr.dreamsicle.schedule.CommonMethodsForClassSchedule;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.TreeSet;

import static net.ukr.dreamsicle.dataBase.Configs.TABLE_NAME;

public class ListGroupCadets {

    private DefaultTableModel defaultTableModel;
    private JTable jTable;

    private CommonMethodsForClassSchedule commonMethodsForListGroupCadets = new CommonMethodsForClassSchedule();
    private TreeSet<String> stringTreeSetForClassListGroupCadets = new TreeSet<>();
    private JComboBox<?> listGroupJComboBox = new JComboBox();
    private ConnectionDataBase connectionData = new ConnectionDataBase();

    /**
     * @param jPanelSchedule
     */
    public void getListGroupLabel(JPanel jPanelSchedule) {
        JLabel listGroupLabel = new JLabel("Выберите групу:");
        listGroupLabel.setBounds(70, 200, 150, 25);
        jPanelSchedule.add(listGroupLabel);
    }

    /**
     * @param jPanelSchedule
     */
    public void getJComboBoxListGroup(JPanel jPanelSchedule) {
//        next.setHorizontalTextPosition(SwingConstants.LEFT);
        listGroupJComboBox.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));

        try (Connection connectionDB = connectionData.getConnectionDB();
             Statement statement = connectionDB.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT groupCadet FROM " + TABLE_NAME);

            while (resultSet.next()) {
                String string = resultSet.getString(1);
                if (!string.isEmpty()) {
                    stringTreeSetForClassListGroupCadets.add(string);
                }
            }
        } catch (SQLException | InstantiationException | NoSuchMethodException | InvocationTargetException | ClassNotFoundException | IllegalAccessException e) {
//            e.printStackTrace();
            Logger.log(e, "Error select data groupCadet from table 'commonTable'");
        }

        listGroupJComboBox.setModel(new DefaultComboBoxModel(stringTreeSetForClassListGroupCadets.toArray()));

        listGroupJComboBox.setBounds(50, 230, 150, 25);

        jPanelSchedule.add(listGroupJComboBox);

    }

    /**
     * @param jPanelSchedule
     */
    public void getButtonActionConfirmView(JPanel jPanelSchedule) {
        JToggleButton confirmView = new JToggleButton();
        confirmView.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/ok.png")));
//        confirmView.setBackground(new Color(0xA6FFF0));

        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> middleName = new ArrayList<>();

        jTable = new JTable();

        jTable.setModel(new MyTableModelTests());

        jTable.setBorder(new LineBorder(new Color(0, 0, 0), 1));
        jTable.setShowHorizontalLines(true);
        jTable.setShowVerticalLines(true);
        jTable.setBounds(270, 190, 460, 460);
        jPanelSchedule.add(jTable);

        confirmView.addActionListener(e -> {

            surname.removeAll(surname);
            name.removeAll(name);
            middleName.removeAll(middleName);
            String activeItem = getActiveItem();

            try (Connection connectionDB = connectionData.getConnectionDB();
                 Statement statement = connectionDB.createStatement()) {
                ResultSet resultSet = statement.executeQuery("SELECT surname, name, middleName FROM " + TABLE_NAME + " WHERE groupCadet = '" + activeItem + "'");

                while (resultSet.next()) {
                    surname.add(resultSet.getString(1));
                    name.add(resultSet.getString(2));
                    middleName.add(resultSet.getString(3));
                }
                getTableCadets(jPanelSchedule, surname, name, middleName, jTable);

                jPanelSchedule.validate();
            } catch (SQLException | InstantiationException | NoSuchMethodException | InvocationTargetException | ClassNotFoundException | IllegalAccessException ex) {
                Logger.log(ex, "Error select data surname from table 'commonTable'");
            }
            confirmView.setSelected(false);
        });

        confirmView.setBounds(220, 230, 25, 25);
        jPanelSchedule.add(confirmView);
    }


    /**
     * @param jPanelSchedule
     * @param surname
     * @param name
     * @param middleName
     * @param table
     */
    private void getTableCadets(JPanel jPanelSchedule, ArrayList<String> surname, ArrayList<String> name, ArrayList<String> middleName, JTable table) {
        String s = "";
        Object[][] strings = new Object[surname.size()][4];

        for (int i = 0; i < surname.size(); i++) {
            strings[i][0] = surname.get(i);
            strings[i][1] = name.get(i);
            strings[i][2] = middleName.get(i);
            strings[i][3] = s;
        }

        JScrollPane jScrollPane = new javax.swing.JScrollPane();

        jPanelSchedule.validate();
        table.repaint();
        table.updateUI();

//        table.setBorder(new );
        table.setBorder(new LineBorder(new Color(0, 0, 0), 1));
        table.setFont(new java.awt.Font("Times New Roman", Font.CENTER_BASELINE, 13)); // NOI18N
        table.setForeground(new java.awt.Color(1, 1, 3));
        table.setGridColor(new java.awt.Color(1, 1, 3));

        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table.getTableHeader().setReorderingAllowed(true);

        String[] columnName = {"ФАМИЛИЯ", "ИМЯ", "ОТЧЕСТВО", "ОЦЕНКА"};


        defaultTableModel = new DefaultTableModel(
                strings, columnName
        ) {

            Class[] types = new Class[]{String.class, String.class, String.class, Integer.class};

            boolean[] canEdit = new boolean[]{false, false, false, true};

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

            @Override
            public void fireTableDataChanged() {
                super.fireTableDataChanged();
            }

        };

        defaultTableModel.fireTableDataChanged();
        table.setModel(defaultTableModel);
        defaultTableModel.fireTableDataChanged();

        jPanelSchedule.validate();
        table.repaint();
        table.updateUI();


        table.getColumnModel().getColumn(0).setResizable(false);
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(2).setResizable(false);
        table.getColumnModel().getColumn(3).setPreferredWidth(10);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);


        table.getAccessibleContext().setAccessibleName("");
        table.getAccessibleContext().setAccessibleDescription("");
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        jScrollPane.setViewportView(jTable);

        jPanelSchedule.validate();
        table.repaint();
        table.updateUI();

//        jPanelSchedule.add(jTable.getTableHeader());
        jPanelSchedule.add(jScrollPane);
        table.setBounds(270, 190, 460, 460);
        jPanelSchedule.add(table);

    }

    private String getActiveItem() {
        return commonMethodsForListGroupCadets.getActiveItemFromJComboBox(listGroupJComboBox);
    }

}
