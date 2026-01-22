package com;

public class FuncInterfacedemo {
    public static void main(String[] args) {

        FuncInterface obj = (String str) -> {
            return "Got this :" + str;
        };
        
        System.out.println(obj.display("Hello"));
    }
}
