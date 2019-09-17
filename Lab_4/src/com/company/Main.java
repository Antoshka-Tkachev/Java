package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.print("Выберете номер варианта: ");
        choice = in.nextInt();
        in.skip("\n");
        switch (choice) {
            case 1:
                String name;
                System.out.print("Введите имя человека: ");
                name = in.nextLine();
                Human human = new Human(name);
                System.out.print("Введите имя собаки: ");
                name = in.nextLine();
                Dog dog = new Dog(name);

            System.out.println("Имя человека: " + human.getName());
            System.out.println("Имя собаки: " + dog.getName());
            break;

            case 2:
                double price;
                System.out.print("Введите цену машины: ");
                price = in.nextDouble();
                Car car = new Car(price);
                System.out.print("Введите цену одежды: ");
                price = in.nextDouble();
                Clothes clothes = new Clothes(price);

                System.out.println("Цена машины: " + car.getPrice());
                System.out.println("Цена одежды: " + clothes.getPrice());
                break;
            default:
                System.out.println("Вы ввели не верный номер варианта!");
        }
    }
}
