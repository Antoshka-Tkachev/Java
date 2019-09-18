package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AWTPainting extends JFrame {

    public AWTPainting() {
        super("AWTPainting");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawPolygon(new int[]{20, 80,80,20}, new int[]{100, 100,200,200},4);
        g.setColor(Color.CYAN);
        g.fillPolygon(new int[]{20, 80,80,20}, new int[]{100, 100,200,200},4);

//        g.setColor(Color.RED);
//        g.drawOval(200,200,40,80);
        g.setColor(Color.RED);
        g.fillOval(200,200,40,80);
    }
}

