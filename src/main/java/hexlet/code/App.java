package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calculation\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        String selectedGame = scan.nextLine();
        switch (selectedGame) {
            case "0":
                System.out.println("Good bye! See you later!");
                break;
            case "1":
                Cli.greetings();
                break;
            case "2":
                Even.startGame();
                break;
            case "3":
                Calculator.startGame();
                break;
            case "4":
                GCD.startGame();
                break;
            case "5":
                Progression.startGame();
                break;
            case "6":
                Prime.startGame();
                break;
            default:
                System.out.println("Please, type number in range 0 from 6");
        }
        scan.close();
    }

}
