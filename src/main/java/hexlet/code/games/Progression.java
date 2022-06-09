package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.MathSupport.generateRandomNumber;
import static hexlet.code.MathSupport.generateProgression;

public class Progression {
    static final int TOTAL_ROUNDS = 3;
    static final int MAX_INTEGER = 10;
    public static void progressionGame() {
        String progressionMessage = "What number is missing in the progression?";
        String[] questions = new String[TOTAL_ROUNDS];
        String[] answers = new String[TOTAL_ROUNDS];
        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int stepProgression = generateRandomNumber(MAX_INTEGER);
            int[] clearProgression = generateProgression(stepProgression);
            int answerPosition = generateRandomNumber(clearProgression.length - 1);
            answers[i] = Integer.toString(clearProgression[answerPosition]);
            String question = "";
            for (int j = 0; j < clearProgression.length; j++) {
                if (j == answerPosition) {
                    question += ".. ";
                } else {
                    question += Integer.toString(clearProgression[j]) + " ";
                }
            }
            questions[i] = question;
        }
        Engine.startGame(progressionMessage, questions, answers);
    }
}
