package com.company;

import java.awt.*;

public class Square extends Shape {

    Square() {
        //super();
        for (int i = 0; i < 3; i++) {
            rgb[i] = random.nextInt(255);
        }

        setNumberOfVertices(4);
        x = new int[4];
        y = new int[4];

        int side = random.nextInt(70) + 20;

        x[0] = random.nextInt(800) + 50;
        y[0] = random.nextInt(700) + 50;

        x[1] = x[0] + side;
        y[1] = y[0];

        x[2] = x[1];
        y[2] = y[1] + side;

        x[3] = x[0];
        y[3] = y[2];

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(new Color(rgb[0], rgb[1], rgb[2]));
        g.drawPolygon(x, y, getNumberOfVertices());
        g.fillPolygon(x, y, getNumberOfVertices());
    }
}

