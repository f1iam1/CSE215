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
