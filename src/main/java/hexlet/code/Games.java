package hexlet.code;

import java.util.Scanner;
import static hexlet.code.MathSupport.generateRandomNumber;

public class Games {
    public static void even() {
        // Currently work solution
        int rounds = 0;
        int totalRounds = 3;
        int rightAnswers = 0;
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        while (rounds < totalRounds) {
            int number = generateRandomNumber();
            String s = String.format("Question: %d", number);
            System.out.println(s);
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            System.out.println("Your answer:" + answer + "\n");
            if (number % 2 == 0 & answer.equals("yes")) {
                System.out.println("Correct!");
                rightAnswers++;
            } else if (number % 2 == 0 & answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                break;
            } else if (number % 2 == 1 & answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                break;
            }
            else {
                System.out.println("Correct!");
                rightAnswers++;
            }
            rounds++;
        }
        if (rightAnswers == 3) {
            System.out.println("Congratulations, Sam!");
        }
        else {
            System.out.println("Let's try again, Bill!");
        }
    }
}
