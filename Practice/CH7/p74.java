/*
7.4
(Analyze scores) Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume that the maximum number of scores is 100.

Enter scores: 2.3 3.4 5.6 8.5 6.7 8.8 -1
Scores are above or equal to the average is 3
Scores are below to the average is 3
 */

import java.util.Scanner;

public class p74 {
    public static void main(String[] args) {
        double n = 0;
        int i = 0;
        double[] scores = new double[100];

        System.out.print("Enter scores: ");
        Scanner in = new Scanner(System.in);
        do {
            n = in.nextDouble();
            if (n >= 0) {
                scores[i] = n;
                i++;
            }
        } while (n >= 0);
        in.close();

        double sum = 0;
        for (int j = 0; j < i; j++) {
            sum += scores[j];
        }

        double average = sum / i;
        int bAverage = 0, aAverage = 0;
        for (int j = 0; j < i; j++) {
            if (scores[j] < average) {
                bAverage++;
            }

            else if (scores[j] >= average) {
                aAverage++;
            }
        }

        System.out.println("Scores are above or equal to the average is " + aAverage);
        System.out.println("Scores are below to the average is " + bAverage);

    }
}
