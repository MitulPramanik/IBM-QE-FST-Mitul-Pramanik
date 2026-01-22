import java.util.*;
class student{
    String name;
    int age;
    int mark;
    student(String name,  int age, int mark){
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    String display(){
        return "Name, Age  and marks is : " + " " + age + " " + mark;
    }
   
}
public class Marks {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = scn.nextLine();
        System.out.println("Enter your age:");
        int age = scn.nextInt();
        System.out.println("Enter your marks:");
        int mark = scn.nextInt();
        student s1 = new student(name, age, mark);
        
        //s1.display();
        System.out.println(s1.display());
    }
}
