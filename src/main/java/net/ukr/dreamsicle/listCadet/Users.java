package net.ukr.dreamsicle.listCadet;

public class Users {

    public String group;
    public String rank;
    public String surname;
    public String name;

    public Users(String group, String rank, String surname, String name) {
        this.group = group;
        this.rank = rank;
        this.surname = surname;
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
