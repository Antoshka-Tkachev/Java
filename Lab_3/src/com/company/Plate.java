package com.company;

public class Plate extends Dish {

    @Override
    public void info() {
        System.out.println("Тарелка");
    }

    @Override
    public void mission() {
        System.out.println(" Из меня едят");
    }
}
