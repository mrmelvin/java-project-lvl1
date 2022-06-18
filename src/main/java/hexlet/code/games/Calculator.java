package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    private static final int MIN_GENERATOR_NUMBER = 1;
    private static final int MAX_GENERATOR_NUMBER = 50;
    private static final String DESCRIPTION_GAME_MESSAGE = "What is the result of the expression?";
    private static final char[] OPERATIONS = {'+', '-', '*'};

    public static char generateRandomOperators() {
        return OPERATIONS[Utils.generateRandomNumber(0, OPERATIONS.length - 1)];
    }

    public static int calculate(char operator, int firstIntNumber, int secondIntNumber) {
        int answer = 0;
        switch (operator) {
            case '+':
                answer = firstIntNumber + secondIntNumber;
                break;
            case '-':
                answer = firstIntNumber - secondIntNumber;
                break;
            case '*':
                answer = firstIntNumber * secondIntNumber;
                break;
            default:
                System.out.printf("Current operators %s don't support\n", operator);
        }
        return answer;
    }

    public static void startGame() {
        int indexQuestion = 0;
        int indexAnswer = 1;
        String[][] roundData = new String[Engine.TOTAL_ROUNDS][indexAnswer + 1];
        int[] firstNumbers = new int[Engine.TOTAL_ROUNDS];
        int[] secondNumbers = new int[Engine.TOTAL_ROUNDS];
        for (int round = 0; round < Engine.TOTAL_ROUNDS; round++) {
            firstNumbers[round] = Utils.generateRandomNumber(MIN_GENERATOR_NUMBER, MAX_GENERATOR_NUMBER);
            secondNumbers[round] = Utils.generateRandomNumber(MIN_GENERATOR_NUMBER, MAX_GENERATOR_NUMBER);
            char currentOperators = generateRandomOperators();
            roundData[round][indexQuestion] = String.format("%d %c %d",
                    firstNumbers[round],
                    currentOperators,
                    secondNumbers[round]);
            roundData[round][indexAnswer] = Integer.toString(calculate(currentOperators, firstNumbers[round], secondNumbers[round]));
        }
        Engine.startGame(DESCRIPTION_GAME_MESSAGE, roundData);
    }
}
