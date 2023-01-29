package com.riznyk.com.Task2;


import java.util.Objects;

public class MyLInkedList<T> {
    private Node<T> firstElement;
    private  Node<T> lastElement;
    private int size;

      private  class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
            next = null;
        }

    }


    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        lastElement = firstElement;
        if (firstElement == null) {
            firstElement = newNode;
        } else {
            while (lastElement.next != null){
                lastElement = lastElement.next;
            }

            lastElement.next = newNode;
        size++;
        }
    }

    public T get(int index) {
        Objects.checkIndex(index, size);
        return addMethod(index).element;
    }


    public int size() {
        return size;
    }

    public Object remove(int index) {
         Node<T> node = firstElement;
        Node<T> newNode = null;
        T rremElement = null;
        int counter = 0;
        while (node != null) {
            if (index == counter) {
                if (node == firstElement) {
                    rremElement = node.element;
                    node = node.next;
                    firstElement = node;
                } else {
                    newNode.next = node.next;
                    rremElement = node.element;
                }
            }
            newNode = node;
            node = node.next;
            counter++;
        }
        counter--;
        return rremElement;
    }

    public void clear() {
        firstElement = lastElement = null;
        size = 0;
    }


    private Node<T> addMethod(int index) {
        Node<T> line = firstElement;
        for (int i = 0; i < index; i++) {
            line = line.next;
        }
        return line;
    }


    @Override
    public String toString() {
        StringBuilder write = new StringBuilder();
        Node<T> node = firstElement;
        if (node == null) {
            write.append(" null");
        } else while (node != null) {
            write.append(node.element).append(" ");
            node = node.next;
        }
        return write.toString();
    }
}
