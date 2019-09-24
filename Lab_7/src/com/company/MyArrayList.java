package com.company;

import java.util.Objects;

public class MyArrayList <T> {
   // private int init_size;
    private int size;
    private Object[] array;

    public MyArrayList () {
        size = 0;
        array = new Object[0];
    }

//    public MyArrayList (int int_size) {
//        this.init_size = int_size;
//        array = new Object[int_size];
//    }

    private void resize(int newSize) {
        Object[] newArray = new Object[newSize];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        size = newSize;
    }

    public void add(T element) {
       // if(size < init_size)
        resize(size + 1);
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, size - 1);
        newArray[size - 1] = element;
        array = newArray;
    }

    public void add(int index, T element) {
        resize(size + 1);
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, size - 1 - index);
        array = newArray;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void set(int index, T element) {
        array[index] = element;
    }


    public T remove(int index) {
        T temp = (T) array[index];
        Object[] newArray = new Object[size - 1];
        size -= 1;
        int count = 0;
        for (int i = 0; i < size + 1; i++) {
            if (index != i) {
                newArray[count] = array[i];
                count++;
            }
        }
        array = newArray;
        return temp;
    }

    public int indexOf(T element) { // почему не работает для 555
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }


    public boolean contains(Object element) { // почему не работает для 555
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        array = new Object[0];
        size = 0;
    }

    public boolean isEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }
}
