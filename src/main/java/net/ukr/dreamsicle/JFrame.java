package net.ukr.dreamsicle;

import net.ukr.dreamsicle.background.ImagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static net.ukr.dreamsicle.Window.*;

public class JFrame {

    public static Toolkit toolkit = Toolkit.getDefaultToolkit();
    static int WIDTH_WINDOW = 800;
    static int HEIGHT_WINDOW = 600;

    public static javax.swing.JFrame getJFrame() {
        javax.swing.JFrame jFrame = new javax.swing.JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        ImagePanel imagePanel = new ImagePanel();

        jFrame.setContentPane(imagePanel);

        imagePanel.add(jPanelMainWindow);
        imagePanel.add(jPanelTwoWindow);
        imagePanel.add(jPanelThreeWindow);
        imagePanel.add(jPanelFourWindow);
        imagePanel.add(jPanelFiveWindowArchive);


        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - (WIDTH_WINDOW / 2), dimension.height / 2 - (HEIGHT_WINDOW / 2),
                WIDTH_WINDOW, HEIGHT_WINDOW);


        jPanelMainWindow.setOpaque(false);
        jPanelTwoWindow.setOpaque(false);
        jPanelThreeWindow.setOpaque(false);
        jPanelFourWindow.setOpaque(false);
        jPanelFiveWindowArchive.setOpaque(false);

        jFrame.setTitle("Office Tools");
        jFrame.setVisible(true);

        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Object[] options = {"Да", "Нет!"};
                int n = JOptionPane
                        .showOptionDialog(e.getWindow(), "Закрыть окно?",
                                "Подтверждение", JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null, options,
                                options[0]);
                if (n == 0) {
                    e.getWindow().setVisible(false);
                    System.exit(0);
                }
            }
        });
        return jFrame;
    }
}
