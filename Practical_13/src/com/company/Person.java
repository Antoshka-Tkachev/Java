package com.company;

public class Person {
    private String name;
    private String surname;


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Имя: " + name  + ", Фамилия: " + surname;
    }
}
