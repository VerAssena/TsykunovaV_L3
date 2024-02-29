/*
Author: Veronika Tsykunova
Teacher: Mr. Guglielmi
Description: Point class
 */

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point (){
        this.x = 0;
        this.y = 0;
    }

    public int  getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        return "(" + this.x +"," + this.y + ")";
    }
}