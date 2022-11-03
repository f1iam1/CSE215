import java.util.Scanner;

/*
  7.5
(Print distinct numbers) Write a program that reads in ten numbers and displays
the number of distinct numbers and the distinct numbers separated by exactly one
space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
Read a number and store it to an array if it is new. If the number is already in the
array, ignore it.) After the input, the array contains the distinct numbers. Here is
the sample run of the program:

Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
The number of distinct number is 6
The distinct numbers are: 1 2 3 6 4 5
 */

public class p75 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int c = 0;

        System.out.print("Enter ten numbers: ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int n = scan.nextInt();
            boolean f = false;
            for (int j = 0; j < i; j++) {
                if (n == numbers[j]) {
                    f = true;
                    break;
                }
            }

            if (!f) {
                numbers[c] = n;
                c++;
            }
        }
        scan.close();

        System.out.println("The number of distinct number is " + c);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < c; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
