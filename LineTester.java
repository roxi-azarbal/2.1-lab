/*
 * REQ 01: answer both questions before you write any other code.
 *
 * 1. Your tester runs the three lines below. How many Point objects
 *    exist afterward, and what does line.getP1().getX() return? Why?
 *        Point start = new Point(1, 4);
 *        Line line = new Line(start, new Point(2, 7));
 *        start.setX(6);
 *    Answer:
 *
 * 2. Two methods in this lab take a parameter that can be null.
 *    Name them, and say what each one returns for null.
 *    Answer:
 */
public class LineTester {
    public static void main(String[] args) {
        Point start = new Point(2, 7);
        Point end = new Point(1, 4);
        Line pointLine = new Line(start, end);

        System.out.println("Slope: " + pointLine.calculateSlope());

        // getters
        System.out.println("Start X: " + start.getX());
        System.out.println("Start Y: " + start.getY());

        // setters
        Point test = new Point(1, 2);
        test.setX(3);
        test.setY(4);
        System.out.println("Set X: " + test.getX());
        System.out.println("Set Y: " + test.getY());

        // distanceTo
        Point a = new Point(5, 10);
        Point b = new Point(10, 20);
        System.out.println("Distance: " + a.distanceTo(b));

        // proof
        System.out.println("P1: " + (pointLine.getP1() == start));
        System.out.println("P2: " + (pointLine.getP2() == end));

        // point slope
        System.out.println("Point Slope Form: " + pointLine.pointSlopeForm());

        // two points on line
        System.out.println("on line 1: " + pointLine.isCoordinateOnLine(new Point(2, 7)));
        System.out.println("on line 2: " + pointLine.isCoordinateOnLine(new Point(4, 13)));

        // two points off line
        System.out.println("off line 1: " + pointLine.isCoordinateOnLine(new Point(0, 0)));
        System.out.println("off line 2: " + pointLine.isCoordinateOnLine(new Point(11, 50)));

        // null
        System.out.println("null point: " + pointLine.isCoordinateOnLine(null));

        // shift
        System.out.println("Before shift X: " + start.getX());
        System.out.println("Before shift Y: " + start.getY());
        System.out.println("Before shift (3, 9): " + pointLine.isCoordinateOnLine(new Point(3, 9)));

        pointLine.shift(1, 2);
        System.out.println("After shift X: " + start.getX());
        System.out.println("Afer shift Y: " + start.getY());
        System.out.println("After shift (3, 9): " + pointLine.isCoordinateOnLine(new Point(3, 9)));

        // parallel
        Line parallel = new Line(new Point(0, 0), new Point(1, 3));
        Line notParallel = new Line(new Point(0, 0), new Point(5, 8));

        System.out.println("Parallel: " + pointLine.isParallelTo(parallel));
        System.out.println("Not parallel: " + pointLine.isParallelTo(notParallel));
        System.out.println("Not parallel: " + pointLine.isParallelTo(null));
    }
}