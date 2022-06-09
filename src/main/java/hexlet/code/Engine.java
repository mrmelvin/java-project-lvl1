package hexlet.code;

import java.util.Scanner;

public class Engine {

    static final int TOTAL_ROUNDS = 3;
    private static int currentWinRounds = 0;
    static final int WIN_ROUNDS = 3;


    public static void startGame(String gameMessage, String[] questions, String[] answers) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scan.nextLine();
        System.out.println("Hello, " + userName);

        System.out.println(gameMessage);
        for (int step = 0; step < TOTAL_ROUNDS; step++) {
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
        if (currentWinRounds == WIN_ROUNDS) {
            System.out.printf("Congratulations, %s!\n", userName);
        }
    }
}
