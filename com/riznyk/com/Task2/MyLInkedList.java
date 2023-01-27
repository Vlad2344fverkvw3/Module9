package com.riznyk.com.Task2;


public class MyLInkedList<T> {
    private Node<T> firstElement;
    private Node<T> lastElement;
    private int size;

    static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;

        }

    }


    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (firstElement == null) {
            firstElement = lastElement = newNode;
        } else {
            lastElement.next = newNode;
            lastElement = newNode;
        }
        size++;

    }

    public T get(int index) {

        return addMethod(index).element;
    }

    public int size() {
        return size;
    }

    public T remove(int index) {
        T rremElement;
        if (index == 0) {
            rremElement = firstElement.element;
            firstElement = firstElement.next;
            if (firstElement == null) {
                lastElement = null;
            }
        } else {
            Node<T> rew = addMethod(index - 1);
            rremElement = rew.next.element;
            rew.next = rew.next.next;
            if (index == size - 1) {
                lastElement = rew;
            }
        }
        size--;

        return rremElement;
    }

    public void clear() {
        firstElement = lastElement = null;
        size = 0;
    }

    // add method
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
