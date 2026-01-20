package Activities;

public class Activities1 {
    public static void main(String[] args){
        car carname = new car();

        carname.make = 2014;
        carname.color= "Black";
        carname.transmission = "Manual";

        carname.displayCharacteristics();
        carname.accelerate();
        carname.brake();

    }
}
