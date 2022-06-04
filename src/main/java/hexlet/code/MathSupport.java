package hexlet.code;

public class MathSupport {
    public static int generateRandomNumber(int maximumNumber) {
        return 1 + (int) (Math.random() * maximumNumber);
    }

    public static char generateRandomOperations() {
        char[] operations = {'+', '-', '*'};
        return operations[generateRandomNumber(operations.length)];
    }
}
