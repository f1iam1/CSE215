import java.util.Scanner;

/* Problem2: (Financials: currency exchange) Write a program that prompts the user to enter
the exchange rate from currency in U.S. dollars to Bangladeshi BDT. Prompt the user
to enter 0 to convert from U.S. dollars to Bangladeshi BDT and 1 to convert from
Bangladeshi BDT to U.S. dollars. Prompt the user to enter the amount in U.S. dollars
or Bangladeshi BDT to convert it to Bangladeshi BDT or U.S. dollars, respectively. */

public class prob2 {
    public static void main(String[] args) {
        System.out.print("Enter the exchange rate from currency in U.S. dollars to Bangladeshi BDT: ");
        Scanner in = new Scanner(System.in);
        double exchangeRate = in.nextDouble();

        System.out.print("Enter money amount: ");
        double money = in.nextDouble();

        while (true) {
            System.out.print(
                    "0. Convert from U.S. dollars to Bangladeshi BDT.\n1. Convert from Bangladeshi BDT to U.S. dollars.\n2. Exit.\nEnter(0-2): ");
            char option = in.next().charAt(0);

            switch (option) {
                case '0':
                    System.out.println("Conversion: " + (money * exchangeRate));
                    break;
                case '1':
                    System.out.println("Conversion: " + (money / exchangeRate));
                    break;
                case '2':
                    System.exit(2);
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }
}
