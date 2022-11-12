package com.example.databaseofstudents;

public class Student {
    private String name, surname, patronymic_name, birthday;
    private Group group;

    public Student() {
    }

    public Student(String name, String surname, String patronymic_name, String birthday, Group group) {
        this.name = name;
        this.surname = surname;
        this.patronymic_name = patronymic_name;
        this.birthday = birthday;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic_name() {
        return patronymic_name;
    }

    public void setPatronymic_name(String patronymic_name) {
        this.patronymic_name = patronymic_name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
