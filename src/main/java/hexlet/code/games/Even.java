package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateRandomNumber;

public class Even {
    static final int TOTAL_ROUNDS = 3;
    private static final int MIN_GENERATOR_NUMBER = 0;
    private static final int MAX_GENERATOR_NUMBER = 100;
    public static void startGame() {
        String evenMessage = "Answer 'yes' if number even otherwise answer 'no'.";
        int indexQuestion = 0;
        int indexAnswer = 1;
        String[][] roundData = new String[TOTAL_ROUNDS][indexAnswer + 1];
        for (int round = 0; round < TOTAL_ROUNDS; round++) {
            int currentNumber = generateRandomNumber(MIN_GENERATOR_NUMBER, MAX_GENERATOR_NUMBER);
            roundData[round][indexQuestion] = Integer.toString(currentNumber);
            roundData[round][indexAnswer] = (currentNumber % 2 == 0) ? "yes" : "no";
        }
        Engine.startGame(evenMessage, roundData);
    }
}
