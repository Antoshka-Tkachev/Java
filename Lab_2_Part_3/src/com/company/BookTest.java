package com.company;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //создание объектов
        Book first_book = new Book("Колобок", "Народ", 100, 1969);
        Book second_book = new Book();
        System.out.println("Информация о первой книге заполнена!\n");

        //измененние паратметров второй книги
        System.out.print("Введите название 2ой книги: ");
        second_book.set_name(in.nextLine());
        System.out.print("Введите автора 2ой книги: ");
        second_book.set_autor(in.nextLine());
        System.out.print("Введите цену 2ой книги: ");
        second_book.set_price(in.nextDouble());
        System.out.print("Год издания 2ой книги: ");
        second_book.set_year(in.nextInt());

        //вывод информации об объектах
        System.out.println("");
        System.out.println(first_book.ToString());
        System.out.println(second_book.ToString());
    }
}
