public class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public double calculateSlope() {
        double slope = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        return slope;
    }

    public String pointSlopeForm() {
        return "(y - " + p2.getY() + ")" + " = " + calculateSlope() + "(x - " + p2.getX() + ")";
    }

    public boolean isCoordinateOnLine(Point p) {
        double a = -(p2.getY() - p1.getY());
        double b = p2.getX() - p1.getX();
        double c = -(a * p1.getX() + b * p1.getY());

        return (a * p.getX()) + (b * p.getY()) + c == 0;
    }

    public void shift(int dx, int dy) {
        p1.setX(p1.getX() + dx);
        p2.setX(p2.getX() + dx);
        p1.setY(p1.getY() + dy);
        p2.setY(p2.getY() + dy);
    }

    public boolean isParallelTo(Line other) {
        if (other == null) {
            return false;
        }

        return calculateSlope() == other.calculateSlope();
    }

    public Line copy() {
        Point newP1 = new Point(p1.getX(), p1.getY());
        Point newP2 = new Point(p2.getX(), p2.getY());

        return new Line(newP1, newP2);
    }
}
