package com.company;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    Rectangle() {
        super();
        width = 0;
        length = 0;
    }

    Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
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
        return "Прямоугольник" + "\nДлина: " + length + "\nШирина: " + width + "\nПериметр: " + getPerimeter() + "\nПлощадь: " + getArea()  + "\nЦвет: " + color;
    }
}
