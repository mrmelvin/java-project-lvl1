package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.generateRandomNumber;

public class Prime {

    private static final int MIN_GENERATOR_NUMBER = 0;
    private static final int MAX_GENERATOR_NUMBER = 100;
    private static final String DESCRIPTION_GAME_MESSAGE =
            "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean isNumberPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void startGame() {
        int indexQuestion = 0;
        int indexAnswer = 1;
        String[][] roundData = new String[Engine.TOTAL_ROUNDS][indexAnswer + 1];
        for (int round = 0; round < Engine.TOTAL_ROUNDS; round++) {
            int number = generateRandomNumber(MIN_GENERATOR_NUMBER, MAX_GENERATOR_NUMBER);
            roundData[round][indexQuestion] = Integer.toString(number);
            roundData[round][indexAnswer] = isNumberPrime(number) ? "yes" : "no";
        }
        Engine.startGame(DESCRIPTION_GAME_MESSAGE, roundData);
    }
}
