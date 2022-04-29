package practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int roundNumber = 0, computerScore = 0, userScore = 0;

        System.out.println("Welcome to Java based Rocke Paper Scissors!");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");

        do {
            roundNumber++;

            int computerChoice = r.nextInt(3) + 1;

            int userChoice;
            do {
                System.out.print("Enter your choice: ");
                userChoice = sc.nextInt();

                if (userChoice < 1 || userChoice > 3) {
                    System.out.println("Invalid input, please try again...");
                }
            } while (userChoice < 1 || userChoice > 3);

            switch (computerChoice) {
                case 1:
                    System.out.println("Computer chooses Rock");
                    break;
                case 2:
                    System.out.println("Computer chooses Paper");
                    break;
                case 3:
                    System.out.println("Computer chooses Scissors");
                    break;
            }

            switch (userChoice) {
                case 1:
                    switch (computerChoice) {
                        case 1:
                            System.out.println("Draw");
                            break;
                        case 2:
                            System.out.println("Computer wins this round!");
                            computerScore++;
                            break;
                        case 3:
                            System.out.println("User wins this round!");
                            userScore++;
                            break;
                    }
                    break;
                case 2:
                    switch (computerChoice) {
                        case 1:
                            System.out.println("User wins this round!");
                            userScore++;
                            break;
                        case 2:
                            System.out.println("Draw");
                            break;
                        case 3:
                            System.out.println("Computer wins this round!");
                            computerScore++;
                            break;
                    }
                    break;
                case 3:
                    switch (computerChoice) {
                        case 1:
                            System.out.println("Computer wins this round!");
                            computerScore++;
                            break;
                        case 2:
                            System.out.println("User wins this round!");
                            userScore++;
                            break;
                        case 3:
                            System.out.println("Draw");
                            break;
                    }
            }

            System.out.println("Score after round " + roundNumber + ":");
            System.out.println("User: " + userScore + " Computer: " + computerScore);

        } while (computerScore != 5 && userScore != 5);

        if (userScore == 5) {
            System.out.println("You won!");
        } else {
            System.out.println("Computer won!");
        }
    }
}
