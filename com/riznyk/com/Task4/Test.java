package com.riznyk.com.Task4;

public class Test {
    public static void main(String[] args) {
        Mystack<Integer> mystack = new Mystack<>();
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        mystack.push(5);
        mystack.push(6);
        System.out.println("All elements myStack: " + mystack);
        mystack.remove(2);
        System.out.println("Remove element : " + mystack);
        System.out.println("First element mystack:  " + mystack.peek());
        System.out.println("mystack = " + mystack);
        mystack.pop();
        System.out.println("mystack.pop() = " + mystack);
        System.out.println("mystack.size() = " + mystack.size());
        System.out.println("Before remove all elements:" + mystack);
        System.out.println("After remove all elements: " + mystack);
        mystack.clear();

    }
}
