package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

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


//        int rounds = 0;
//        int totalRounds = 3;
//        int rightAnswers = 0;
//        char[] operations = {'+', '-', '*'};
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
//        String userName = scan.nextLine();
//        System.out.print("Hello, " + userName + "\n");
//        System.out.println("What is the result of the expression?");
//        while (rounds < totalRounds) {
//            int firstNumber = generateRandomNumber(100);
//            int secondNumber = generateRandomNumber(100);
//            char operation = generateRandomOperations();
//            int answer;
//            String s = String.format("What is the result of the expression?\nQuestion: %d %с %d", firstNumber, operation,secondNumber);
//            System.out.println(s);
//            if(operation == '+') {
//                answer = firstNumber + secondNumber;
//            } else if (operation == '-') {
//                answer = firstNumber - secondNumber;
//            } else {
//                answer = firstNumber * secondNumber;
//            }
//            Scanner scanNumber = new Scanner(System.in);
//            String printingUserAnswer = scanNumber.nextLine();
//            System.out.printf("Your answer: %s \n", printingUserAnswer);
//            if (Integer.parseInt(printingUserAnswer) == answer) {
//                System.out.println("Correct!");
//            } else {
//                System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d'", printingUserAnswer, answer);
//                break;
//            }
//
//
//        }
//        if (rightAnswers == 3) {
//            System.out.printf("Congratulations, %s!\n", userName);
//        }
//        else {
//            System.out.printf("Let's try again, %s!\n", userName);
//        }
//        scan.close();
    }
}
