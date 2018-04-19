package lesson3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        boolean repeat = true;
        do {
        System.out.println("1. Skaiciu sudetis");
        System.out.println("2. Skaiciu daugyba");
        System.out.println("3. 256 kvadratu");
        System.out.println("Jusu pasirinkimas");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                sum();
                break;
            case 2:
                multiply();
                break;
            case 3:
                power();
                break;
            default:
                System.out.println("Blogas pasirinkimas");
                repeat = false;
                break;
        }
        }while (!repeat);
    }

    private static void power() {
        double result = Math.pow(256,2);
        System.out.println(result);
    }

    private static void multiply() {
        Scanner sc = new Scanner(System.in);
        //get first number
        //get second number
        //calculate sum
        //print sum
    }

    private static void sum() {
        //todo
    }
}
