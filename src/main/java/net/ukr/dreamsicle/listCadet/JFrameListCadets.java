package net.ukr.dreamsicle.listCadet;

import net.ukr.dreamsicle.logger.Logger;
import net.ukr.dreamsicle.read_write_copy_file.ReadFileLineByLine;
import org.junit.Test;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class JFrameListCadets {
    @Test
    public static void main(String[] args) {
        JFrameListCadets jFrameListCadets = new JFrameListCadets();
        jFrameListCadets.getJFrameListCadets("211.1");
    }

    public void getJFrameListCadets(String filePath) {
        String filePaths = "C:\\Training_division_tools\\2018_год_поступления\\list_cadets\\" + filePath + ".txt";
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(jPanel);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            Logger.log(e, "Error to set Look and Feel");
        }

        jFrame.setTitle("Список курсантов");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit defaultToolkit = Toolkit.getDefaultToolkit();

        Dimension dimension = defaultToolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - (800 / 2), dimension.height / 2 - (800 / 2),
                800, 600);
        jFrame.setLocationRelativeTo(null);

        ArrayList beans = new ArrayList<>();

        ReadFileLineByLine readFile = new ReadFileLineByLine();
        readFile.getLinesFromFile(filePaths, beans);

        beans.sort(Comparator.comparing(Users::getSurname));

        TableModel model = new MyTableModel(beans);
        JTable table = new JTable(model);

        jFrame.getContentPane().add(new JScrollPane(table));

        beans.sort(Comparator.comparing(Users::getSurname));

        jPanel.setVisible(true);
        jFrame.setVisible(true);
    }
}
