package lesson6;

public class Person {
    //class fields
    private String firstName;
    private String lastName;

    //default constructor
    public Person() {
    }

    //overriden constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //methods define behavior
    public void greet(){
        System.out.printf("Hello. My name is %s %s", this.firstName, this.lastName);
    }

    //getters and setter for fields
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
