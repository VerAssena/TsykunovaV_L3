/*
Author: Veronika Tsykunova
Teacher: Mr. Guglielmi
Description: Driver class to call the Line and Point class and run code/methods within
 */

public class Driver {
    public static void main(String[] args) {

        Line l = new Line (3, 6);

        System.out.println("Function f(x)= " + l.toString());

        Point p1 = new Point (-2, 0);
        Point p2 = new Point (0, 6);

        //Testing if point on line
        System.out.println("Is point (-2, 0) on the line? " + l.isPointOnLine(new Point(-2, 0))); // Expected: true
        System.out.println("Is point (0, 6) on the line? " + l.isPointOnLine(new Point(0, 6))); // Expected: true

        //Slope at two points
        System.out.println("Slope between (-2, 0) and (0 ,6): " + Line.calculateSlope(new Point(-2, 0), new Point(0, 6)));

        //Solve for y
        System.out.println("f(0) = " + l.solveForY(0));

        //Solve for x
        System.out.println("if y = 0, then x = " + l.solveForX(0));


    }
}