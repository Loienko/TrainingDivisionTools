package net.ukr.dreamsicle.mainWindows;

import net.ukr.dreamsicle.read_write_copy_file.OpenLocalFile;
import resourses.ResourceLoader;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.*;

public class ThreeMainWindow {


    public static void getThreeMainWindow() {
        jPanelThreeWindow.setLayout(new GridBagLayout());

        getBall();
        getStatement();
        getMilitaryRank();
        getAcademicDisciplines();
        getOrderOfAdmission();
        getDirectionOfTraining();
        getPilgysUponAccession();
        getReasonsForDeductions();
        getYears();
        getFamilyStatus();
        getTheSemesterPlan();
        getSpecialization();
        getSpecialty();
        getFaculty();
        getSemesterControlForm();
        getBackTwoWindow();
    }

    public static void getBackTwoWindow() {
        JButton back = new JButton("Назад");
        back.setIcon(new ImageIcon(ResourceLoader.getImage("image/undo.png")));

        back.addActionListener(e -> {
            jPanelMainWindow.setVisible(false);
            jPanelTwoWindow.setVisible(true);
            jPanelThreeWindow.setVisible(false);
            jPanelFourWindow.setVisible(false);
            jPanelFiveWindowArchive.setVisible(false);
        });

        jPanelThreeWindow.add(back, new GridBagConstraints(8, 0, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getTheSemesterPlan() {
        JButton semesterPlan = new JButton("Семестровый план");

        semesterPlan.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Семестровый_план.xlsx"));

        jPanelThreeWindow.add(semesterPlan, new GridBagConstraints(0, 1, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getFamilyStatus() {
        JButton familyStatus = new JButton("Семейное положение");

        familyStatus.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Семейное_положение.xlsx"));

        jPanelThreeWindow.add(familyStatus, new GridBagConstraints(4, 1, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getYears() {
        JButton years = new JButton("Вступление вне конкурса");

        years.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Вступление_вне_конкурса.xlsx"));

        jPanelThreeWindow.add(years, new GridBagConstraints(8, 1, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getReasonsForDeductions() {
        JButton reasonsForDeductions = new JButton("Причины отчисления");

        reasonsForDeductions.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Причины_отчисления.xlsx"));

        jPanelThreeWindow.add(reasonsForDeductions, new GridBagConstraints(0, 2, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getPilgysUponAccession() {
        JButton pilgysUponAccession = new JButton("Пильгы при вступлении");

        pilgysUponAccession.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Пильгы_при_вступлении.xlsx"));

        jPanelThreeWindow.add(pilgysUponAccession, new GridBagConstraints(4, 2, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getDirectionOfTraining() {
        JButton directionOfTraining = new JButton("Направление подготовки");

        directionOfTraining.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Направление_подготовки.xlsx"));

        jPanelThreeWindow.add(directionOfTraining, new GridBagConstraints(8, 2, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getOrderOfAdmission() {
        JButton orderOfAdmission = new JButton("Приказ о зачислении");

        orderOfAdmission.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Приказ_о_зачислении.xlsx"));

        jPanelThreeWindow.add(orderOfAdmission, new GridBagConstraints(0, 3, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getAcademicDisciplines() {
        JButton academicDisciplines = new JButton("Учебные дисциплины");

        academicDisciplines.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Учебные_дисциплины.xlsx"));

        jPanelThreeWindow.add(academicDisciplines, new GridBagConstraints(4, 3, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getMilitaryRank() {
        JButton militaryRank = new JButton("Воинское звание");

        militaryRank.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Воинское_звание.xlsx"));

        jPanelThreeWindow.add(militaryRank, new GridBagConstraints(8, 3, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getSpecialization() {
        JButton specialization = new JButton("Специализация");

        specialization.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Специализация.xlsx"));

        jPanelThreeWindow.add(specialization, new GridBagConstraints(0, 4, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getSpecialty() {
        JButton specialty = new JButton("Специальность");

        specialty.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Специальность.xlsx"));

        jPanelThreeWindow.add(specialty, new GridBagConstraints(4, 4, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));

    }

    private static void getFaculty() {
        JButton faculty = new JButton("Факультет");

        faculty.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Факультет.xlsx"));

        jPanelThreeWindow.add(faculty, new GridBagConstraints(8, 4, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getSemesterControlForm() {
        JButton semesterControlForm = new JButton("Форма семестрового контроля");

        semesterControlForm.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Форма_семестрового_контроля.xlsx"));

        jPanelThreeWindow.add(semesterControlForm, new GridBagConstraints(0, 5, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getStatement() {
        JButton statements = new JButton("Ведомости");

        statements.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Ведомости.xlsx"));

        jPanelThreeWindow.add(statements, new GridBagConstraints(4, 5, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getBall() {
        JButton balls = new JButton("Бали");

        balls.addActionListener(e -> OpenLocalFile.openLocalFile("C://Training_division_tools//info//Бали.xlsx"));

        /*if (balls.isSelected()) {
            balls.addActionListener(e -> {
                new Mark();
            });
        }*/

        jPanelThreeWindow.add(balls, new GridBagConstraints(8, 5, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }
}
