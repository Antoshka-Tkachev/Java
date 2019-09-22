package com.company;

public class Student {
    private String name;
    private int point;
    private String iDNumber;

    Student (String name, String iDNumber, int point) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.point = point;
    }


    public String getIDNumber() {
        return iDNumber;
    }

    public int getPoint() {
        return point;
    }
}
