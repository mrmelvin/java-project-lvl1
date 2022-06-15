package hexlet.code;

public class Utils {

    static final int MAX_INTEGER_VALUE = 50;
    public static int generateRandomNumber(int lowRangeValue, int highRangeValue) {
        return lowRangeValue + (int) (Math.random() * highRangeValue);
    }
}
