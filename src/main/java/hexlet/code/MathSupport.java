package hexlet.code;

public class MathSupport {

    static final int PROGRESSION_LENGTH = 10;
    static final int MAX_INTEGER_VALUE = 50;
    public static int generateRandomNumber(int maximumNumber) {
        return 1 + (int) (Math.random() * maximumNumber);
    }

    public static char generateRandomOperators() {
        char[] operations = {'+', '-', '*'};
        return operations[generateRandomNumber(operations.length - 1)];
    }

    public static int gcd(int firstPrime, int secondPrime) {
        return secondPrime == 0 ? firstPrime : gcd(secondPrime, firstPrime % secondPrime);
    }

    public static int[] generateProgression(int step) {
        int[] progression = new int[PROGRESSION_LENGTH];
        progression[0] = generateRandomNumber(MAX_INTEGER_VALUE);
        for (int i = 1; i < PROGRESSION_LENGTH; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }

    public static boolean isNumberPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
