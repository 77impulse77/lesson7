public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // WITHOUT ENCAPSULATION (CLASS CONTEXT)
    public static double getDistanceBetween(Point p1, Point p2) {
        int dx = p1.x - p2.x;
        int dy = p1.y - p2.y;

        return Math.sqrt(dx*dx + dy*dy);
    }

    // WITH ENCAPSULATION (OBJECT CONTEXT)
    public double getDistanceTo(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;

        return Math.sqrt(dx*dx + dy*dy);
    }
}