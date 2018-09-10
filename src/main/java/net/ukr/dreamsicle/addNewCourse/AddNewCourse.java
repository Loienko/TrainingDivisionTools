package net.ukr.dreamsicle.addNewCourse;

import com.sun.istack.internal.NotNull;
import net.ukr.dreamsicle.logger.Logger;

import java.io.File;
import java.io.IOException;

import static net.ukr.dreamsicle.date.Date.getYearDate;
import static net.ukr.dreamsicle.read_write_copy_file.CopyFile.getCopyFile;

public class AddNewCourse {

    public File mainFolder;
    public File folderYearCadets;


    @NotNull
    private void createNewFile(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                Logger.log(e.toString());
            }
        }
    }

    @NotNull
    private void createNewFolder(File folderYearCadets) {
        if (!folderYearCadets.exists()) {
            try {
                folderYearCadets.mkdir();
            } catch (Exception e) {
                Logger.log(e.toString());
            }
        }
    }

    public void createFolder() {
        mainFolder = new File("C://Training_division_tools");
        int year = getYearDate();

        File log = new File(mainFolder + "/Log");

        File loggerTXT = new File(log + "/logger.txt");
        folderYearCadets = new File(mainFolder + "/" + year + "_год_поступления");
        File info = new File(mainFolder + "/info");


        File firstCourse = new File(folderYearCadets + "/1_курс");
        File secondCourse = new File(folderYearCadets + "/2_курс");
        File thirdCourse = new File(folderYearCadets + "/3_курс");
        File fourthCourse = new File(folderYearCadets + "/4_курс");
        File fifthCourse = new File(folderYearCadets + "/5_курс");
        File listCadets = new File(folderYearCadets + "/list_cadets");


        createNewFolder(mainFolder);
        createNewFolder(folderYearCadets);
        createNewFolder(log);
        createNewFolder(info);

        createNewFile(loggerTXT);

        createNewFolder(firstCourse);
        createNewFolder(secondCourse);
        createNewFolder(thirdCourse);
        createNewFolder(fourthCourse);
        createNewFolder(fifthCourse);
        createNewFolder(listCadets);

        getCopyFile("C:/TrainingDivisionTools/resourses/file/commonTable.xlsx", firstCourse + "/commonTable.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/rating.xlsx", firstCourse + "/rating.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/statement.xlsx", firstCourse + "/statement.xlsx");

        getCopyFile("C:/TrainingDivisionTools/resourses/file/Бали.xlsx", info + "/Бали.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Ведомости.xlsx", info + "/Ведомости.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Воинское_звание.xlsx", info + "/Воинское_звание.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Учебные_дисциплины.xlsx", info + "/Учебные_дисциплины.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Приказ_о_зачислении.xlsx", info + "/Приказ_о_зачислении.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Направление_подготовки.xlsx", info + "/Направление_подготовки.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Пильгы_при_вступлении.xlsx", info + "/Пильгы_при_вступлении.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Причины_отчисления.xlsx", info + "/Причины_отчисления.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Год.xlsx", info + "/Год.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Семейное_положение.xlsx", info + "/Семейное_положение.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Семестровый_план.xlsx", info + "/Семестровый_план.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Специализация.xlsx", info + "/Специализация.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Специальность.xlsx", info + "/Специальность.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Факультет.xlsx", info + "/Факультет.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Форма_семестрового_контроля.xlsx", info + "/Форма_семестрового_контроля.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Вступление_вне_конкурса.xlsx", info + "/Вступление_вне_конкурса.xlsx");
        getCopyFile("C:/TrainingDivisionTools/resourses/file/Список_групп.xlsx", info + "/Список_групп.xlsx");

    }
}


