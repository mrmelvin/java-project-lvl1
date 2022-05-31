package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetings() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scan.nextLine();
        System.out.printf("Hello, %s \n", userName);
        scan.close();
    }
}
