package net.ukr.dreamsicle.lookAndFeel;

import javax.swing.*;
import java.awt.*;

public class FontAppShowAllFont {
    public static void main(String[] args) {
        Font fontBold = new Font("Batang", Font.BOLD, 20);

        UIManager.LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo lookAndFeelInfo : lookAndFeelInfos) {
            System.out.println(lookAndFeelInfo.getName());
            System.out.println(lookAndFeelInfo.getClassName());
        }

    }

    private static void getAllFonts() {
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String font : fonts) {
            System.out.println(font);
        }
    }
}
