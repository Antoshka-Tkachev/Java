package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;


public class ShapePaint extends JPanel {
    private ArrayList <Shape> shapes = new ArrayList<>();

    public ShapePaint() {
        setBackground(Color.GRAY);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            switch (Math.abs(random.nextInt() % 5)) {
                case 0:
                    shapes.add(new Square());
                    break;
                case 1:
                    shapes.add(new Rectangle());
                    break;
                case 2:
                    shapes.add(new Triangle());
                    break;
                case 3:
                    shapes.add(new Circle());
                    break;
                case 4:
                    shapes.add(new Oval());
                    break;
                default:
                    break;
            }
        }
    }

    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).draw(page);
        }
    }
}
