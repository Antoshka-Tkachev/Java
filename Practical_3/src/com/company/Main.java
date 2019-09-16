package com.company;

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println("");
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadius());
        //System.out.println(s1.getRadius());
        System.out.println("\n");

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println("");
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        System.out.println("\n");

        Shape s2 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s2);
        System.out.println("");
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
        System.out.println(s2.getColor());
        System.out.println(s2.isFilled());
        System.out.println(((Rectangle) s2).getLength());
        System.out.println(((Rectangle) s2).getWidth());
        System.out.println("\n");

        Rectangle r1 = (Rectangle)s2;
        System.out.println(r1);
        System.out.println("");
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getColor());
        System.out.println(r1.isFilled());
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        System.out.println("\n");

        Shape s3 = new Square(6.6, "RED", false);
        System.out.println(s3);
        System.out.println("");
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.isFilled());
        System.out.println(((Square) s3).getSide());
        System.out.println("\n");

        Rectangle r2 = (Rectangle)s3; // почему выводит "Квадрат"
        System.out.println(r2);
        System.out.println("");
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        System.out.println(r2.getColor());
        System.out.println(r2.isFilled());
        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());
        System.out.println("\n");

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println("");
        System.out.println(sq1.getArea());
        System.out.println(sq1.getPerimeter());
        System.out.println(sq1.getColor());
        System.out.println(sq1.isFilled());
        System.out.println(sq1.getSide());
        System.out.println("\n");
    }
}
