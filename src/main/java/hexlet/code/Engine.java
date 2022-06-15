package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int TOTAL_ROUNDS = 3;
    private static int currentWinRounds = 0;

    public static void startGame(String gameMessage, String[][] roundData) {
        int indexQuestion = 0;
        int indexAnswer = 1;
        Scanner scanName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scanName.nextLine();
        System.out.printf("Hello, %s!\n", userName);
        System.out.println(gameMessage);
        Scanner sc = new Scanner(System.in);
        for (int round = 0; round < TOTAL_ROUNDS; round++) {
            String s = String.format("Question: %s", roundData[round][indexQuestion]);
            System.out.println(s);
            String gamerAnswer = sc.nextLine();
            System.out.printf("Your answer: %s\n", gamerAnswer);
            if (gamerAnswer.equals(roundData[round][1])) {
                System.out.println("Correct!");
                currentWinRounds++;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'\n",
                        gamerAnswer,
                        roundData[round][indexAnswer]);
                System.out.printf("Let's try again, %s!\n", userName);
                break;
            }
        }
        sc.close();
        if (TOTAL_ROUNDS == currentWinRounds) {
            System.out.printf("Congratulations, %s!\n", userName);
        }
    }
}
