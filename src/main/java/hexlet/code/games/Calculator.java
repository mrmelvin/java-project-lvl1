package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.MathSupport.generateRandomNumber;
import static hexlet.code.MathSupport.generateRandomOperators;

public class Calculator {
    static final int TOTAL_ROUNDS = 3;
    static final int MAX_INTEGER = 100;
    public static void calculatorGame() {
        int[] firstNumbers = new int[TOTAL_ROUNDS];
        int[] secondNumbers = new int[TOTAL_ROUNDS];
        String[] operations = new String[TOTAL_ROUNDS];
        String[] answers = new String[TOTAL_ROUNDS];
        String calculationMessage = "What is the result of the expression?";
        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            firstNumbers[i] = generateRandomNumber(MAX_INTEGER);
            secondNumbers[i] = generateRandomNumber(MAX_INTEGER);
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
