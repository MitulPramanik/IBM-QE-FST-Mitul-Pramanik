package com;
import java.util.*;

public class RandomClass {
    public static void main(String[] args){
        Random randomno = new Random();
        System.out.println("Next int value: " + randomno.nextInt());
        System.out.println("Next float value: " + randomno.nextFloat(2));
        System.out.println("Next Boolean value: " + randomno.nextBoolean());
    }    
}
