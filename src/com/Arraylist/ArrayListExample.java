package com.Arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        int[] intArray = {20, 10, 5, 4, 7};

        System.out.println("Elements in array are :");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("Sumit");
        list.add("Verma");
        list.remove(1);
        list.add("Krati");

        System.out.println(list);
    }
}
