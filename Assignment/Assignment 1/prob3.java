import java.util.Scanner;

/* Problem#3: (Science: wind-chill temperature) How cold is it outside? The temperature alone is
not enough to provide the answer. Other factors including wind speed, relative humidity, and
sunshine play important roles in determining coldness outside. In 2001, the National Weather
Service (NWS) implemented the new wind-chill temperature to measure the coldness using
temperature and wind speed. 

The formula is, twc= 35.74 + 0.6215ta - 35.75(v^0.16)+ 0.4275ta(v^0.16)
where t a is the outside temperature measured in degrees Fahrenheit, v is the speed measured
in miles per hour, and t wc is the wind-chill temperature. The formula cannot be used for wind
speeds below 2 mph or temperatures below -58°F or above 41°F.

Write a program that prompts the user to enter a temperature between -58°F and 41°F and a
wind speed greater than or equal to 2 then displays the wind-chill temperature. Use
Math.pow(a, b) to compute v^0.16 . 

Here is a sample run:
Enter the temperature in Fahrenheit between —58F and 41F: 5.3
Enter the wind speed (>= 2) in miles per hour: 6
The wind chill index is —5.56707 */

public class prob3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58\u00B0F and 41\u00B0F: ");
        double ta = scan.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double v = scan.nextDouble();
        scan.close();

        double twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);

        System.out.printf("The wind chill index is %.5f", twc);
    }
}
