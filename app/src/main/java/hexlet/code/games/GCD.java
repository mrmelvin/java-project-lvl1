package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.generateRandomNumber;

public class GCD {
    private static final int MIN_GENERATOR_NUMBER = 1;
    private static final int MAX_GENERATOR_NUMBER = 50;
    private static final String DESCRIPTION_GAME_MESSAGE = "Find the greatest common divisor of given numbers.";

    public static int gcd(int firstPrime, int secondPrime) {
        return secondPrime == 0 ? firstPrime : gcd(secondPrime, firstPrime % secondPrime);
    }

    public static void startGame() {
        int indexQuestion = 0;
        int indexAnswer = 1;
        String[][] roundData = new String[Engine.TOTAL_ROUNDS][indexAnswer + 1];
        for (int round = 0; round < Engine.TOTAL_ROUNDS; round++) {
            int firstInt = generateRandomNumber(MIN_GENERATOR_NUMBER, MAX_GENERATOR_NUMBER);
            int secondInt = generateRandomNumber(MIN_GENERATOR_NUMBER, MAX_GENERATOR_NUMBER);
            roundData[round][indexQuestion] = String.format("%d %d", firstInt, secondInt);
            roundData[round][indexAnswer] = Integer.toString(gcd(firstInt, secondInt));
        }
        Engine.startGame(DESCRIPTION_GAME_MESSAGE, roundData);
    }
}
