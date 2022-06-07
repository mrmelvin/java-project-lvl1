package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

import static hexlet.code.MathSupport.*;

public class Progression {
    private static int totalRounds = 3;
    public static void progressionGame() {
        String calculationMessage = "What number is missing in the progression?";
        String[] questions = new String[totalRounds];
        String[] answers = new String[totalRounds];
        for (int i = 0; i < totalRounds; i++) {
            int stepProgression = generateRandomNumber(10);
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
        Engine.startGame(calculationMessage, questions, answers);
    }
}
