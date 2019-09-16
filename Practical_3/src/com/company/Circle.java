package com.company;

public class Circle extends Shape {

    protected  double radius;

    Circle() {
        super();
        radius = 0;
    }

    Circle(double radius) {
        super();
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "Круг" + "\nРадиус: " + radius + "\nПериметр: " + getPerimeter() + "\nПлощадь: " + getArea() + "\nЦвет: " + color;
    }
}
