package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetings() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String empName = scan.nextLine();
        System.out.print("Hello, " + empName);
        scan.close();
    }
//    public static void rand() {
//        int randomNumber = (int) (Math.random() * 100);
//        System.out.print("Random number is " + randomNumber);
//    }
}
