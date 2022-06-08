package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.MathSupport.generateRandomNumber;
import static hexlet.code.MathSupport.gcd;

public class GCD {
    private static int totalRounds = 3;
    private static int maxInteger = 100;
    public static void gcdGame() {
        String calculationMessage = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[totalRounds];
        String[] answers = new String[totalRounds];
        for (int i = 0; i < totalRounds; i++) {
            int firstInt = generateRandomNumber(maxInteger);
            int secondInt = generateRandomNumber(maxInteger);
            questions[i] = String.format("%d %d", firstInt, secondInt);
            answers[i] = Integer.toString(gcd(firstInt, secondInt));
        }
        Engine.startGame(calculationMessage, questions, answers);
    }
}
