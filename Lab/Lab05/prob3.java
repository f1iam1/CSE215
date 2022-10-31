/* Problem3: Write a program that takes input as year in the dialog box and displays whether that
year is leap year or not in another dialog box. */

import javax.swing.JOptionPane;

public class prob3 {
    public static void main(String[] args) {
        String year = JOptionPane.showInputDialog("Enter year");

        if (Integer.parseInt(year) % 400 == 0 || Integer.parseInt(year) % 4 == 0) {
            JOptionPane.showMessageDialog(null, "This is a leap year", year, 0);
        }

        else if (Integer.parseInt(year) % 100  == 0) {
            JOptionPane.showMessageDialog(null, "This is not a leap year", year, 0);
        }

        else {
            JOptionPane.showMessageDialog(null, "This is not a leap year", year, 0);
        }
    }
}
