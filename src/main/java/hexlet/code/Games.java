package hexlet.code;

import java.util.Scanner;
import static hexlet.code.MathSupport.generateRandomNumber;

public class Games {
    public static void even() {
        // Currently work solution
        int rounds = 0;
        int totalRounds = 3;
        int rightAnswers = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scan.nextLine();
        System.out.print("Hello, " + userName + "\n");
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        while (rounds < totalRounds) {
            int number = generateRandomNumber();
            String s = String.format("Question: %d", number);
            System.out.println(s);
            Scanner scanNumber = new Scanner(System.in);
            String answer = scanNumber.nextLine();
            System.out.printf("Your answer: %s \n", answer);
            if (number % 2 == 0 & answer.equals("yes")) {
                System.out.println("Correct!");
                rightAnswers++;
            } else if (number % 2 == 0 & answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                break;
            } else if (number % 2 == 1 & answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                break;
            } else if (number % 2 == 1 & answer.equals("no")) {
                System.out.println("Correct!");
                rightAnswers++;
            }
            else {
                System.out.println("Please, type 'yes' or 'no'!");
                break;
            }
            rounds++;
        }
        if (rightAnswers == 3) {
            System.out.printf("Congratulations, %s!\n", userName);
        }
        else {
            System.out.printf("Let's try again, %s!\n", userName);
        }
        scan.close();
    }
}
