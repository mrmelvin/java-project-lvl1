package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    private static final int MIN_GENERATOR_NUMBER = 0;
    private static final int MAX_GENERATOR_NUMBER = 50;

    public static char generateRandomOperators() {
        char[] operations = {'+', '-', '*'};
        return operations[Utils.generateRandomNumber(0, operations.length - 1)];
    }

    public static void startGame() {
        int indexQuestion = 0;
        int indexAnswer = 1;
        String[][] roundData = new String[Engine.TOTAL_ROUNDS][indexAnswer + 1];
        int[] firstNumbers = new int[Engine.TOTAL_ROUNDS];
        int[] secondNumbers = new int[Engine.TOTAL_ROUNDS];
        String descriptionGameMessage = "What is the result of the expression?";
        for (int round = 0; round < Engine.TOTAL_ROUNDS; round++) {
            firstNumbers[round] = Utils.generateRandomNumber(MIN_GENERATOR_NUMBER, MAX_GENERATOR_NUMBER);
            secondNumbers[round] = Utils.generateRandomNumber(MIN_GENERATOR_NUMBER, MAX_GENERATOR_NUMBER);
            char currentOperators = generateRandomOperators();
            roundData[round][indexQuestion] = String.format("%d %c %d",
                    firstNumbers[round],
                    currentOperators,
                    secondNumbers[round]);
            switch (currentOperators) {
                case '+':
                    roundData[round][indexAnswer] = Integer.toString(firstNumbers[round] + secondNumbers[round]);
                    break;
                case '-':
                    roundData[round][indexAnswer] = Integer.toString(firstNumbers[round] - secondNumbers[round]);
                    break;
                case '*':
                    roundData[round][indexAnswer] = Integer.toString(firstNumbers[round] * secondNumbers[round]);
                    break;
                default:
                    System.out.printf("Current operators %s don't support\n", currentOperators);
            }
        }
        Engine.startGame(descriptionGameMessage, roundData);
    }
}
