package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.MathSupport.generateRandomNumber;
import static hexlet.code.MathSupport.isNumberPrime;

public class Prime {
    private static int totalRounds = 3;
    private static int maxInteger = 100;
    public static void primeGame() {
        String primeMessage = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] numbers = new String[totalRounds];
        String[] primed = new String[totalRounds];
        for (int i = 0; i < totalRounds; i++) {
            int number = generateRandomNumber(maxInteger);
            numbers[i] = Integer.toString(number);
            primed[i] = isNumberPrime(number) ? "yes" : "no";
        }
        Engine.startGame(primeMessage, numbers, primed);
    }
}
