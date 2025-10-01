package cl.duoc.cmartinez.cartesian;

public class Point {
    private double x = 1.0;
    private double y = 1.0;

    public Point(){

    }

    public Point(double a, double b){
        this.x = a;
        this.y = b;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double calculateDistance(Point other) {
        double xDiff = Math.pow(other.getX() - x, 2.0);
        double yDiff = Math.pow(other.getY() - y, 2.0);
        return Math.sqrt(xDiff + yDiff);
    }
}
