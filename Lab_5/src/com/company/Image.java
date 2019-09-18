package com.company;

import java.lang.*;
import javax.swing.*;
import javax.swing.ImageIcon;


public class Image extends JFrame{
    JLabel image;

    Image(String Path) {
        super("Lab 5 Part 2");
        this.setBounds(450, 300, 500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        image = new JLabel(new ImageIcon(Path));
        add(image);
        setVisible(true);
    }
}