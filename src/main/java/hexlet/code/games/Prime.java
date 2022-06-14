package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.MathSupport.generateRandomNumber;
import static hexlet.code.MathSupport.isNumberPrime;

public class Prime {
    static final int TOTAL_ROUNDS = 3;
    static final int MAX_INTEGER = 100;
    public static void startGame() {
        String primeMessage = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int indexQuestion = 0;
        int indexAnswer = 1;
        String[][] roundData = new String[TOTAL_ROUNDS][indexAnswer+1];
        for (int round = 0; round < TOTAL_ROUNDS; round++) {
            int number = generateRandomNumber(MAX_INTEGER);
            roundData[round][indexQuestion] = Integer.toString(number);
            roundData[round][indexAnswer] = isNumberPrime(number) ? "yes" : "no";
        }
        Engine.startGame(primeMessage, roundData);
    }
}
