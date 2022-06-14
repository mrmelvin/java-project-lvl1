package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.MathSupport.generateRandomNumber;
import static hexlet.code.MathSupport.generateProgression;

public class Progression {
    static final int TOTAL_ROUNDS = 3;
    static final int MAX_INTEGER = 10;
    public static void startGame() {
        String progressionMessage = "What number is missing in the progression?";
        int indexQuestion = 0;
        int indexAnswer = 1;
        String[][] roundData = new String[TOTAL_ROUNDS][indexAnswer+1];
        for (int round = 0; round < TOTAL_ROUNDS; round++) {
            int stepProgression = generateRandomNumber(MAX_INTEGER);
            int[] clearProgression = generateProgression(stepProgression);
            int answerPosition = generateRandomNumber(clearProgression.length - 1);
            roundData[round][indexAnswer] = Integer.toString(clearProgression[answerPosition]);
            String question = "";
            for (int j = 0; j < clearProgression.length; j++) {
                if (j == answerPosition) {
                    question += ".. ";
                } else {
                    question += Integer.toString(clearProgression[j]) + " ";
                }
            }
            roundData[round][indexQuestion] = question;
        }
        Engine.startGame(progressionMessage, roundData);
    }
}
