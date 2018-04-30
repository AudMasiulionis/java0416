package lesson7;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void hello(){
        System.out.println("Hello");
    }

    protected void apsaugotas(){
    }

    private void privatus(){

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
