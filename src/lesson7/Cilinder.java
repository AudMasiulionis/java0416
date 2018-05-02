package lesson7;

public class Cilinder extends Circle {
    private int height;

    public Cilinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * height;
    }

    public double getVolume(int radius){
        return super.getArea(radius) * height;
    }



}
