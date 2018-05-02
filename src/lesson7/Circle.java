package lesson7;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    protected double getArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
