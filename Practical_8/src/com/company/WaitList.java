package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList {
    protected ConcurrentLinkedQueue <E> content;
    protected Iterator <E> iterator;

    public WaitList() {
        content = new ConcurrentLinkedQueue <> ();
    }

    public WaitList(ConcurrentLinkedQueue <E> c) {
        content = c;
    }

    @Override
    public void add(Object element) {
        content.add((E) element);
    }

    @Override
    public E remove() {
        if (content.size() > 0) {
            return content.poll();
        }
        else  {
            System.out.println("Очередь пуста!");
            return null;
        }
    }

    @Override
    public boolean contains(Object element) {
        iterator = content.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        if (content.size() == c.size()) {
            iterator = content.iterator();
            int countEqual = 0;
            while (iterator.hasNext()) {
                if (c.contains(iterator.next())) {
                    countEqual++;
                }
            }
            if (countEqual == content.size()) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public boolean isEmpty() {
        if (content.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content = " + content +
                '}';
    }
}