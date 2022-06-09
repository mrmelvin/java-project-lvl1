package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.MathSupport.generateRandomNumber;
import static hexlet.code.MathSupport.isNumberPrime;

public class Prime {
    static final int TOTAL_ROUNDS = 3;
    static final int MAX_INTEGER = 100;
    public static void primeGame() {
        String primeMessage = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] numbers = new String[TOTAL_ROUNDS];
        String[] primed = new String[TOTAL_ROUNDS];
        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int number = generateRandomNumber(MAX_INTEGER);
            numbers[i] = Integer.toString(number);
            primed[i] = isNumberPrime(number) ? "yes" : "no";
        }
        Engine.startGame(primeMessage, numbers, primed);
    }
}
