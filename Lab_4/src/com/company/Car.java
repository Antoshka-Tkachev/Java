package com.company;

public class Car implements Priceable {
    double price;

    Car(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
