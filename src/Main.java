import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int x1,x2,y1,y2,z1,z2;

        /*System.out.println("x for Point 1?");
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
        z2 = scanner.nextInt();*/

        x1 = 9;
        x2 = 1;
        y1 = 8;
        y2 = 2;
        z1 = 8;
        z2 = 3;

        Point.pointDistance(x1,x2,y1,y2,z1,z2);
        Point point1 = new Point(x1,y1,z1);
        Point point2 = new Point(x2,y2,z2);
        Point.verifyPoint(point1);
        Point.verifyPoint(point2);

    }
}
