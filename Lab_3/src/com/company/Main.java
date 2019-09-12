package com.company;

public class Main {

    public static void main(String[] args) {
        //1 часть
        System.out.println("1 часть");
        Dish[] arrayDish = new Dish[] { new Cup(), new Plate(), new Spoon()};
        for(int i = 0; i < arrayDish.length; i++) {
            System.out.print("Кухонный прибор: ");
            arrayDish[i].info();
            System.out.print("Миссия прбора: ");
            arrayDish[i].mission();
            System.out.println("");
        }

        //2 часть
        System.out.println("2 часть");
        Dog[] arrayDog = new Dog[] { new Pug(), new Watchdog(), new Сhihuahua()};
        for(int i = 0; i < arrayDish.length; i++) {
            System.out.print("Порода собаки: ");
            arrayDog[i].breed();
        }

        //3 часть
        System.out.println("\n3 часть");
        FurnitureShop shop = new FurnitureShop();
        Furniture stool = new Stool();
        Furniture table = new Table();
        shop.list.add(stool);
        shop.list.add(table);
        for(int i = 0; i < shop.list.size(); i++) {
            System.out.print("Предмет мебели: ");
            shop.list.get(i).info();
        }
    }
}
