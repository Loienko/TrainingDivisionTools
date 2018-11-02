package net.ukr.dreamsicle.schedule.actionButtonPreview;

import net.ukr.dreamsicle.ResourceLoader;

import javax.swing.*;
import java.awt.*;

public class ActionButtonPreview {

    /**
     * Preview button Actions from the window schedule
     *
     * @param jPanelSchedule
     * @param jPanelPreviewWindow
     * @param jFrameSchedule
     */
    public void getActionButtonPreview(JPanel jPanelSchedule, JPanel jPanelPreviewWindow, JFrame jFrameSchedule) {
        JToggleButton preview = new JToggleButton("ПРЕДПРОСМОТР");
//        preview.setHorizontalTextPosition(SwingConstants.LEFT);
        preview.addActionListener(e -> {
            if (preview.isSelected()) {
                jFrameSchedule.getContentPane().add(jPanelPreviewWindow);
                jPanelSchedule.setVisible(false);
                jPanelPreviewWindow.setVisible(true);


            }
            preview.setSelected(false);
        });

        preview.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
        preview.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/preview.png")));
        preview.setBounds(25, 500, 230, 40);
        jPanelSchedule.add(preview);
    }
}
