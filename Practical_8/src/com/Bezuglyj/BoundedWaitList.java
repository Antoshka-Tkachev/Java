package com.Bezuglyj;

import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList <E> extends WaitList {
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add(Object element) {
        if (content.size() == capacity) {
            System.out.println("Выход за границы массива!");
        }
        else {
            content.add(element);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}