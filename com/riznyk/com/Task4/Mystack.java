package com.riznyk.com.Task4;

import java.util.Arrays;

public class Mystack<T> {
    private Object[] elements;
    private int size;


    public Mystack() {
        elements = new Object[0];
    }

    public Object[] push(Object value) {
        int size = elements.length;
        size++;
        Object[] secondArray = Arrays.copyOf(elements, size);
        for (int i = elements.length; i < size; i++) {
            secondArray[i] = value;
        }
        return elements = secondArray;
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

    public int size() {
        return elements.length;
    }

    public T peek() {
        return (T) elements[0];
    }

    public T pop() {
        T value = null;
        for (Object element : elements) {
            value = (T) element;
            break;
        }
        remove(0);
        return value;
    }
public void clear(){
        elements = null;
        size = 0;

}
    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
