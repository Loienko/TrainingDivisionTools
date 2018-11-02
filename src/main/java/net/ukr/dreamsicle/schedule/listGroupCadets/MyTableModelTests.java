package net.ukr.dreamsicle.schedule.listGroupCadets;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class MyTableModelTests extends AbstractTableModel {

    private static final long serialVersionUID = 627056612911384001L;
    Class[] types = new Class[]{String.class, String.class, String.class, Integer.class};
    boolean[] canEdit = new boolean[]{false, false, false, true};
    private int columnCount = 4;
    private ArrayList<String[]> arrayList;

    public MyTableModelTests() {
        arrayList = new ArrayList<String[]>();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.add(new String[getColumnCount()]);
        }
    }

    @Override
    public int getRowCount() {
        return arrayList.size();
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] rows = arrayList.get(rowIndex);
        return rows[columnIndex];
    }

    public void addDate(String[] row) {
        String[] rowTable = new String[getColumnCount()];
        rowTable = row;
        arrayList.add(rowTable);
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ФАМИЛИЯ";
            case 1:
                return "ИМЯ";
            case 2:
                return "ОТЧЕСТВО";
            case 3:
                return "ОЦЕНКА";
        }
        return "";
    }

    public void clearDate() {
        arrayList.clear();
        fireTableDataChanged();

    }

    public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
    }
}
