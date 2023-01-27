package com.riznyk.com.Task3;

public class Test {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("Ivanov");
        myQueue.add("Karpov");
        myQueue.add("Strelkov");
        myQueue.add("Reznik");
        myQueue.add("Kononenko");
        System.out.println("OutPut all elements MyQueue: " + myQueue);
        System.out.println("Size MyQueue: " + myQueue.size());
        System.out.println("Return first element : " + myQueue.peek());
        System.out.println("Remove first element : " + myQueue.poll());
        System.out.print("Clear MyQueue: ");
        System.out.println(myQueue);
        myQueue.clear();
        System.out.println("After clear: " + myQueue);


    }
}
