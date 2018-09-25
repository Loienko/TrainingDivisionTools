package net.ukr.dreamsicle.sortedCadets.testClass;

import javax.swing.*;

public class MainWindow extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JTable table;
    private PersonModel model;

    public MainWindow() {
        // TODO Auto-generated constructor stub
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(640, 400);
        setResizable(true);
        getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 11, 487, 340);
        getContentPane().add(scrollPane);

        model = new PersonModel();

        table = new JTable(model);

        scrollPane.setViewportView(table);

        JButton btnAdd = new JButton("add");
        btnAdd.addActionListener(e -> {
            Person person = new Person();
            person.setRank("солдат");
            person.setGroup("211/1");
            person.setSurname("Максимов");
            person.setName("Максим");
            Main.persons.add(person);
            table.updateUI();
        });
        btnAdd.setBounds(525, 11, 89, 23);
        getContentPane().add(btnAdd);

        JButton btnRemove = new JButton("remove");
        btnRemove.addActionListener(e -> {
            if (table.getSelectedRow() == -1 || Main.persons.size() > 0) {
                return;
            }
            Main.persons.remove(table.getSelectedRow());
            table.updateUI();
        });
        btnRemove.setBounds(525, 57, 89, 23);
        getContentPane().add(btnRemove);
        setVisible(true);
    }
}
