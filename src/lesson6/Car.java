package lesson6;

public class Car {
    //fields
    private String color;
    private String make;
    private int year;
    private int honkTimes;

//    public Car(){
//        year = 2000;
//    }

    public Car(int year,
           String color,
           String make){
        this.year = year;
        this.color = color;
        this.make = make;
    }

    public void honk(){
        System.out.println("HONK!");
        honkTimes++;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
