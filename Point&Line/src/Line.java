/*
Author: Veronika Tsykunova
Teacher: Mr. Guglielmi
Description: Line class
 */
public class Line {
    private int m;
    private int b;

    public Line(int m, int b) {
        this.m = m;
        this.b = b;
    }


    public int solveForX(int y) {
        return (y - b) / m;     //solve for X given Y
    }

    public double solveForY(double x) {
        return m * x + b;       //Solve for Y given X
    }

    public boolean isPointOnLine(Point point) {
        return
                Math.abs(point.getY() - (m * point.getX() + b)) < 0.0001; // tolerance for double precision
    }

    public static int calculateSlope(Point p1, Point p2) {
        return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }
    public String toString(){
        return this.m + "x + " + this.b;
    }
}