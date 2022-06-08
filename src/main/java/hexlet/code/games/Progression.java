package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.MathSupport.generateRandomNumber;
import static hexlet.code.MathSupport.generateProgression;

public class Progression {
    private static int totalRounds = 3;
    private static int maxInteger = 10;
    public static void progressionGame() {
        String progressionMessage = "What number is missing in the progression?";
        String[] questions = new String[totalRounds];
        String[] answers = new String[totalRounds];
        for (int i = 0; i < totalRounds; i++) {
            int stepProgression = generateRandomNumber(maxInteger);
            int[] clearProgression = generateProgression(stepProgression);
            int answerPosition = generateRandomNumber(clearProgression.length - 1);
            answers[i] = Integer.toString(clearProgression[answerPosition]);
            String question = "";
            for (int j = 0; j < clearProgression.length; j++) {
                if (j == answerPosition) {
                    question += ".. ";
                }
                else {
                    question += Integer.toString(clearProgression[j]) + " ";
                }
            }
            questions[i] = question;
        }
        Engine.startGame(progressionMessage, questions, answers);
    }
}
