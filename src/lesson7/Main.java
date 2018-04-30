package lesson7;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("John");
        String t = p.toString();
        System.out.println(t);

        Programmer prog = new Programmer("Petras");
        System.out.println(prog.toString());
//
//        SuperProgramuotojas sp = new SuperProgramuotojas("101");
//        sp.hello();
//        sp.code();
//        sp.superCode();
//        System.out.println(sp.getName());
    }
}
