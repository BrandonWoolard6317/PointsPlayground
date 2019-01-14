import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Point point1,point2,point3,point4,point5,point6;
        int x1=0,x2=0,x3=0,x4=0,x5=0,x6=0,y1=0,y2=0,y3=0,y4=0,y5=0,y6=0,z1=0,z2=0,z3=0,z4=0,z5=0,z6=0;
        String userResponse="";
        int userResponseInt=0,r=0;

        System.out.println("Would you like to enter your own points?");
        boolean loop1 = true;
        while(loop1) {
            userResponse = scanner.nextLine().toLowerCase();
            if (userResponse.equals("yes")) {
                System.out.println("How many points do you want to enter?");
                userResponseInt = scanner.nextInt();
                r = userResponseInt;
                if(userResponseInt>6){
                    System.out.println("You can only make 6 points sorry you can't make "+userResponseInt+" points.");
                } if(userResponseInt>0) {
                    System.out.println("x for Point 1?");
                    x1 = scanner.nextInt();
                    System.out.println("y for Point 1?");
                    y1 = scanner.nextInt();
                    System.out.println("z for Point 1?");
                    z1 = scanner.nextInt();
                } if(userResponseInt>1) {
                    System.out.println("x for Point 2?");
                    x2 = scanner.nextInt();
                    System.out.println("y for Point 2?");
                    y2 = scanner.nextInt();
                    System.out.println("z for Point 2?");
                    z2 = scanner.nextInt();
                } if(userResponseInt>2) {
                    System.out.println("x for Point 3?");
                    x3 = scanner.nextInt();
                    System.out.println("y for Point 3?");
                    y3 = scanner.nextInt();
                    System.out.println("z for Point 3?");
                    z3 = scanner.nextInt();
                } if(userResponseInt>3) {
                    System.out.println("x for Point 4?");
                    x4 = scanner.nextInt();
                    System.out.println("y for Point 4?");
                    y4 = scanner.nextInt();
                    System.out.println("z for Point 4?");
                    z4 = scanner.nextInt();
                } if(userResponseInt>4) {
                    System.out.println("x for Point 5?");
                    x5 = scanner.nextInt();
                    System.out.println("y for Point 5?");
                    y5 = scanner.nextInt();
                    System.out.println("z for Point 5?");
                    z5 = scanner.nextInt();
                } if(userResponseInt>5) {
                    System.out.println("x for Point 6?");
                    x6 = scanner.nextInt();
                    System.out.println("y for Point 6?");
                    y6 = scanner.nextInt();
                    System.out.println("z for Point 6?");
                    z6 = scanner.nextInt();
                }
                loop1 = false;
            } else if (userResponse.equals("no")) {
                x1 = 9;
                x2 = 1;
                x3 = 3;
                x4 = 8;
                x5 = 2;
                x6 = 6;
                y1 = 8;
                y2 = 2;
                y3 = 3;
                y4 = 5;
                y5 = 1;
                y6 = 7;
                z1 = 8;
                z2 = 3;
                z3 = 6;
                z4 = 2;
                z5 = 4;
                z6 = 7;
                r = 6;
                loop1 = false;
            } else {
                System.out.println("Invalid response! Please Type Yes or No.");
            }
        }

        if(r>0) {
            point1 = new Point(1, x1, y1, z1);
            System.out.println(point1.toString());
        } if(r>1) {
            point2 = new Point(2, x2, y2, z2);
            System.out.println(point2.toString());
        } if(r>2) {
            point3 = new Point(3, x3, y3, z3);
            System.out.println(point3.toString());
        } if(r>3) {
            point4 = new Point(4, x4, y4, z4);
            System.out.println(point4.toString());
        } if(r>4) {
            point5 = new Point(5, x5, y5, z5);
            System.out.println(point5.toString());
        } if(r>5) {
            point6 = new Point(6, x6, y6, z6);
            System.out.println(point6.toString());
        }
    }
}