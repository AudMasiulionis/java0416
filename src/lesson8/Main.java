package lesson8;

import lesson8.examples.*;

public class Main {

    private static int test;

    public static void main(String[] args) {

        //A a = new A();
        //B b = new B();
        //C c = new C();


        //polimorfizmo pavyzdziai
//        whatDoesTheMethodSay(a); //A
//        whatDoesTheMethodSay(b); //B
//        whatDoesTheMethodSay(c); //C


        //instance of pavyzdziai
//        A letter2 = LetterFactory.Create("C");
//        letter2.test();
//
//        if (letter2 instanceof C){
//            System.out.println("Cia C");
//            C c = (C)letter2;
//            c.shout();
//        }
//        if (letter2 instanceof B){
//            System.out.println("Cia B");
//        }



        Point a = new Point(1,2);
        Point b = new Point(1,2);

        if (a.equals(b)){
            System.out.println("Lygus");
        } else {
            System.out.println("Nelygus");
        }


    }

    private static void whatDoesTheMethodSay(A a) {
        a.test();
    }
}
