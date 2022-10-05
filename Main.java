import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        String[] choices = {"rock", "paper", "scissors", "lizard", "spock"};
        boolean gameOver = false;
        String uChoice;
        String cChoice;

        while(!gameOver) {
            // Ask for player choice
            System.out.println("Player's turn: ");
            uChoice = userChoice(choices);

            // Obtain computer choice
            System.out.println("Computer's turn: ");
            cChoice = computerChoice(choices);

            // Check for winner
            // System.out.println(userChoice);
            // System.out.println(computerChoice);
        }
    }

    public static String userChoice(String[] choices) {
        Scanner sc = new Scanner(System.in);
        String choice;
        
        while (true) {
            // Prompt the player to choose
            System.out.println("Choose Rock, Paper, Scissors, Lizard, or Spock: ");
            choice = sc.nextLine();

            // Check for valid selection
            for (int i = 0; i < choices.length; i++) {
                System.out.println(choice);
                System.out.println(choices[i].toLowerCase());
                if (choice.toLowerCase().equals(choices[i])) {
                    return choice;
                }
            }

            // Report invalid choices
            System.out.println("Invalid choice.");
        }
        
    }

    public static String computerChoice(String[] choices) {
        // Computer makes a random choice
        return choices[(int) Math.random() * 5];
    }

    public static String checkWinner(String uChoice, String cChoice) {
        
    }
}