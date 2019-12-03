package com.company;

public class Main {

    public static void main(String[] args) {
        Integer[] intArray = new Integer[] {5, 4, 3, 2, 1};
        String[] strArray = new String[] {"5", "4", "3", "2", "1"};

        MyArrayList<String> strArrayList = new MyArrayList<String>(strArray);
        MyArrayList<Integer> intArrayList = new MyArrayList<Integer>(intArray);

        System.out.println("Элемент с индексом 4: " + intArrayList.get(4));
        System.out.println("Элемент с индексом 4: " + strArrayList.get(4));

        System.out.println("Индекс элемента 1: " + intArrayList.indexOf(1));
        System.out.println("Индекс элемента 1: " + strArrayList.indexOf("1"));

        intArrayList.output();
        strArrayList.output();
    }
}
