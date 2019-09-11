package com.company;

public class Main {

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();
        Furniture stool = new Stool();
        Furniture table = new Table();
        shop.list.add(stool);
        shop.list.add(table);
        for(int i = 0; i < shop.list.size(); i++) {
            shop.list.get(i).info();
        }
    }
}
