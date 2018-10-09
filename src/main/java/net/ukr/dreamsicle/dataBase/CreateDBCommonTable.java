package net.ukr.dreamsicle.dataBase;

import org.junit.Test;

import java.util.ArrayList;

public class CreateDBCommonTable {
    ArrayList<String> list = new ArrayList<>();

    public CreateDBCommonTable() {
        list.add("id");
        list.add("group");
        list.add("rank");
        list.add("surname");
        list.add("name");
        list.add("middleName");
        list.add("faculty");
        list.add("date");
        list.add("endSchoolPlace");
        list.add("wedding");
        list.add("livePlace");
        list.add("birthdayPlace");
        list.add("nationality");
        list.add("pilings");
        list.add("enrolledByOrder");
        list.add("outsideTheCompetition");
        list.add("registrationNumber");
        list.add("entranceRating");
        list.add("violation");
        list.add("positive");
        list.add("reasonForDeduction");
        list.add("orderNumber");
        list.add("orderDate");
        list.add("yearOfTheSet");
        list.add("transferToSpeciality");
        list.add("phone");
        list.add("transferredToSpecialization");
        list.add("transferToFaculty");
    }

    @Test
    public static void main(String[] args) {
        CreateDBCommonTable createDBCommonTable = new CreateDBCommonTable();
        String commonTable = createDBCommonTable.getCreateDBCommonTable();
        String insertNameField = createDBCommonTable.getInsertNameField();
        String insertQuestionMarkField = createDBCommonTable.getInsertQuestionMarkField();

        System.out.println(commonTable);
        System.out.println(insertNameField);
        System.out.println(insertQuestionMarkField);
    }

    protected String getCreateDBCommonTable() {
        StringBuilder builder = new StringBuilder(list.size());


        builder.append(list.get(0) + " INT NOT NULL AUTO_INCREMENT PRIMARY KEY, ");
        for (int i = 1; i < list.size(); i++) {
            builder.append(list.get(i) + " VARCHAR(80), ");
        }
        builder.deleteCharAt(builder.lastIndexOf(", "));

        return builder.toString();
    }

    protected String getInsertQuestionMarkField() {
        StringBuilder builder = new StringBuilder(list.size() - 1);

        for (int i = 1; i < list.size(); i++) {
            builder.append("?, ");
        }
        builder.deleteCharAt(builder.lastIndexOf(", "));

        return builder.toString();
    }

    protected String getInsertNameField() {
        StringBuilder builder = new StringBuilder(list.size() - 1);

        for (int i = 1; i < list.size(); i++) {
            builder.append(list.get(i) + ", ");
        }
        builder.deleteCharAt(builder.lastIndexOf(", "));

        return builder.toString();
    }
}
