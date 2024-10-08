import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean playAgain;
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;

        System.out.println("Welcome to the Guess the Number Game!");
        int totalRounds = 0;
        int roundsWon = 0;
        do {
            totalRounds++;  // Increment the round number
            System.out.println("\nRound " + totalRounds);

            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean wonRound = false;

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + " - Guess the number (" + minRange + "-" + maxRange + "): ");
                int userGuess = scanner.nextInt();
                attempts++;

            
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    wonRound = true;
                    roundsWon++;
                    break;  
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

           
            if (!wonRound) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess + ".");
            }

            
            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");

        } while (playAgain);  


        System.out.println("\nGame over! You won " + roundsWon + " out of " + totalRounds + " rounds.");
        
        scanner.close();
    }
}