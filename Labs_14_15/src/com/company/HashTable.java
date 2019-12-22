package com.company;

import java.util.ArrayList;

import static java.lang.System.arraycopy;

public class HashTable <TKey, TValue> {
    private ArrayList<TValue>[] values;
    private int size;
    private int usedSize;
    private ArrayList<TKey> keys;

    public HashTable() {
        usedSize = 1;
        size = usedSize + 66;
        values = new ArrayList[size];
        keys = new ArrayList<>();
    }

    public HashTable(int size) {
        this.usedSize = usedSize;
        size = this.usedSize + 66;
        values = new ArrayList[size];
        keys = new ArrayList<>();
    }

    public void put(TKey key, TValue value) {
        int k = GetHashCode(key);
        UpdateKeys(key);
        if (values[k] == null) {
            if (usedSize + 1 == size) {
                Resize();
            }
            else {
                usedSize++;
            }
            values[k] = new ArrayList<>();
            values[k].add(value);
        }
        else {
            values[k].add(value);
        }
    }

    public TValue get(TKey key) {
        int k = GetHashCode(key);
        try {
            return values[k].get(values[k].size() - 1);
        }
        catch (Exception ex) {
            return null;
        }
    }

    public TValue remove(TKey key, TValue value) {
        int k = GetHashCode(key);
        int index = values[k].indexOf(value);
        return values[k].remove(index);
    }

    public Boolean Search(TKey key, TValue value) {
        int k = GetHashCode(key);
        if (values[k].contains(value)) {
            return true;
        }
        else {
            return false;
        }
    }

    private void Resize() {
        usedSize++;
        size += 66;
        ArrayList<TValue>[] resize = new ArrayList[size];
    }

    private void Resize(int newSize) {
        ArrayList<TValue>[] resize = new ArrayList[newSize];
        arraycopy(values, 0, resize, 0, size);
        values = resize;
        size = newSize;
    }

    private void UpdateKeys(TKey key) {
        if(!keys.contains(key)) {
            keys.add(key);
        }
    }

    private int GetHashCode(TKey key) {
        int hash;
        if (keys.contains(key) == true) {
            hash = keys.indexOf(key);
        }
        else {
            hash = keys.size();
        }
        if (hash >= size) {
            Resize(hash + 1);
        }
        return hash;
    }
}