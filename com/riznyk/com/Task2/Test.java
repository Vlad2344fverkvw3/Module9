package com.riznyk.com.Task2;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        MyLInkedList<Integer> myLInkedList = new MyLInkedList<>();
        myLInkedList.add(12);
        myLInkedList.add(56);
        myLInkedList.add(37);
        System.out.println(" Input value: " + myLInkedList);
        myLInkedList.remove(2);
        System.out.println("Out put value after deletes 2 value by index : " + myLInkedList);
        System.out.println("Get size All value in myLinkedList: " + myLInkedList.size());
        System.out.println("get value by index in myLinkedList: " + myLInkedList.get(1));
        System.out.println("Output all value before clear by myLinkedList: " + myLInkedList);
        myLInkedList.clear();
        System.out.println("Output all value after clear by myLinkedList:" + myLInkedList);

    }
}
