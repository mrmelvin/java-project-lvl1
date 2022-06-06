package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.*;
import static hexlet.code.Engine.*;
import static hexlet.code.games.Even.*;
import static hexlet.code.games.Calculator.*;
import static hexlet.code.games.GCD.*;
public class App {
    public static void selectGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "4 - GCD\n" +
                "0 - Exit");
        System.out.print("Your choice: ");
        String selectedGame = scan.nextLine();
        switch (selectedGame) {
            case "0":
                System.out.println("Good bye");
                break;
            case "1":
                greetings();
                break;
            case "2":
                evenGame();
                break;
            case "3":
                calculatorGame();
                break;
            case "4":
                GCDGame();
                break;
            default:
                System.out.println("Please, type number in range 0 from 6");
        }
        scan.close();
    }

    public static void main(String[] args) {
        selectGame();
    }
}
