package com.company;

import java.awt.*;

public class Oval extends Shape {

    Oval() {
        super();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(new Color(rgb[0], rgb[1], rgb[2]));
        g.drawOval(25, 25, 50, 50);
        g.fillOval(25, 25, 50, 50);
    }
}