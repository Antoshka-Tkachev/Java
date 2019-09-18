package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.print("Введите номер варианта: ");
        choice = in.nextInt();
        switch (choice) {
            case 1: //как отрывать 1 окно и все рисовать туда
                Shape[] shapes = new Shape[] { new Square(), new Rectangle() };
                break;
            case 2:
                Image img = new Image(args[0]);
                break;
            case 3:
                Animation app = new Animation();
                app.animation();
                break;
            default:
                System.out.println("Вы ввели неправильный вариант!");
                break;
        }
    }
}
