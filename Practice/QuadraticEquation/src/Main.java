/*
(Algebra: quadratic equations) Design a class named QuadraticEquation for
a quadratic equation ax2 + bx + c = 0. The class contains:

■ Private data fields a, b, and c that represent three coefficients.
■ A constructor with the arguments for a, b, and c.
■ Three getter methods for a, b, and c.
■ A method named getDiscriminant() that returns the discriminant, which
is b2 - 4ac.
■ The methods named getRoot1() and getRoot2() for returning two roots
of the equation

These methods are useful only if the discriminant is nonnegative. Let these methods
return 0 if the discriminant is negative.

Write a test program that prompts the user to enter values for a, b, and c and displays the result
based on the discriminant. If the discriminant is positive, display the two roots. If
the discriminant is 0, display the one root.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter three coefficients: ");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        scan.close();

        QuadraticEquation q = new QuadraticEquation(a, b, c);

        if (q.getDiscriminant() > 0) {
            System.out.println("Root1: " + q.getRoot1() + ", Root2: " + q.getRoot2());
        }

        else if (q.getDiscriminant() == 0) {
            System.out.println("Root: " + q.getRoot1());
        }

        else{
            System.out.println("The equation has no roots");
        }
    }
}