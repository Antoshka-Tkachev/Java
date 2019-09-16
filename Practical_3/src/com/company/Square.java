package com.company;

public class Square extends Rectangle {

    Square() {
        super();
    }

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Квадрат" + "\nДлина: " + length + "\nШирина: " + width + "\nПериметр: " + getPerimeter() + "\nПлощадь: " + getArea()  + "\nЦвет: " + color;
    }

}
