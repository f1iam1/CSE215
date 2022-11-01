import java.util.Scanner;

/* Problem#4: (Geometry: two circles) Write a program that prompts the user to enter the center
coordinates and radii of two circles and determines whether the second circle is inside the first
or overlaps with the first, as shown in Figure 1. (Hint: The formula for computing the distance is
sqrt((x2-x1)^2 + (y2-y1)^2). And Circle2 is inside circle1 if the distance between the two centers
<= r1 - r2 and circle2 overlaps circle1 if the distance between the two centers <=r1 + r2. Test
your program to cover all cases.)

Here are the sample runs:
Enter circle1's center x - , y-coordinates, and radius: 0.5 5.1 13
Enter circle2's center x - , y-coordinates, and radius: 1 1.7 4.5
circle2 is inside circle1 */

public class prob4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter circle1's center x - , y-coordinates, and radius: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double r1 = in.nextDouble();

        System.out.print("Enter circle2's center x - , y-coordinates, and radius: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double r2 = in.nextDouble();
        in.close();

        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (d <= r1 - r2) {
            System.out.println("Circle2 is inside circle1");
        }

        else if (d <= r1 + r2) {
            System.out.println("Circle2 overlaps circle1");
        }
    }
}
