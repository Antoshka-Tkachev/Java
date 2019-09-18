package com.company;

import java.awt.*;

public class Triangle extends Shape {

    Triangle() {
        super();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(new Color(rgb[0], rgb[1], rgb[2]));
        g.drawPolygon(x, y, getNumberOfVertices());
        g.fillPolygon(x, y, getNumberOfVertices());
    }
}

