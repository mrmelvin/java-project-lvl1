package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int TOTAL_ROUNDS = 3;
    public static void startGame(String gameMessage, String[][] roundData) {
        int indexQuestion = 0;
        int indexAnswer = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = sc.nextLine();
        System.out.printf("Hello, %s!\n", userName);
        System.out.println(gameMessage);
        for (int round = 0; round < TOTAL_ROUNDS; round++) {
            String s = String.format("Question: %s", roundData[round][indexQuestion]);
            System.out.println(s);
            String gamerAnswer = sc.nextLine();
            System.out.printf("Your answer: %s\n", gamerAnswer);
            if (gamerAnswer.equals(roundData[round][1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'\n",
                        gamerAnswer,
                        roundData[round][indexAnswer]);
                System.out.printf("Let's try again, %s!\n", userName);
                return;
            }
        }
        sc.close();
        System.out.printf("Congratulations, %s!\n", userName);
    }
}
