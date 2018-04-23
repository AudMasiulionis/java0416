package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static boolean[][] diamonds = new boolean[5][5];
    static boolean[][] userInputs = new boolean[5][5];
    static int guessCount = 0;
    static int diamondsFound = 0;
    static boolean gameEnded = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean runGame = true;
        while (runGame) {
            initGame();

            while (!gameEnded) {
                System.out.println("Ivesk x koordinate");
                int x = sc.nextInt();
                System.out.println("Ivesk y koordinate");
                int y = sc.nextInt();

                processUserInput(x, y);
                displayTable();
            }

            processGameResult();

            System.out.println("Zaisti dar karta? (Y/N)");
            String input = sc.next();
            runGame = input.toLowerCase().equals("y");
        }
    }

    private static void processGameResult() {
        System.out.println("Zaidimas baigtas");
        boolean gameWon = diamondsFound == 3;

        if (gameWon) {
            System.out.println("Laimejai");
        } else {
            System.out.println("Pralaimejai");
        }
    }

    //reset all variables
    private static void initGame() {
        guessCount = 0;
        diamondsFound = 0;
        gameEnded = false;
        userInputs = new boolean[5][5];
        generateDiamonds();
        displayTable();
    }

    private static void processUserInput(int x, int y) {
        //pries tai buvo pasirinkta si koordinate
        if (userInputs[x][y] == true){
            return;
        }
        userInputs[x][y] = true;
        guessCount++;
        if (diamonds[x][y] == true){
            diamondsFound++;
        }
        if (guessCount == 7 || diamondsFound == 3){
            gameEnded = true;
        }
    }

    private static void displayTable() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (!userInputs[i][j]) {
                    System.out.printf("%2s", "O");
                } else {
                    printDaimondOrBlank(diamonds[i][j]);
                }
            }
            System.out.println();
        }
    }

    private static void printDaimondOrBlank(boolean b) {
        if (b) {
            System.out.printf("%2s", "*");
        } else {
            System.out.printf("%2s", "");
        }
    }

    private static void generateDiamonds() {
        int diamontCount = 0;
        while (diamontCount != 7) {
            int x = new Random().nextInt(4);
            int y = new Random().nextInt(4);

            if (diamonds[x][y] != true) {
                diamonds[x][y] = true;
                diamontCount++;
            }
        }
    }
}
