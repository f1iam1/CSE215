/*
7.3
(Count occurrence of numbers) Write a program that reads the integers between 1
and 100 and counts the occurrences of each. Assume the input ends with 0. Here
is a sample run of the program:

Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time
 */

import java.util.Scanner;

public class p73 {
    public static void main(String[] args) {
        int[] num = new int[100];
        int n = 0, i = 0;
        System.out.print("Enter the integers between 1 and 100: ");
        Scanner scan = new Scanner(System.in);
        do {
            n = scan.nextInt();
            num[i] = n;
            i++;
        } while (n != 0);
        scan.close();

        countNumber(num);
    }

    public static void countNumber(int[] num) {
        for (int i = 1; i < 100; i++) {
            int c = 0;
            for (int j = 0; j < 99; j++) {
                if (num[j] == i) {
                    c++;
                }
            }

            if (c != 0) {
                System.out.printf("%d occurs %d %s\n", i, c, c > 1 ? "times" : "time");
            }
        }
    }
}
