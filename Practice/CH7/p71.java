/*
 7.1
(Assign grades) Write a program that reads student scores, gets the best score,
and then assigns grades based on the following scheme:
Grade is A if score is Ú best - 10
Grade is B if score is Ú best - 20;
Grade is C if score is Ú best - 30;
Grade is D if score is Ú best - 40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades. Here
is a sample run:

Enter the number of students: 4
Enter 4 scores: 40 55 70 58
Student 0 score is 40 and grade is C
Student 1 score is 55 and grade is B
Student 2 score is 70 and grade is A
Student 3 score is 58 and grade is B
 */

import java.util.Scanner;

public class p71 {
    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.print("Enter " + n + " scores: ");
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.nextInt();
        }
        in.close();

        int best = s[0];
        for (int i = 0; i < n - 1; i++) {
            if (s[i] < s[i + 1]) {
                best = s[i + 1];
            }
        }

        for (int i = 0; i < n; i++) {
            if (s[i] >= best - 10) {
                System.out.println("Student " + i + " score is " + s[i] + " and grade is A");
            }

            else if (s[i] >= best - 20) {
                System.out.println("Student " + i + " score is " + s[i] + " and grade is B");
            }

            else if (s[i] >= best - 30) {
                System.out.println("Student " + i + " score is " + s[i] + " and grade is C");
            }

            else if (s[i] >= best - 40) {
                System.out.println("Student " + i + " score is " + s[i] + " and grade is D");
            }

            else {
                System.out.println("Student " + i + " score is " + s[i] + " and grade is F");
            }
        }
    }
}