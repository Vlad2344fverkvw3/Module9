package com.riznyk.com.Task3;


import com.riznyk.com.Task2.MyLInkedList;


import java.util.Queue;

public class MyQueue<T> {
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

    public int size() {
        return size;
    }
    public void clear() {
        firstElement = lastElement = null;
        size = 0;
    }
public  Object peek(){
        Node<T> node = firstElement;
        if(firstElement != null){
            return node.element;
        }
        return 0;
}
public T poll(){
        Node<T> node = firstElement;
       T value = null;
       if(node == null){
           return null;
       } else {
           while (node != null) {
               if (node == firstElement) {
                   value = node.element;
                   node = node.next;
                   firstElement = node;
               }
               node = node.next;
           }
       }
        size--;
        return value;
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

