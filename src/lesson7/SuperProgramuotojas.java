package lesson7;

public class SuperProgramuotojas extends Programmer {

    public SuperProgramuotojas(String name) {
        super(name);
    }

    @Override
    public void code(){
        linesOfCode += 2;
    }

}
