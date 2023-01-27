package com.riznyk.com.Task1;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {
    private Object[] elements;
    private int size;


    public MyArrayList() {
        elements = new Object[0];
    }


    public Object[] add(Object value) {
        int size = elements.length;
        size++;
        Object[] secondArray = Arrays.copyOf(elements, size);
        for (int i = elements.length; i < size; i++) {
            secondArray[i] = value;
        }
        return elements = secondArray;
    }
    public int size() {
        return elements.length;
    }

    public T get(int index) {
        return (T) elements[index];
    }

    public Object[] remove(int index) {
        int size = elements.length;
        size--;
        int element = 0;
        Object[] secondArray = new Object[size];
        for (int i = 0; i < size; i++) {
            if (i == index) {
                element++;
            }
            secondArray[i] = elements[element];
            element++;
        }
        return elements = secondArray;
    }



    public void clear() {
        elements = new Objects[0];

    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

}
