package com.example.databaseofstudents;

public class Group {
    private int number;
    private String faculty_name;

    public Group() {
    }

    Group(int number, String faculty_name){
        this.number = number;
        this.faculty_name = faculty_name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }
}
