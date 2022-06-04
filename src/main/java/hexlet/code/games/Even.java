package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import static hexlet.code.Engine.*;
import static hexlet.code.MathSupport.generateRandomNumber;

public class Even {
    private static int totalRounds = 3;
    private static int currentWinRounds = 0;
    private static int winRounds = 3;
    public static void evenGame() {
        // Currently work solution
        Engine.setGamerName();
        String evenMessage = "Answer 'yes' if number even otherwise answer 'no'.";
        for (int step = 0; step < totalRounds; step++) {
            int number = generateRandomNumber(100);
            String parity = (number % 2 == 0) ? "yes" : "no";
            if (Engine.startGame(evenMessage, number, parity)) {
                currentWinRounds++;
            }
            else {
                System.out.printf("Let's try again, %s!", getGamerName());
                break;
            }
        }
        if (currentWinRounds == winRounds) {
            System.out.printf("Congratulations, %s!", getGamerName());
        }
    }
}

//        int rounds = 0;
//        int totalRounds = 3;
//        int rightAnswers = 0;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
//        String userName = scan.nextLine();
//        System.out.print("Hello, " + userName + "\n");
//        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
//        while (rounds < totalRounds) {
//            int number = generateRandomNumber(100);
//            String s = String.format("Question: %d", number);
//            System.out.println(s);
//            Scanner scanNumber = new Scanner(System.in);
//            String answer = scanNumber.nextLine();
//            System.out.printf("Your answer: %s \n", answer);
//            if (number % 2 == 0 & answer.equals("yes")) {
//                System.out.println("Correct!");
//                rightAnswers++;
//            } else if (number % 2 == 0 & answer.equals("no")) {
//                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
//                break;
//            } else if (number % 2 == 1 & answer.equals("yes")) {
//                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
//                break;
//            } else if (number % 2 == 1 & answer.equals("no")) {
//                System.out.println("Correct!");
//                rightAnswers++;
//            }
//            else {
//                System.out.println("Please, type 'yes' or 'no'!");
//                break;
//            }
//            rounds++;
//        }
//        if (rightAnswers == 3) {
//            System.out.printf("Congratulations, %s!\n", userName);
//        }
//        else {
//            System.out.printf("Let's try again, %s!\n", userName);
//        }
//        scan.close();


