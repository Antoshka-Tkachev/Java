package com.company;

import java.util.Scanner;
public class CircleTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        Circle first = new Circle(in.nextDouble());
        System.out.println("Радиус окружности: " + first.getRadius());
        System.out.println("Диаметр окружности: " + first.diameter());
        System.out.println("Длина окружности: " + first.lengthCircle());

        System.out.print("Введите новый радиус окружности: ");
        first.setRadius(in.nextDouble());
        System.out.println("Радиус окружности: " + first.getRadius());
        System.out.println("Диаметр окружности: " + first.diameter());
        System.out.println("Длина окружности: " + first.lengthCircle());
    }
}
