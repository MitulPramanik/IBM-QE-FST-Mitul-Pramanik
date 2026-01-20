package Activities;

public class car{
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    
    public void displayCharacteristics(){
        System.out.println("The  color of the car is :" + color);
        System.out.println("The value of transmission:" + transmission);
        System.out.println("The value of make:" + make);
        System.out.println("The tyres of car is :" + tyres);
        System.out.println("The no. of doors is  :" + doors);
    }
    public void accelerate(){
        System.out.println("Car is moving forward");
    }

    public void brake(){
        System.out.println("Car Has Stopped");
    }
}



