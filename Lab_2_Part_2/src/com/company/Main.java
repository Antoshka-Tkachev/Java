package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //сохдание объектов
        Scanner in = new Scanner(System.in);
        Human firstHuman = new Human();
        Human.Head firstHead = firstHuman.new Head();
        Human.Hand firstHand = firstHuman.new Hand();
        Human.Leg firstLeg = firstHuman.new Leg();
       //ввод информации
        System.out.print("Введите вес человека: ");
        firstHuman.setWeight(in.nextDouble());
        System.out.print("Введите рост человека: ");
        firstHuman.setHeight(in.nextDouble());
        System.out.print("Введите длину рук человека: ");
        firstHand.setArmLength(in.nextDouble());
        System.out.print("Введите цвет волос человека: ");
        in.skip("\n");
        firstHead.setHairColor(in.nextLine());
        System.out.print("Введите размер ноги человека: ");
        firstLeg.setSize(in.nextDouble());
        //вывод информации
        System.out.println("\nВес человека: " + firstHuman.getWeight());
        System.out.println("Рост человека: " + firstHuman.getHeight());
        System.out.println("Длина рук человека: " + firstHand.getArmLength());
        System.out.println("Цвет волос человека: " + firstHead.getHairColor());
        System.out.println("Размер ноги человека: " + firstLeg.getSize());
    }
}
