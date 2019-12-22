package com.company;

public class Contact {
    private String name;
    private String numberOfPhone;

    public Contact(String name, String numberOfPhone) {
        this.name = name;
        this.numberOfPhone = numberOfPhone;
    }

    public String getName() {
        return name;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                '}';
    }
}
