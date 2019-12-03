package com.company;

public class Logic {
    private String FIO;
    private String INN;

    public Logic(String FIO, String INN) {
        this.FIO = FIO;
        this.INN = INN;
    }

    public void checkInput() throws MyException {
        try {
            Integer.parseInt(INN);
            if (INN.length() != 10) {
                throw new MyException("Неправильный ввод ИНН!");
            }
        } catch (Exception e) {
            throw new MyException("Неправильный ввод ИНН!");
        }

    }
}