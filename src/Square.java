public class Square {
   /* private int x1,x2,x3,x4,y1,y2,y3,y4;
    private static int Height,Width;
    private static int Area,Perimeter;*/

   private double sideLength;
   private double perimeter;
   private double area;

    public Square(double lengthOfSide){
        /*point1.setPoint(2,2);
        point2.setPoint(2,8);
        point3.setPoint(8,2);
        point4.setPoint(8,8);
        point1.setZ(0);
        point2.setZ(0);
        point3.setZ(0);
        point4.setZ(0);*/

        sideLength = lengthOfSide;
        calPerimeter();
        calcArea();


    }

    private void calPerimeter(){
        perimeter = sideLength *4;
    }

    private void calcArea(){
        area = sideLength * sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
        calcArea();
        calPerimeter();
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}
