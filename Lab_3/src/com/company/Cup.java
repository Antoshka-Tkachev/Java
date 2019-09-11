package com.company;

public class Cup extends Dish {

    @Override
    public void info() {
        System.out.println("Кружка");
    }

    @Override
    public void mission() {
        System.out.println(" Из меня пьют");
    }
}
