package com.company;

import java.util.Scanner;

public class Nursery {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Ball first_ball = new Ball(5, "red");
        Ball second_ball = new Ball( "red");
        Ball third_ball = new Ball (5);
        Ball fourth_ball = new Ball ();

        Book first_book = new Book("Колобок", "Народ", 100);
        Book second_book = new Book("Колобок", "Народ");
        Book third_book = new Book("Колобок");
        Book fourth_book = new Book();

        System.out.println(first_ball);
        System.out.println(second_ball);
        System.out.println(third_ball);
        System.out.println(fourth_ball);

        System.out.println(first_book);
        System.out.println(second_book);
        System.out.println(third_book);
        System.out.println(fourth_book);


    }
}
