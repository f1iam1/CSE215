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