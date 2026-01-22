package com;
import java.util.*;
interface Interface{
    public void method1();
    public void method2();
}

class demo implements Interface {

    int age;
    String name;
    demo(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void method1(){
        System.out.println("implementation of method1" + name);
    }

    public void method2(){
        System.out.println("implementation of method1" + age);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        int age = scn.nextInt();
        Interface obj = new demo(name, age);
        obj.method1();
        obj.method2();
    }
}
