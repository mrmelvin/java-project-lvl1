package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;
import static hexlet.code.Cli.*;
import static hexlet.code.Engine.*;
import static hexlet.code.MathSupport.generateRandomNumber;

public class Even {
    private static int totalRounds = 3;
    public static void evenGame() {
        // Currently work solution
        String evenMessage = "Answer 'yes' if number even otherwise answer 'no'.";
        String numbers[] = new String[totalRounds];
        String parity[] = new String[totalRounds];
        for (int i = 0; i < totalRounds; i++) {
            int currentNumber = generateRandomNumber(100);
            numbers[i] = Integer.toString(currentNumber);
            parity[i] = (currentNumber % 2 == 0) ? "yes" : "no";
        }
        Engine.startGame(evenMessage, numbers, parity);
    }
}
