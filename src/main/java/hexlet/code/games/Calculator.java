package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.MathSupport.generateRandomNumber;
import static hexlet.code.MathSupport.generateRandomOperators;

public class Calculator {
    static final int TOTAL_ROUNDS = 3;
    static final int MAX_INTEGER = 100;
    public static void startGame() {
        int indexQuestion = 0;
        int indexAnswer = 1;
        String[][] roundData = new String[TOTAL_ROUNDS][indexAnswer + 1];
        int[] firstNumbers = new int[TOTAL_ROUNDS];
        int[] secondNumbers = new int[TOTAL_ROUNDS];
        String calculationMessage = "What is the result of the expression?";
        for (int round = 0; round < TOTAL_ROUNDS; round++) {
            firstNumbers[round] = generateRandomNumber(MAX_INTEGER);
            secondNumbers[round] = generateRandomNumber(MAX_INTEGER);
            char currentOperators = generateRandomOperators();
            roundData[round][indexQuestion] = String.format("%d %c %d",
                    firstNumbers[round],
                    currentOperators,
                    secondNumbers[round]);
            if (currentOperators == '+') {
                roundData[round][indexAnswer] = Integer.toString(firstNumbers[round] + secondNumbers[round]);
            } else if (currentOperators == '-') {
                roundData[round][indexAnswer] = Integer.toString(firstNumbers[round] - secondNumbers[round]);
            } else {
                roundData[round][indexAnswer] = Integer.toString(firstNumbers[round] * secondNumbers[round]);
            }
        }
        Engine.startGame(calculationMessage, roundData);
    }
}
