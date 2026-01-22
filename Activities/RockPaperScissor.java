package com;
import java.util.*;

public class RockPaperScissor {   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        while (playAgain) {
            try {
                System.out.print("Enter your choice (rock / paper / scissors): ");
                String player1 = sc.nextLine().toLowerCase();

                if (!player1.equals("rock") && !player1.equals("paper") && !player1.equals("scissors")) {
                    throw new IllegalArgumentException("Invalid choice");
                }

                String[] choices = {"rock", "paper", "scissors"};
                String computer = choices[rand.nextInt(3)];

                System.out.println("Computer chose: " + computer);

                if (player1.equals(computer)) {
                    System.out.println("It's a tie!");
                } else if (
                        (player1.equals("rock") && computer.equals("scissors")) ||
                        (player1.equals("paper") && computer.equals("rock")) ||
                        (player1.equals("scissors") && computer.equals("paper"))
                ) {
                    System.out.println("Player1 wins!");
                } else {
                    System.out.println("Computer wins!");
                }

            } catch (Exception e) {
                System.out.println("Error: Please enter only rock, paper, or scissors.");
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String choice = sc.nextLine().toLowerCase();

            if (!choice.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Game Over!");
        sc.close();
    }
    
}
