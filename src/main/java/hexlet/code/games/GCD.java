package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.MathSupport.generateRandomNumber;
import static hexlet.code.MathSupport.gcd;

public class GCD {
    static final int TOTAL_ROUNDS = 3;
    static final int MAX_INTEGER = 100;
    public static void gcdGame() {
        String calculationMessage = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[TOTAL_ROUNDS];
        String[] answers = new String[TOTAL_ROUNDS];
        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int firstInt = generateRandomNumber(MAX_INTEGER);
            int secondInt = generateRandomNumber(MAX_INTEGER);
            questions[i] = String.format("%d %d", firstInt, secondInt);
            answers[i] = Integer.toString(gcd(firstInt, secondInt));
        }
        Engine.startGame(calculationMessage, questions, answers);
    }
}
