package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateRandomNumber;

public class Even {
    private static final int MIN_GENERATOR_NUMBER = 1;
    private static final int MAX_GENERATOR_NUMBER = 100;

    public static boolean isEven(int number) {
        return number % 2 == 0 ? true : false;
    }

    public static void startGame() {
        final String descriptionGameMessage = "Answer 'yes' if number even otherwise answer 'no'.";
        int indexQuestion = 0;
        int indexAnswer = 1;
        String[][] roundData = new String[Engine.TOTAL_ROUNDS][indexAnswer + 1];
        for (int round = 0; round < Engine.TOTAL_ROUNDS; round++) {
            int currentNumber = generateRandomNumber(MIN_GENERATOR_NUMBER, MAX_GENERATOR_NUMBER);
            roundData[round][indexQuestion] = Integer.toString(currentNumber);
            roundData[round][indexAnswer] = isEven(currentNumber) ? "yes" : "no";
        }
        Engine.startGame(descriptionGameMessage, roundData);
    }
}
