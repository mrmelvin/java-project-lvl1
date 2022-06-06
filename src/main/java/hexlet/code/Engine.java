package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.*;
import static hexlet.code.games.Calculator.*;
import static hexlet.code.games.Even.*;

public class Engine {

    private static int totalRounds = 3;
    private static int currentWinRounds = 0;
    private static int winRounds = 3;


    public static void startGame(String gameMessage, String[] questions, String[] answers) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scan.nextLine();
        System.out.print("Hello, " + userName + "\n");

        System.out.println(gameMessage);
        for (int step = 0; step < totalRounds; step++) {
            String s = String.format("Question: %s", questions[step]);
            System.out.println(s);
            Scanner sc = new Scanner(System.in);
            String gamerAnswer = sc.nextLine();
            System.out.printf("Your answer: %s\n", gamerAnswer);
            if (gamerAnswer.equals(answers[step])) {
                System.out.println("Correct!");
                currentWinRounds++;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'\n", gamerAnswer, answers[step]);
                System.out.printf("Let's try again, %s!\n", userName);
                break;
            }
        }
        if (currentWinRounds == winRounds) {
            System.out.printf("Congratulations, %s!\n", userName);
        }
    }
}
