package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
import static hexlet.code.MathSupport.*;

public class GCD {
    private static int totalRounds = 3;
    public static void GCDGame() {
        String calculationMessage = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[totalRounds];
        String[] answers = new String[totalRounds];
        for (int i = 0; i < totalRounds; i++) {
            int firstInt = generateRandomNumber(100);
            int secondInt = generateRandomNumber(100);
            questions[i] = String.format("%d %d", firstInt, secondInt);
            answers[i] = Integer.toString(gcd(firstInt, secondInt));
        }
        Engine.startGame(calculationMessage, questions, answers);
    }
}
