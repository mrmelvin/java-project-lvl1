package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetings() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner scan = new Scanner(System.in);
        String gamerName = scan.nextLine();
        System.out.printf("Hello, %s!\n", gamerName);
        scan.close();
    }
}
