/*
7.2
(Reverse the numbers entered) Write a program that reads ten integers and dis-
plays them in the reverse of the order in which they were read.

Enter 10 numbers: 1 2 3 4 5 6 7 8 9 10
Reverse 10 numbers: 10 9 8 7 6 5 4 3 2 1
*/

import java.util.Scanner;

public class p72 {
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers: ");
        int[] num = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            num[i] = scan.nextInt();
        }
        scan.close();

        System.out.print("Reverse 10 numbers: ");
        for (int i = 9; i > (-1); i--) {
            System.out.print(num[i] + " ");
        }
    }
}