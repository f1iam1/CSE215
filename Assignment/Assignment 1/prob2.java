/* Problem#2: (Population projection) Bangladesh’s population growth is projected based on the
following assumptions:
■ One birth in every 1 minutes
■ One death in every 2 minutes
■ One negative net migrant every 8 minutes (One person leaves country)

Write a program to display the population for each of the next five years. Assume that the
current population is 167,288,486, and one year has 365 days (no leap year has to be
considered). Hint: In Java, if two integers perform division, the result is an integer. The fractional
part is truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate
result with the fractional part, one of the values involved in the division must be a number
with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5. */

public class prob2 {
    public static void main(String[] args) {
        int population = 167288486;

        double birth = 365 * 24 * 60;
        double populationAdded = birth - (birth / 2 + birth / 8);

        for (int i = 1; i <= 5; i++) {
            population += populationAdded;
            System.out.println(2022 + i + "'s population is " + population);
        }
    }
}