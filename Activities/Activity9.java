package com;
import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
        
        ArrayList<String> myList = new ArrayList();

        myList.add("Om");
        myList.add("Prakash");
        myList.add("Abhishek");
        myList.add("Isha");
        myList.add("Ananya");

        myList.add(3, "bhaskar");
        myList.add(1, "mohit");

        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }

        System.out.println("3rd namw in the list is: " + myList.get(2));
        System.out.println("Is Om is in list: " + myList.contains("Om"));
        System.out.println("Size of ArrayList: " + myList.size());

        myList.remove("bhaskar");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}


