public class Point {
    public String pointCreator(Point point,int value1,int value2,int value3) {
        int x,y,z;
        x = value1;
        y = value2;
        z = value3;
        return "Before: "+point+"\nAfter: "+"("+x+","+y+","+z+")";
    }
    public static void verifyPoint(Point point, int value1,int value2,int value3,Point point2,int value4,int value5,int value6){
        int x1,y1,z1;
        x1 = value1;
        y1 = value2;
        z1 = value3;
        int x2,y2,z2;
        x2 = value4;
        y2 = value5;
        z2 = value6;
        Point.pointDistance(x1,x2,y1,y2,z1,z2);
    }
    public static void pointDistance(int x1,int x2,int y1,int y2,int z1,int z2){
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
