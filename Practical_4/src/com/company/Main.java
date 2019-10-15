package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("Score");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(50,50, 405,250);
        window.setContentPane(new MyPanel());
        window.pack();
        window.setVisible(true);
    }
}
