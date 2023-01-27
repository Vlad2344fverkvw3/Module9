package com.riznyk.com.Task1;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();

      myArrayList.add("Oleg");
      myArrayList.add("Ivan");
      myArrayList.add("Vlad");
      myArrayList.add("Alisa");

        System.out.println(" Input value: " + myArrayList);
        myArrayList.remove(2);
        System.out.println("Out put value after deletes 2 value by index : " + myArrayList);
        System.out.println("Get size All value in myArrayList: " + myArrayList.size());
        System.out.println("get value by index in myArrayList: " + myArrayList.get(2));
        System.out.println("Output all value before clear by myArrayList: " + myArrayList);
        myArrayList.clear();
        System.out.println("Output all value after clear by myArrayList:" + myArrayList);

    }
}
