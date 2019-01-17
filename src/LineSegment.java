public class LineSegment {
    Point point1, point2;

    public LineSegment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void movePoint(Point point, int x, int y, int z){
        point.setX(x);
        point.setY(y);
        point.setZ(z);
    }

    public void translate(int xMove, int yMove, int zMove){
        point1.translate(xMove, yMove, zMove);
        point2.translate(xMove, yMove, zMove);
    }

    @Override
    public String toString() {
        return "LineSegment{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }
}
