package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.MathSupport.*;

public class Calculator {
    public static void calculatorGame() {
        char[] operations = {'+', '-', '*'};
        int firstNumber = generateRandomNumber(100);
        int secondNumber = generateRandomNumber(100);
        char operation = generateRandomOperations();
        int answer;
        String s = String.format("What is the result of the expression?\nQuestion: %d %с %d", firstNumber, operation,secondNumber);

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
