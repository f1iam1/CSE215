import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        int max = 0, count = 0;
        System.out.print("Enter integers: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n != 0) {
            if (max == n) {
                count++;
            }

            else if (max < n) {
                count = 1;
                max = n;
            }

            n = scan.nextInt();
        }
        scan.close();

        System.out.println("Max integer: " + max);
        System.out.println("Count: " + count);
    }
}