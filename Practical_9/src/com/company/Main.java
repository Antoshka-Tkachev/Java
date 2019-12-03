package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("Окно оформления заказа");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setBounds(328, 128, 550, 550);
        window.setContentPane(new myPanel());
        window.setVisible(true);
    }
}
