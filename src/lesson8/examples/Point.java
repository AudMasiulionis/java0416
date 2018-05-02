package lesson8.examples;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Point == false){
            return false;
        }
        Point other = (Point)o;
        return this.x == other.x && this.y == other.y;
    }
}
