package com.riznyk.com.Task5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class MyHashMap<K, V> {
    //----------------------------
 private   class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    //------------------------------
  private   Node<K, V>[] capacity;
   private int index;
   private int length = 0;
   private int size = 10;
   private int count = size*2;

    MyHashMap() {
        capacity = new Node[size];
    }

    @Override
    public boolean equals(Object o) {
        Node<K, V> node = capacity[size];
        if (this == o) {
            return true;
        } else {
            if (o == null) {
                return false;
            }
            MyHashMap<K, V> myHashMap = (MyHashMap<K, V>) o;
            return node.getKey() == myHashMap && node.getValue() == myHashMap;
        }
    }

    @Override
    public int hashCode() {
        return this.hashCode();
    }

    public Object remove(K key) {
        Node<K, V> firstRemove = null;
        index = key.hashCode() % size - 1;
        Node<K, V> secondRemove = capacity[index];
        if (secondRemove.getKey().equals(key)) {
            firstRemove = capacity[index];
            capacity[index] = null;
        }
        return firstRemove.getKey() + " = " + firstRemove.getValue();
    }
    public V get(K key) {
        V value = null;
        index = key.hashCode() % size - 1;
        Node<K, V> secondTable = capacity[index];
        while (secondTable != null) {
            if (secondTable.getKey().equals(key)) {
                value = secondTable.getValue();
                secondTable = secondTable.next;
            }
        }
        return value;
    }

    public Node<K, V>[] clear() {
        length = 0;
        return capacity = null;
    }

    public void put(K key, V value) {
        index = key.hashCode() % size - 1;

        if (capacity == null) {
            capacity = new Node[size];
            if (index == -1) {
                index = key.hashCode() % size;
            }
        }
        if (length <= size && index >= 0) {
            Node<K, V> lineFirst = new Node<>(key, value);
            Node<K, V> lineSecond = capacity[index];

            if (capacity[index] == null) {
                capacity[index] = lineFirst;
                length++;
            } else while (lineSecond!= null){
                if(lineSecond.getKey().equals(key)){
                    lineSecond.next = lineFirst;
                    capacity[index] = lineSecond.next;
                    break;
                } else {
                    lineSecond.next = lineFirst;
                    break;
                }
            }
        } else {
            Node<K,V>[] newCapacity = new Node[count];
            for (int i = 0; i < size/2; i++) {
                if(capacity[i] == null){
                    capacity = newCapacity;
                    put(key,value);
                } else{
                    newCapacity[i] = capacity[i];
                }
                capacity = newCapacity;
                put(key, value);
            }
        }

        }

    @Override
    public String toString() {
        StringBuilder write = new StringBuilder();
        if (capacity == null) {
            write.append("{").append("}");
            return write.toString();
        }
        for (int i = 0; i < size; i++) {
            Node<K, V> secondTable = capacity[i];
            if (secondTable != null) {
                write.append(secondTable.getKey()).append(" = ").append(secondTable.getValue()).append(", ");
            }
        }
        write.deleteCharAt(write.lastIndexOf(", "));
        String show = write.toString();
        return show.strip() ;
    }
    }


