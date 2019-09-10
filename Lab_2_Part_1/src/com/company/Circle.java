package com.company;

public class Circle {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public double diameter(){
        return radius*2;
    }

    public double lengthCircle(){
        return 2*3.14*radius;
    }
}
