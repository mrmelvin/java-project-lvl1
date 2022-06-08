package hexlet.code;

public class MathSupport {

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
        int progressionLength = 10;
        int[] progression = new int[progressionLength];
        progression[0] = generateRandomNumber(50);
        for (int i = 1; i < progressionLength; i++) {
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
