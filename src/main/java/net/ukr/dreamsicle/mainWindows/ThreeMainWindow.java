package net.ukr.dreamsicle.mainWindows;

import net.ukr.dreamsicle.ResourceLoader;
import net.ukr.dreamsicle.interfacePackage.Back;
import net.ukr.dreamsicle.read_write_copy_file.OpenLocalFileWithDifferentFormats;
import net.ukr.dreamsicle.schedule.updateWriteCreateTableToDB.WriteFileToDB;

import javax.swing.*;
import java.awt.*;

import static net.ukr.dreamsicle.Window.*;

public class ThreeMainWindow implements Back {

    public static void getThreeMainWindow() {
        jPanelThreeWindow.setLayout(new GridBagLayout());

        getBall();
        getStatement();
        getMilitaryRank();
        getAcademicDisciplines();
        getOrderOfAdmission();
        getDirectionOfTraining();
        getPilingsUponAccession();
        getReasonsForDeductions();
        getYears();
        getFamilyStatus();
        getTheSemesterPlan();
        getSpecialization();
        getSpecialty();
        getFaculty();
        getSemesterControlForm();

        getBackTwoWindow();


        jPanelThreeWindow.updateUI();
    }

    public static void getBackTwoWindow() {
        JButton back = new JButton("Назад");
        back.setIcon(new ImageIcon(ResourceLoader.getImage("/image/undo.png")));

        back.addActionListener(e -> {
            jPanelMainWindow.setVisible(false);
            jPanelTwoWindow.setVisible(true);
            jPanelThreeWindow.setVisible(false);
            jPanelFourWindow.setVisible(false);
            jPanelFiveWindowArchive.setVisible(false);
            jPanelScheduleSession.setVisible(false);

            Thread thread = new Thread(() -> {
                WriteFileToDB writeFileToDB = new WriteFileToDB();
                writeFileToDB.getWriteDataDisciplineToDB();
            });
            thread.start();
            thread.isInterrupted();

            back.setSelected(false);


        });

        jPanelThreeWindow.add(back, new GridBagConstraints(8, 0, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getTheSemesterPlan() {
        JButton semesterPlan = new JButton("Семестровый план");

        semesterPlan.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/plan.png")));

        semesterPlan.addActionListener(e -> OpenLocalFileWithDifferentFormats.getOpenLocalFileWithDifferentFormats("C://Training_division_tools//info//Семестровый_план.xlsx"));

        jPanelThreeWindow.add(semesterPlan, new GridBagConstraints(0, 1, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getFamilyStatus() {
        JButton familyStatus = new JButton("Семейное положение");

        familyStatus.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/wedding.png")));

        familyStatus.addActionListener(e -> OpenLocalFileWithDifferentFormats.getOpenLocalFileWithDifferentFormats("C://Training_division_tools//info//Семейное_положение.xlsx"));

        jPanelThreeWindow.add(familyStatus, new GridBagConstraints(4, 1, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getYears() {
        JButton years = new JButton("Вступление вне конкурса");

        years.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/addmission.png")));
        years.addActionListener(e -> OpenLocalFileWithDifferentFormats.getOpenLocalFileWithDifferentFormats("C://Training_division_tools//info//Вступление_вне_конкурса.xlsx"));

        jPanelThreeWindow.add(years, new GridBagConstraints(8, 1, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getReasonsForDeductions() {
        JButton reasonsForDeductions = new JButton("Причины отчисления");

        reasonsForDeductions.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/deduction.png")));

        reasonsForDeductions.addActionListener(e -> OpenLocalFileWithDifferentFormats.getOpenLocalFileWithDifferentFormats("C://Training_division_tools//info//Причины_отчисления.xlsx"));

        jPanelThreeWindow.add(reasonsForDeductions, new GridBagConstraints(0, 2, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getPilingsUponAccession() {
        JButton pilingsUponAccession = new JButton("Пильгы при вступлении");

        pilingsUponAccession.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/pilings.png")));

        pilingsUponAccession.addActionListener(e -> OpenLocalFileWithDifferentFormats.getOpenLocalFileWithDifferentFormats("C://Training_division_tools//info//Пильгы_при_вступлении.xlsx"));

        jPanelThreeWindow.add(pilingsUponAccession, new GridBagConstraints(4, 2, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getDirectionOfTraining() {
        JButton directionOfTraining = new JButton("Направление подготовки");

        directionOfTraining.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/direction.png")));

        directionOfTraining.addActionListener(e -> OpenLocalFileWithDifferentFormats.getOpenLocalFileWithDifferentFormats("C://Training_division_tools//info//Направление_подготовки.xlsx"));

        jPanelThreeWindow.add(directionOfTraining, new GridBagConstraints(8, 2, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getOrderOfAdmission() {
        JButton orderOfAdmission = new JButton("Приказ о зачислении");

        orderOfAdmission.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/order.png")));

        orderOfAdmission.addActionListener(e -> OpenLocalFileWithDifferentFormats.getOpenLocalFileWithDifferentFormats("C://Training_division_tools//info//Приказ_о_зачислении.xlsx"));

        jPanelThreeWindow.add(orderOfAdmission, new GridBagConstraints(0, 3, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getAcademicDisciplines() {
        JButton academicDisciplines = new JButton("Учебные дисциплины");

        academicDisciplines.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/academic.png")));

        academicDisciplines.addActionListener(e -> OpenLocalFileWithDifferentFormats.getOpenLocalFileWithDifferentFormats("C://Training_division_tools//info//Учебные_дисциплины.xlsx"));

        jPanelThreeWindow.add(academicDisciplines, new GridBagConstraints(4, 3, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
        academicDisciplines.setSelected(false);
    }

    private static void getMilitaryRank() {
        JButton militaryRank = new JButton("Воинское звание");

        militaryRank.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/rank.png")));

        militaryRank.addActionListener(e -> OpenLocalFileWithDifferentFormats.getOpenLocalFileWithDifferentFormats("C://Training_division_tools//info//Воинское_звание.xlsx"));

        jPanelThreeWindow.add(militaryRank, new GridBagConstraints(8, 3, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getSpecialization() {
        JButton specialization = new JButton("Специализация");

        specialization.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/engineer.png")));

        specialization.addActionListener(e -> OpenLocalFileWithDifferentFormats.getOpenLocalFileWithDifferentFormats("C://Training_division_tools//info//Специализация.xlsx"));

        jPanelThreeWindow.add(specialization, new GridBagConstraints(0, 4, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getSpecialty() {
        JButton specialty = new JButton("Специальность");

        specialty.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/specialty.png")));

        specialty.addActionListener(e -> OpenLocalFileWithDifferentFormats.getOpenLocalFileWithDifferentFormats("C://Training_division_tools//info//Специальность.xlsx"));

        jPanelThreeWindow.add(specialty, new GridBagConstraints(4, 4, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));

    }

    private static void getFaculty() {
        JButton faculty = new JButton("Факультет");

        faculty.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/faculty.png")));

        faculty.addActionListener(e -> OpenLocalFileWithDifferentFormats.getOpenLocalFileWithDifferentFormats("C://Training_division_tools//info//Факультет.xlsx"));

        jPanelThreeWindow.add(faculty, new GridBagConstraints(8, 4, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getSemesterControlForm() {
        JButton semesterControlForm = new JButton("Форма семестрового контроля");

        semesterControlForm.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/exam.png")));

        semesterControlForm.addActionListener(e -> OpenLocalFileWithDifferentFormats.getOpenLocalFileWithDifferentFormats("C://Training_division_tools//info//Форма_семестрового_контроля.xlsx"));

        jPanelThreeWindow.add(semesterControlForm, new GridBagConstraints(0, 5, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getStatement() {
        JButton statements = new JButton("Ведомости");

        statements.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/statement.png")));

        statements.addActionListener(e -> OpenLocalFileWithDifferentFormats.getOpenLocalFileWithDifferentFormats("C://Training_division_tools//info//Ведомости.xlsx"));

        jPanelThreeWindow.add(statements, new GridBagConstraints(4, 5, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    private static void getBall() {
        JButton balls = new JButton("Бали");

        balls.setIcon(new ImageIcon(ResourceLoader.getImage("/image/forButton/balls.png")));

        balls.addActionListener(e -> OpenLocalFileWithDifferentFormats.getOpenLocalFileWithDifferentFormats("C://Training_division_tools//info//Бали.xlsx"));

        jPanelThreeWindow.add(balls, new GridBagConstraints(8, 5, 4, 1, 0.0, 0.9,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(30, 2, 2, 2),
                0, 0));
    }

    @Override
    public void getBack() {

    }

}
