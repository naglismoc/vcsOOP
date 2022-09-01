package com.company;

import java.util.Calendar;

public class Student {
    private String name;
    private String surname;
    private int birthDate;
    private String school;
    private int grade;
    private boolean gender;


    public Student() {
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
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

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public static void classDescription(){
        System.out.println("sita klase yra skirta sukurti studento objekta");
    }

    public int getCurrentAge(){
        return  Calendar.getInstance().get(Calendar.YEAR) - this.birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", school='" + school + '\'' +
                ", grade=" + grade +
                ", gender=" + gender +
                '}';
    }
}
