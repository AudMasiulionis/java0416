package lesson3;

import java.util.Scanner;

public class Loops {

    static int x = 54;

    public static void main(String[] args) {
//1
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
//2
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.println("Hello World!");
        }
//3
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }
//4
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
//5
        int sum1 = 0;
        int x = 1;
        while (x != 100) {
            sum1 += x;
            x++;
        }
//6
        int sum2 = 0;
        int y = 1;
        do {
            sum1 += x;
            x++;
        }
        while (x != 100);

//7
//        while (true){}
//        do {
//
//        }while (true);
//        for(;;){}


//8
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
//9
        for(int i = 50; i <= 1; i-- ){
            System.out.println(i);
        }
    }


}
