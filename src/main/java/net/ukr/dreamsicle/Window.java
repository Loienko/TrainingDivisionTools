package net.ukr.dreamsicle;

import javax.swing.*;

import static net.ukr.dreamsicle.JFrame.getJFrame;
import static net.ukr.dreamsicle.archive.Archive.getArchive;
import static net.ukr.dreamsicle.lookAndFeel.LookAndFeel.setLookAndFeel;
import static net.ukr.dreamsicle.mainWindows.FourMainWindowListCadetsGroup.getFourMainListWindow;
import static net.ukr.dreamsicle.mainWindows.MainWindow.getMainWindow;
import static net.ukr.dreamsicle.mainWindows.ThreeMainWindow.getThreeMainWindow;
import static net.ukr.dreamsicle.mainWindows.TwoMainWindow.getTwoMainWindow;
import static net.ukr.dreamsicle.menu.MenuBar.getMenuBar;

public class Window {

    public static JPanel jPanelMainWindow = new JPanel();
    public static JPanel jPanelTwoWindow = new JPanel();
    public static JPanel jPanelThreeWindow = new JPanel();
    public static JPanel jPanelFourWindow = new JPanel();
    public static JPanel jPanelFiveWindowArchive = new JPanel();
    public static javax.swing.JFrame jFrame = getJFrame();
    public static JMenuBar jMenuBar = getMenuBar();

    public Window() {
        jFrame.add(jPanelMainWindow);
        jFrame.add(jPanelTwoWindow);
        jFrame.add(jPanelThreeWindow);
        jFrame.add(jPanelFourWindow);
        jFrame.add(jPanelFiveWindowArchive);

        setLookAndFeel();

        jFrame.setJMenuBar(jMenuBar);
        getMainWindow();
        getTwoMainWindow();
        getThreeMainWindow();
        getFourMainListWindow();
        getArchive();

        jPanelMainWindow.setVisible(true);
        jPanelTwoWindow.setVisible(false);
        jPanelThreeWindow.setVisible(false);
        jPanelFourWindow.setVisible(false);
        jPanelFiveWindowArchive.setVisible(false);


        jPanelMainWindow.revalidate();

        jPanelTwoWindow.revalidate();
        jPanelThreeWindow.revalidate();
        jPanelFourWindow.revalidate();
        jPanelFiveWindowArchive.revalidate();
        jFrame.revalidate();
    }
}
