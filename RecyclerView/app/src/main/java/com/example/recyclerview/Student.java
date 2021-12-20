package com.example.recyclerview;

public class Student {
    private String rollNo;
    private String name;
    private String gender;
    private int  imageID;

    public Student(String rollNo, String name, String gender, int imageID) {
        this.rollNo = rollNo;
        this.name = name;
        this.gender = gender;
        this.imageID = imageID;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getImageID() {
        return imageID;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}