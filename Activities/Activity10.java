package com;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args) {
        Set<Object> hs = new HashSet<>();

        hs.add("Pen");
        hs.add("Pencil");
        hs.add("Paper");
        hs.add("Scale");
        hs.add("copy");
        hs.add("Compass");

        System.out.println("The set has " + hs.size() + " elements");
        if (hs.remove("Paper")) {
            System.out.println("Paper is removed");
        }
        System.out.println("The set has " + hs.size() + " elements");
        if (hs.remove("Protector")) {
            System.out.println("Protector is removed");
        }else{
            System.out.println("No Elements");
        }

        System.out.println("Checking if Paper is present: " + hs.contains("Paper"));
        System.out.println("Updated Set " + hs);
    }
}
