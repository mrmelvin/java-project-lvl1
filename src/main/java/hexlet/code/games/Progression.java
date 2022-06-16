package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.generateRandomNumber;

public class Progression {
    private static final int MIN_STEP_NUMBER = 2;
    private static final int MAX_STEP_NUMBER = 20;
    private static final int MIN_GENERATOR_NUMBER = 1;
    private static final int MAX_GENERATOR_NUMBER = 50;
    private static final int LENGTH_PROGRESSION = 10;

    public static int[] generateProgression(int firstElement, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = firstElement + step * i;
        }
        return progression;
    }

    public static void startGame() {
        String descriptionGameMessage = "What number is missing in the progression?";
        int indexQuestion = 0;
        int indexAnswer = 1;
        String[][] roundData = new String[Engine.TOTAL_ROUNDS][indexAnswer + 1];
        for (int round = 0; round < Engine.TOTAL_ROUNDS; round++) {
            int stepProgression = generateRandomNumber(MIN_STEP_NUMBER, MAX_STEP_NUMBER);
            int firstElementProgression = generateRandomNumber(MIN_GENERATOR_NUMBER, MAX_GENERATOR_NUMBER);
            int[] clearProgression = generateProgression(firstElementProgression, stepProgression, LENGTH_PROGRESSION);
            int answerPosition = generateRandomNumber(0, clearProgression.length - 1);
            roundData[round][indexAnswer] = Integer.toString(clearProgression[answerPosition]);
            var question = new StringBuilder();
            for (int j = 0; j < clearProgression.length; j++) {
                if (j == answerPosition) {
                    question.append(".. ");
                } else {
                    question.append(Integer.toString(clearProgression[j]));
                    question.append(" ");
                }
            }
            roundData[round][indexQuestion] = question.toString();
        }
        Engine.startGame(descriptionGameMessage, roundData);
    }
}
