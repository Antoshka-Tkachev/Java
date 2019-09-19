package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public abstract class Shape extends JPanel {
    protected Random random = new Random();
    protected int[] x;
    protected int[] y;
    protected int[] rgb = new int[3];
    private int numberOfVertices;

    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    public void setNumberOfVertices(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
    }

    public Shape() { }

}
