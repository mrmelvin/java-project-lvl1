package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.MathSupport.generateRandomNumber;

public class Even {
    static final int TOTAL_ROUNDS = 3;
    static final int MAX_INTEGER = 100;
    public static void evenGame() {
        // Currently work solution
        String evenMessage = "Answer 'yes' if number even otherwise answer 'no'.";
        String[] numbers = new String[TOTAL_ROUNDS];
        String[] parity = new String[TOTAL_ROUNDS];
        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int currentNumber = generateRandomNumber(MAX_INTEGER);
            numbers[i] = Integer.toString(currentNumber);
            parity[i] = (currentNumber % 2 == 0) ? "yes" : "no";
        }
        Engine.startGame(evenMessage, numbers, parity);
    }
}
