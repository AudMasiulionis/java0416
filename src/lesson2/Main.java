package lesson2;

import java.util.Scanner;

//pamoku pavyzdziai
public class Main {
    public static void main(String[] args) {
        boolean isNegative = isNegative(1);
        if (isNegative){
            System.out.println("Neigiamas");
        }else {
            System.out.printf("Teigiamas");
        }
    }

    static boolean isNegative(int x){
        return x < 0;
    }

    static boolean isThreeDigit(int x){
        if (!isNegative(x)){
            return x >= 100 && x <= 999;
        }else {
            return x <= -100 && x >= -999;
        }
    }


}
