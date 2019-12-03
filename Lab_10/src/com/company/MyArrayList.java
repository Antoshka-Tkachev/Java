package com.company;

public class MyArrayList <T> {
    private int size;
    private Object[] array;

    public MyArrayList (T[] newArray) {
        size = 0;
        array = new Object[newArray.length];
        for (int i = 0; i < newArray.length; i++) {
            array[i] = newArray[i];
        }
        this.size = newArray.length;
    }

    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void output() {
        System.out.print("Массив: ");
        for (Object i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}