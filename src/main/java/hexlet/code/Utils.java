package hexlet.code;

public class Utils {
    public static int generateRandomNumber(int lowRangeValue, int highRangeValue) {
        return lowRangeValue + (int) (Math.random() * highRangeValue);
    }
}
