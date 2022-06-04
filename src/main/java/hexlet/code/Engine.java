package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetings;
import static hexlet.code.games.Calculator.*;
import static hexlet.code.games.Even.*;

public class Engine {

    private static String userName;
    public static void setGamerName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scan.nextLine();
        System.out.printf("Hello, %s\n", userName);
    }

    public static String getGamerName() {
        return userName;
    }
    public static boolean startGame(String gameMessage, int question, String answer) {
        System.out.println(gameMessage);
        String s = String.format("Question: %d", question);
        System.out.println(s);
        Scanner userAnswer = new Scanner(System.in);
        String answerUser = userAnswer.nextLine();
        System.out.printf("Your answer: %s \n", answerUser);
        if (answerUser.equals(answer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.printf("Let's try again, %s!\n", getGamerName());
            return false;
        }
    }
}
