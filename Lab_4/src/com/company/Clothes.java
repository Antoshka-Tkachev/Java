package com.company;

public class Clothes implements Priceable {
    double price;

    Clothes(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
