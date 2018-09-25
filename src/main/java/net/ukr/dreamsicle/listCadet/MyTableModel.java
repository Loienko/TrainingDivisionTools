package net.ukr.dreamsicle.listCadet;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MyTableModel implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<>();

    private ArrayList<Users> beans;

    public MyTableModel(ArrayList<Users> beans) {
        this.beans = beans;
    }

    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public int getColumnCount() {
        return 4;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Группа";
            case 1:
                return "Воинское звание";
            case 2:
                return "Фамилия";
            case 3:
                return "Имя";
        }
        return "";
    }

    public int getRowCount() {
        return beans.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Users bean = beans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bean.getGroup();
            case 1:
                return bean.getRank();
            case 2:
                return bean.getSurname();
            case 3:
                return bean.getName();

        }
        return "";
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void removeTableModelListener(TableModelListener listener) {
        listeners.remove(listener);
    }

    public void setValueAt(Object value, int rowIndex, int columnIndex) {

    }
}
