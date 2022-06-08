package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.MathSupport.generateRandomNumber;
import static hexlet.code.MathSupport.generateRandomOperators;

public class Calculator {
    private static int totalRounds = 3;
    private static int maxInteger = 100;
    public static void calculatorGame() {
        int[] firstNumbers = new int[totalRounds];
        int[] secondNumbers = new int[totalRounds];
        String[] operations = new String[totalRounds];
        String[] answers = new String[totalRounds];
        String calculationMessage = "What is the result of the expression?";
        for (int i = 0; i < totalRounds; i++) {
            firstNumbers[i] = generateRandomNumber(maxInteger);
            secondNumbers[i] = generateRandomNumber(maxInteger);
            char currentOperators = generateRandomOperators();
            operations[i] = String.format("%d %c %d", firstNumbers[i], currentOperators, secondNumbers[i]);
            if (currentOperators == '+') {
                answers[i] = Integer.toString(firstNumbers[i] + secondNumbers[i]);
            } else if (currentOperators == '-') {
                answers[i] = Integer.toString(firstNumbers[i] - secondNumbers[i]);
            } else {
                answers[i] = Integer.toString(firstNumbers[i] * secondNumbers[i]);
            }
        }
        Engine.startGame(calculationMessage, operations, answers);
    }
}
