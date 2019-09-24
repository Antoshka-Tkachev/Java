package com.company;

import java.awt.*;

public class Triangle extends Shape {

    Triangle() {
        for (int i = 0; i < 3; i++) {
            rgb[i] = random.nextInt(255);
        }

        setNumberOfVertices(3);
        x = new int[3];
        y = new int[3];


        x[0] = random.nextInt(700) + 70;
        y[0] = random.nextInt(800) + 70;

        x[2] = x[0] + random.nextInt(30) + 60;
        y[2] = y[0] + random.nextInt(15);

        x[1] = (x[0] + x[2]) / 2 + random.nextInt(100) - random.nextInt(100);
        y[1] = y[0] + random.nextInt(100) - random.nextInt(100);


    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(rgb[0], rgb[1], rgb[2]));
        g.drawPolygon(x, y, getNumberOfVertices());
        g.fillPolygon(x, y, getNumberOfVertices());
    }
}

