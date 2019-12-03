package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class myPanel extends JPanel {
    private Logic logic;
    private JLabel labelFIO;
    private JLabel labelINN;
    private JTextField textFIO;
    private JTextField textINN;
    private JButton buttonSave;
    private ActionListener actionListenerSave;

    public myPanel() {
        setLayout(null);
        setBackground(Color.cyan);

        textFIO = new JTextField();
        textFIO.setBounds(240, 205, 140, 28);
        textFIO.setFont(new Font("System", Font.BOLD, 19));
        int limitFIO = 19;
        textFIO.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent event) {
                if(limitFIO <= textFIO.getText().length()) {
                    event.consume();
                }
            }
        });

        textINN = new JTextField();
        textINN.setBounds(240, 240, 140, 28);
        textINN.setFont(new Font("System", Font.BOLD, 19));
        int limitINN = 10;
        textINN.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent event) {
                if(limitINN <= textINN.getText().length()) {
                    event.consume();
                }
            }
        });

        labelFIO = new JLabel();
        labelFIO.setBounds(100, 205, 133, 28);
        labelFIO.setFont(new Font("System", Font.BOLD, 19));
        labelFIO.setText("Введите ФИО:");

        labelINN = new JLabel();
        labelINN.setBounds(100, 240, 133, 28);
        labelINN.setFont(new Font("System", Font.BOLD, 19));
        labelINN.setText("Введите ИНН:");

        buttonSave = new JButton();
        buttonSave.setBounds(180, 275, 140, 28);
        buttonSave.setFont(new Font("System", Font.BOLD, 19));
        buttonSave.setText("Отправить");

        add(textFIO);
        add(textINN);
        add(labelFIO);
        add(labelINN);
        add(buttonSave);

        actionListenerSave = new ClickToSaveFileButtonListener();
        buttonSave.addActionListener(actionListenerSave);
    }

    public class ClickToSaveFileButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            logic = new Logic(textFIO.getText(), textINN.getText());
            try {
                logic.checkInput();
                GetMessageBox("Корректный ввод!");
            } catch (MyException ex) {
                GetMessageBox("Некорректный ввод ИНН!");
            }
        }
    }

    public void GetMessageBox(String information) {
        JOptionPane.showMessageDialog(null, information);
    }
}