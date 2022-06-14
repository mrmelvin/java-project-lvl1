package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.MathSupport.generateRandomNumber;
import static hexlet.code.MathSupport.gcd;

public class GCD {
    static final int TOTAL_ROUNDS = 3;
    static final int MAX_INTEGER = 100;
    public static void startGame() {
        int indexQuestion = 0;
        int indexAnswer = 1;
        String[][] roundData = new String[TOTAL_ROUNDS][indexAnswer+1];
        String calculationMessage = "Find the greatest common divisor of given numbers.";
        for (int round = 0; round < TOTAL_ROUNDS; round++) {
            int firstInt = generateRandomNumber(MAX_INTEGER);
            int secondInt = generateRandomNumber(MAX_INTEGER);
            roundData[round][indexQuestion] = String.format("%d %d", firstInt, secondInt);
            roundData[round][indexAnswer] = Integer.toString(gcd(firstInt, secondInt));
        }
        Engine.startGame(calculationMessage, roundData);
    }
}
