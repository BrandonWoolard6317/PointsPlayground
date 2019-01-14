public class Point {
    int x,y,z,PointNumber;

    public Point(int PointNumber,int x, int y, int z) {
        this.PointNumber = PointNumber;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public String toString() {
        return "Point "+PointNumber+": "+"("+x+","+y+","+z+")";
    }

}
