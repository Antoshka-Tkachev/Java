package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вариант: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                MyWindow Window = new MyWindow("Game");
                Window.setVisible(true);
                break;
            case 2:
                JFrame window = new JFrame("Window");
                window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                window.setBounds(500, 200, 700, 500);
                window.getContentPane().add(new MyPanel());
                window.setVisible(true);
                break;
            default:
                break;
        }
    }
}
