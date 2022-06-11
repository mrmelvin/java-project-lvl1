package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetings;
import static hexlet.code.games.Even.evenGame;
import static hexlet.code.games.Calculator.calculatorGame;
import static hexlet.code.games.GCD.gcdGame;
import static hexlet.code.games.Progression.progressionGame;
import static hexlet.code.games.Prime.primeGame;
public class App {
    public static void selectGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
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
                greetings();
                break;
            case "2":
                evenGame();
                break;
            case "3":
                calculatorGame();
                break;
            case "4":
                gcdGame();
                break;
            case "5":
                progressionGame();
                break;
            case "6":
                primeGame();
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
