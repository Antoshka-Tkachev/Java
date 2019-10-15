package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyPanel extends JPanel {
    private int scoreMilan = 0;
    private int scoreMadrid = 0;

    MyPanel() {
        setLayout(null);
        JButton milan = new JButton("AC Milan");
        JButton madrid = new JButton("Real Madrid");

        JLabel result = new JLabel("Result: 0 X 0");
        JLabel lastScorer = new JLabel("Last Scorer: N/A");
        JLabel winner = new JLabel("Winner: DRAW");

        milan.setBounds(20, 20, 150, 30);
        madrid.setBounds(220, 20, 150, 30);
        result.setBounds(150,70, 200, 30);
        lastScorer.setBounds(150,120, 200, 30);
        winner.setBounds(150,170, 200, 30);


        add(milan);
        add(madrid);

        add(result);
        add(lastScorer);
        add(winner);

        MouseListener listenerMilan = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                scoreMilan++;
                result.setText("Result: " + scoreMilan + " X " + scoreMadrid);

                lastScorer.setText("Last Scorer: Milan");

                if (scoreMadrid > scoreMilan) {
                    winner.setText("Winner: Madrid");
                } else if (scoreMadrid < scoreMilan) {
                    winner.setText("Winner: Milan");
                } else {
                    winner.setText("Draw");
                }
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        };


        MouseListener listenerMadrid = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                scoreMadrid++;
                result.setText("Result: " + scoreMilan + " X " + scoreMadrid);

                lastScorer.setText("Last Scorer: Madrid");

                if (scoreMadrid > scoreMilan) {
                    winner.setText("Winner: Madrid");
                } else if (scoreMadrid < scoreMilan) {
                    winner.setText("Winner: Milan");
                } else {
                    winner.setText("Draw");
                }
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        };

        milan.addMouseListener(listenerMilan);
        madrid.addMouseListener(listenerMadrid);
    }
}
