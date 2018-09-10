package net.ukr.dreamsicle.menu;

import resourses.ResourceLoader;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

import static net.ukr.dreamsicle.Window.*;


public class MenuBar {

    public static JMenuBar getMenuBar() {
        jMenuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        jMenuBar.add(file);
        jMenuBar.add(edit);
        jMenuBar.add(tools);
        jMenuBar.add(help);

        getFileMenu(file);
        getEditMenu(edit);
        getToolsMenu(tools);
        getHelpMenu(help);

        return jMenuBar;
    }

    private static void getFileMenu(JMenu file) {
        file.add(new JMenuItem("New", new ImageIcon(ResourceLoader.getImage("image/new.png")))).addActionListener(e -> {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showDialog(jPanelMainWindow, "New");
            jFileChooser.setCurrentDirectory(new File("."));
            jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        });

        JMenuItem open = new JMenuItem("Open", new ImageIcon(ResourceLoader.getImage("image/open.png")));

        file.add(open);
        open.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(jPanelMainWindow);
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

            /*// filter not fork
            fileChooser.setFileFilter(new FileFilter() {
                @Override
                public boolean accept(File f) {
                    if (f.getName().endsWith("gif")) {
                        return true;
                    }
                    return false;
                }

                @Override
                public String getDescription() {
                    return "Only gif files";
                }
            });*/

            int i = fileChooser.showDialog(jPanelMainWindow, "Open"); // получаем код действия при открытии
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("назвыние выбранного файла - > " + selectedFile.getName());

        });

        file.add(new JMenuItem("Save", new ImageIcon(ResourceLoader.getImage("image/save.png")))).addActionListener(e -> {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(jPanelMainWindow);
            jFileChooser.setCurrentDirectory(new File("."));
            //jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        });

        file.add(new JMenuItem("Save as...", new ImageIcon(ResourceLoader.getImage("image/saveAs.png")))).addActionListener(e -> {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showDialog(jPanelMainWindow, "save as");
            jFileChooser.setCurrentDirectory(new File("."));
            jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        });
        file.addSeparator();

        JMenuItem print = new JMenuItem("Print", new ImageIcon(ResourceLoader.getImage("image/print.png")));
        file.add(print);
       /* print.addActionListener(e -> {
            try {
                InputStream inputStream = new FileInputStream("C://TrainingDivisionTools//src//res//image//smile.jpg");
                DocFlavor flavor = DocFlavor.INPUT_STREAM.JPEG;
                PrintService[] service = PrintServiceLookup.lookupPrintServices(flavor, null);
                Doc doc = new SimpleDoc(inputStream, flavor, null);
                if (service.length > 0) {
                    DocPrintJob job = service[0].createPrintJob();
                    job.print(doc, null);
                }
            } catch (FileNotFoundException | PrintException e1) {
                e1.printStackTrace();
            }
        });*/

        JMenuItem exitInFile = new JMenuItem("Exit", new ImageIcon(ResourceLoader.getImage("image/exit.png")));
        file.add(exitInFile);
        exitInFile.addActionListener(e -> {
            int response = JOptionPane.showConfirmDialog(jFrame, "Вы уверены???");
            switch (response) {
                case JOptionPane.YES_OPTION:
                    System.exit(0);
                    break;
            }
        });
        exitInFile.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));
    }

    private static void getEditMenu(JMenu edit) {
        JMenuItem undo = new JMenuItem("Undo", new ImageIcon(ResourceLoader.getImage("image/undo.png")));
        undo.setAccelerator(KeyStroke.getKeyStroke("ctrl Z"));
        edit.add(undo);

        JMenuItem redo = new JMenuItem("Redo", new ImageIcon(ResourceLoader.getImage("image/redo.png")));
        redo.setAccelerator(KeyStroke.getKeyStroke("ctrl shift Z"));
        edit.add(redo);
        edit.addSeparator();

        JMenuItem cut = new JMenuItem("Cut", new ImageIcon(ResourceLoader.getImage("image/cut.png")));
        cut.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
        cut.addActionListener(e -> {
            //only JTetxField   .cut();
        });
        edit.add(cut);

        JMenuItem copy = new JMenuItem("Copy", new ImageIcon(ResourceLoader.getImage("image/copy.png")));
        copy.setAccelerator(KeyStroke.getKeyStroke("ctrl C"));
        copy.addActionListener(e -> {
            //only JTetxField   .copy();
        });
        edit.add(copy);

        JMenuItem paste = new JMenuItem("Paste", new ImageIcon(ResourceLoader.getImage("image/paste.png")));
        paste.setAccelerator(KeyStroke.getKeyStroke("ctrl V"));
        paste.addActionListener(e -> {
            //only JTetxField   .paste();
        });
        edit.add(paste);


        JMenu optionInEdit = new JMenu("Options");
        optionInEdit.setIcon(new ImageIcon(ResourceLoader.getImage("image/options.png")));
        edit.add(optionInEdit);
        optionInEdit.add(new JMenuItem("Color", new ImageIcon(ResourceLoader.getImage("image/color.png")))).addActionListener(e -> {
            Color color = JColorChooser.showDialog(jPanelMainWindow, "title", Color.BLUE);
            jPanelMainWindow.setBackground(color);
        });
        optionInEdit.add(new JMenuItem("Size", new ImageIcon(ResourceLoader.getImage("image/size.png"))));
    }

    private static void getToolsMenu(JMenu tools) {
        tools.add(new JMenuItem("Local History", new ImageIcon(ResourceLoader.getImage("image/history.png"))));

        JMenuItem deployment = new JMenuItem("Deployment", '0');
        deployment.setEnabled(false);
        tools.add(deployment);
    }

    private static void getHelpMenu(JMenu help) {
        help.add(new JMenuItem("Find Action", new ImageIcon(ResourceLoader.getImage("image/search.png"))));
        help.add(new JMenuItem("Help", new ImageIcon(ResourceLoader.getImage("image/help.png"))));
        help.addSeparator();
        ArrayList<Object> list = new ArrayList<>();
        help.add(new JMenuItem("Support Center", new ImageIcon(ResourceLoader.getImage("image/contact.png"))))
                .addActionListener(e -> list.add(JOptionPane.showInputDialog(null, "Input you message for developer")));

        JMenuItem donate = help.add(new JMenuItem("Donate", new ImageIcon(ResourceLoader.getImage("image/donate.png"))));
        donate.addActionListener(e -> JOptionPane.showMessageDialog(null, "Sorry, donate not work"));
        donate.setEnabled(true);
        help.addSeparator();
        help.add(new JMenuItem("About", new ImageIcon(ResourceLoader.getImage("image/about.png"))))
                .addActionListener(e -> JOptionPane.showMessageDialog(null, "Ver 1.0"));
    }

}
