package net.ukr.dreamsicle.sortedCadets.testClass;

import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class PersonModel implements TableModel {

	private ArrayList<TableModelListener> listeners;

	public PersonModel() {
		listeners = new ArrayList<TableModelListener>();
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub

		return Main.persons.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String getColumnName(int index) {
		// TODO Auto-generated method stub
		String string_return = "";
		switch (index) {
		case 0:
			string_return = "Группа";
			break;
		case 1:
			string_return = "Звания";
			break;
		case 2:
			string_return = "Фамилия";
			break;
		case 3:
			string_return = "Имя";
			break;
		}
		return string_return;

	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Object return_object = null;
		switch (columnIndex) {
		case 0:
			return_object = Main.persons.get(rowIndex).getGroup();
			break;
		case 1:
			return_object = Main.persons.get(rowIndex).getRank();
			break;
		case 2:
			return_object = Main.persons.get(rowIndex).getSurname();
			break;
		case 3:
			return_object = Main.persons.get(rowIndex).getName();
			break;

		}

		return return_object;
	}

	@Override
	public void setValueAt(Object value, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch (columnIndex) {
		case 0:
			Main.persons.get(rowIndex).setGroup((String) value);
			break;

		case 1:
			Main.persons.get(rowIndex).setRank((String) value);
			break;
		case 2:
			Main.persons.get(rowIndex).setSurname((String) value);
			break;
		case 3:
			Main.persons.get(rowIndex).setName((String) value);
			break;
		}
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		listeners.add(l);

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		listeners.remove(l);
	}
}
