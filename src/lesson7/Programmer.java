package lesson7;

public class Programmer extends Person {

    protected int linesOfCode;

    public Programmer(String name) {
        super(name);
    }

    public void code(){
        linesOfCode++;
    }

    @Override
    public String toString(){
                    //grazina varda
        return super.toString() +  this.linesOfCode;
    }

}
