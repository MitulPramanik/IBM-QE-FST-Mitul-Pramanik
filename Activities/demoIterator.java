package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class demoIterator {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<String>();
        listStrings.add("One");
        listStrings.add("Two");
        listStrings.add("Three");
        Iterator<String> iterator = listStrings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //set

        Set<String> names = new HashSet<>();

        names.add("Tom");
        names.add("Mary");
        names.add("Peter");
        names.add("Alice");
        Iterator<String> iterator1 = names.iterator();

        while (iterator1.hasNext()) {
            String name = iterator1.next();
            System.out.println(name);
        }
    }
}
