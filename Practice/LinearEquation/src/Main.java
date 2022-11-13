/*
(Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
2 * 2 system of linear equations:
ax + by = e
cx + dy = f
x = ed - bf / ad - bc
y = af - ec / ad - bc

The class contains:
■ Private data fields a, b, c, d, e, and f.
■ A constructor with the arguments for a, b, c, d, e, and f.
■ Six getter methods for a, b, c, d, e, and f.
■ A method named isSolvable() that returns true if ad - bc is not 0.
■ Methods getX() and getY() that return the solution for the equation.

Write a test program that prompts the user to enter a, b, c, d, e, and f and displays the result. If
ad - bc is 0, report that “The equation has no solution.”
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a, b, c, d, e, f: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();
        in.close();

        LinearEquation q = new LinearEquation(a, b, c, d, e, f);

        if (!q.isSolvable()) {
            System.out.println("The equation has no solution");
        } else {
            System.out.println("x: " + q.getX() + ", y: " + q.getY());
        }
    }
}