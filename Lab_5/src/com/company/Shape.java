package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Shape extends JFrame {
    protected Random random = new Random();
    protected int[] x; // = new int[]{40, 80, 80, 40};
    protected int[] y; // = new int[]{40, 40, 200, 200};
    protected int[] rgb = new int[3];
    private int numberOfVertices;

    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    public void setNumberOfVertices(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
    }

    public Shape() {
        super("20 Shapes");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setBounds(200,10,1000, 900);
        setVisible(true);
    }

     //public void paint(Graphics g) {};
}
