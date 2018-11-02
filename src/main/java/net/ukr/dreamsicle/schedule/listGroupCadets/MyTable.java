package net.ukr.dreamsicle.schedule.listGroupCadets;

public class MyTable {
    private String surname;
    private String name;
    private String middleName;
    private String grade;
    private String discipline;
    private String dateExam;


    public MyTable(String surname, String name, String middleName, String grade) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.grade = grade;
    }

    public String getDiscipline() {
        return discipline;
    }

    public String getDateExam() {
        return dateExam;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
