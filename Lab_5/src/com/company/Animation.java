package com.company;

import java.lang.*;
import javax.swing.*;
import javax.swing.ImageIcon;


public class Animation extends JFrame{
    JLabel image = new JLabel(new ImageIcon("D:\\Programs\\Java_Labs\\Lab_5\\image\\1.jpg"));

    Animation() {
        super("Lab 5 Part 3");
        this.setBounds(500, 300, 290, 210);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(image);
        setVisible(true);
    }

    public void animation() {
        String count = "2";
        while(true) {
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            image.setIcon(new ImageIcon("D:\\Programs\\Java_Labs\\Lab_5\\image\\"+ count +".jpg"));
            count = String.valueOf(Integer.parseInt(count) + 1);
            if(count.equals("7")) {
                count = "1";
            }
        }
    }
}
