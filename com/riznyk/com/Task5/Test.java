package com.riznyk.com.Task5;

public class Test {
    public static void main(String[] args) {
        MyHashMap<Integer,String> myHashMap = new MyHashMap<>();
    myHashMap.put(1,"Vlad");
    myHashMap.put(2,"Tola");
    myHashMap.put(3,"Luda");
        System.out.println(myHashMap);
        System.out.println(myHashMap.get(2));
        System.out.println(myHashMap.remove(1));
        System.out.println(myHashMap);
        myHashMap.clear();
        System.out.println(myHashMap);


    }
}
