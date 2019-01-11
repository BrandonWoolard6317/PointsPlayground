import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int x1,x2,y1,y2,z1,z2;

        System.out.println("x for Point 1?");
        x1 = scanner.nextInt();
        System.out.println("y for Point 1?");
        y1 = scanner.nextInt();
        System.out.println("z for Point 1?");
        z1 = scanner.nextInt();

        System.out.println("x for Point 2?");
        x2 = scanner.nextInt();
        System.out.println("y for Point 2?");
        y2 = scanner.nextInt();
        System.out.println("z for Point 2?");
        z2 = scanner.nextInt();

        Point.pointDistance(x1,x2,y1,y2,z1,z2);
        Point point1 = new Point();
        Point point2 = new Point();
        Point.verifyPoint(point1,5,9,3,point2,4,5,6);
        System.out.println(point1.pointCreator(point1,x1,y1,z1));
        System.out.println(point2.pointCreator(point2,5,7,9));
    }
}
