package com;
class encapsulation{
    private int ssn;
    private String empname;
    private int empno;

    public int getssn(){
        return ssn;
    }
    public String empname(){
        return empname;
    }
    public int empno(){
        return empno;
    }
    public void setssn(int newvalue){
        ssn= newvalue;
    }
    public void setempname(String newvalue){
        empname= newvalue;
    }
    public void setnmpno(int newvalue){
        empno= newvalue;
    }
}

public class encapsulationtest {
    public static void main(String[] args) {
        encapsulation obj = new encapsulation();
        obj.setssn(112);
        obj.setempname("Mitul");
        obj.setempno(21);

        System.out.println("Employee Name: " + obj.getempname());
        System.out.println("Employee number: " + obj.getempno());
        System.out.println("Employee ssn: " + obj.getssn());
    }
    
}
