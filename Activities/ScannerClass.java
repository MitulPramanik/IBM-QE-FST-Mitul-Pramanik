package com;
import java.util.*;
public class ScannerClass {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name:");
        String username = myObj.nextLine();
        System.out.println("Your name is :" + username);
    }
    

}
