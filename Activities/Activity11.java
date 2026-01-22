package com;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
         Map<String, Integer> colors = new HashMap<>();

        colors.put("Red", 1);
        colors.put("Green", 2);
        colors.put("Orange",3);
        colors.put("Pink",4);
        colors.put("Purple",5);
        System.out.println("Map: " + colors);

        System.out.println("Keys: " + colors.keySet());

        System.out.println("Values: " + colors.values());

        System.out.println("Entries: " + colors.entrySet());

        int value = colors.remove("Green");
        System.out.println("Removed Value: " + value);

        if(colors.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }

        System.out.println("Number of pairs in the Map is: " + colors.size());

    }
}
