import java.util.Scanner;

/* Problem:1 Suppose you shop for miniket rice in four different packages. You would like to write
a program to compare the cost. The program prompts the user to enter the weight and price of
each package and displays the one with the best deal.. */

public class prob1 {
    public static void main(String[] args) {
        double[] miniket = new double[4];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter rice package " + (i + 1) + " weight(kg) & price(taka): ");
            double weight = in.nextDouble();
            double price = in.nextDouble();

            miniket[i] = price / weight;

        }
        in.close();

        double best = 0;
        int pack = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                if (miniket[i] > miniket[j]) {
                    best = miniket[j];
                    pack = j + 1;
                }
            }
        }

        System.out.println("The best deal is package " + pack + ", price of 1kg rice is " + best + " taka.");
    }
}