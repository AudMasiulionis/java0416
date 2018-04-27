package lesson6;

public class Point {
    private int x;
    private int y;
    private String color;

    public Point() {
        this.x = 5;
        this.y = 13;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Point(String color) {
        this.color = color;
    }

    public double getDistance(){
        return Math.sqrt(Math.pow(this.x, 2) +
                Math.pow(this.y, 2));
    }

    public int getQuarter(){
        if (this.x == 0 && this.y == 0){
            return 0;
        } else if(this.x > 0 && this.y > 0){
            return 1;
        } else if(this.x < 0 && this.y > 0){
            return 2;
        } else if(this.x < 0 && this.y < 0){
            return 3;
        } else {
            return 4;
        }
    }

    public boolean sameQuarter(Point other){
        return this.getQuarter() == other.getQuarter();
    }

}
