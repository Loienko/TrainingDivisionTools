package net.ukr.dreamsicle.background;

import net.ukr.dreamsicle.ResourceLoader;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {
    private Image image = ResourceLoader.getImage("/image/background/mig_29.jpg");

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
            repaint();
        }
    }
}
