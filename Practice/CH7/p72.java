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