package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
import static hexlet.code.MathSupport.*;

public class Calculator {
    private static int totalRounds = 3;
    public static void calculatorGame() {
        //char[] operators = {'+', '-', '*'};
        int firstNumbers[] = new int[totalRounds];
        int secondNumbers[] = new int[totalRounds];
        String operations[] = new String[totalRounds];
        String answers[] = new String[totalRounds];;
        String calculationMessage = "What is the result of the expression?";
        for (int i = 0; i < totalRounds; i++) {
            firstNumbers[i] = generateRandomNumber(100);
            secondNumbers[i] = generateRandomNumber(100);
            char currentOperators = generateRandomOperators();
            operations[i] = String.format("%d %c %d", firstNumbers[i], currentOperators, secondNumbers[i]);
            if(currentOperators == '+') {
                answers[i] = Integer.toString(firstNumbers[i] + secondNumbers[i]);
            } else if (currentOperators == '-') {
                answers[i] = Integer.toString(firstNumbers[i] - secondNumbers[i]);
            } else {
                answers[i] = Integer.toString(firstNumbers[i] * secondNumbers[i]);
            }
        }
        Engine.startGame(calculationMessage, operations, answers);
    }
}
