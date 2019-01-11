public class Point {
    int x,y,z;
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        z = z;
    }



    public static void verifyPoint(Point point){
        System.out.println(point.toString());
    }


    public static void pointDistance(int x1, int x2, int y1, int y2, int z1, int z2){
        int x,y,z;
        x = 0;
        y = 0;
        z = 0;
        if(x1>x2){
            x = x1-x2;
        } else if(x2<x1) {
            x = x2 - x1;
        }
        if(y1>y2){
            y = y1-y2;
        } else if(y2<y1) {
            y = y2 - y1;
        }
        if(z1>z2){
            z = z1-z2;
        } else if(z2<z1) {
            z = z2 - z1;
        }
        System.out.println("Distance of x: "+x+"\nDistance of y: "+y+"\nDistance of z: "+z);
    }
}
