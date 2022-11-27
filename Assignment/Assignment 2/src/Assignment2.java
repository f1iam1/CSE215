import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/*
Program is based on post 2019 Bangladesh's Official Bengali Calendar.
The range of this calendar program is 0-infinity, if the cpu can handle the
calculation.
 */

// Assignment2 Class Start
public class Assignment2 extends JFrame {
    // JLabel for days name in Bengali
    JLabel sun = new JLabel("\u09B0\u09AC\u09BF");
    JLabel mon = new JLabel("\u09B8\u09CB\u09AE");
    JLabel tue = new JLabel("\u09AE\u0999\u09CD\u0997\u09B2");
    JLabel wed = new JLabel("\u09AC\u09C1\u09A7");
    JLabel thu = new JLabel("\u09AC\u09C3\u09B9\u0983");
    JLabel fri = new JLabel("\u09B6\u09C1\u0995\u09CD\u09B0");
    JLabel sat = new JLabel("\u09B6\u09A8\u09BF");

    // JLabel for date in Bengali
    JLabel d1 = new JLabel("\u09E7");
    JLabel d2 = new JLabel("\u09E8");
    JLabel d3 = new JLabel("\u09E9");
    JLabel d4 = new JLabel("\u09EA");
    JLabel d5 = new JLabel("\u09EB");
    JLabel d6 = new JLabel("\u09EC");
    JLabel d7 = new JLabel("\u09ED");
    JLabel d8 = new JLabel("\u09EE");
    JLabel d9 = new JLabel("\u09EF");
    JLabel d10 = new JLabel("\u09E7\u09E6");
    JLabel d11 = new JLabel("\u09E7\u09E7");
    JLabel d12 = new JLabel("\u09E7\u09E8");
    JLabel d13 = new JLabel("\u09E7\u09E9");
    JLabel d14 = new JLabel("\u09E7\u09EA");
    JLabel d15 = new JLabel("\u09E7\u09EB");
    JLabel d16 = new JLabel("\u09E7\u09EC");
    JLabel d17 = new JLabel("\u09E7\u09ED");
    JLabel d18 = new JLabel("\u09E7\u09EE");
    JLabel d19 = new JLabel("\u09E7\u09EF");
    JLabel d20 = new JLabel("\u09E8\u09E6");
    JLabel d21 = new JLabel("\u09E8\u09E7");
    JLabel d22 = new JLabel("\u09E8\u09E8");
    JLabel d23 = new JLabel("\u09E8\u09E9");
    JLabel d24 = new JLabel("\u09E8\u09EA");
    JLabel d25 = new JLabel("\u09E8\u09EB");
    JLabel d26 = new JLabel("\u09E8\u09EC");
    JLabel d27 = new JLabel("\u09E8\u09ED");
    JLabel d28 = new JLabel("\u09E8\u09EE");
    JLabel d29 = new JLabel("\u09E8\u09EF");
    JLabel d30 = new JLabel("\u09E9\u09E6");
    JLabel d31 = new JLabel("\u09E9\u09E7");

    // JLabel for Bengali month names
    String month1 = "\u09AC\u09C8\u09B6\u09BE\u0996";
    String month2 = "\u099C\u09CD\u09AF\u09C8\u09B7\u09CD\u09A0";
    String month3 = "\u0986\u09B7\u09BE\u09A2\u09BC";
    String month4 = "\u09B6\u09CD\u09B0\u09BE\u09AC\u09A3";
    String month5 = "\u09AD\u09BE\u09A6\u09CD\u09B0";
    String month6 = "\u0986\u09B6\u09CD\u09AC\u09BF\u09A8";
    String month7 = "\u0995\u09BE\u09B0\u09CD\u09A4\u09BF\u0995";
    String month8 = "\u0985\u0997\u09CD\u09B0\u09B9\u09BE\u09AF\u09BC\u09A3";
    String month9 = "\u09AA\u09CC\u09B7";
    String month10 = "\u09AE\u09BE\u0998";
    String month11 = "\u09AB\u09BE\u09B2\u09CD\u0997\u09C1\u09A8";
    String month12 = "\u099A\u09C8\u09A4\u09CD\u09B0";

    // constructor for GUI creation
    public Assignment2(int day, int month, int year) {
        super();

        switch (month) {
            case 1 -> setTitle(month1);
            case 2 -> setTitle(month2);
            case 3 -> setTitle(month3);
            case 4 -> setTitle(month4);
            case 5 -> setTitle(month5);
            case 6 -> setTitle(month6);
            case 7 -> setTitle(month7);
            case 8 -> setTitle(month8);
            case 9 -> setTitle(month9);
            case 10 -> setTitle(month10);
            case 11 -> setTitle(month11);
            case 12 -> setTitle(month12);
        }

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        GridLayout g1 = new GridLayout(6, 7, 10, 10);
        panel.setLayout(g1);

        panel.add(sun);
        panel.add(mon);
        panel.add(tue);
        panel.add(wed);
        panel.add(thu);
        panel.add(fri);
        panel.add(sat);

        JLabel[] rows = new JLabel[6];

        // for printing blank spaces before the date 1
        for (int i = 0; i < day; i++) {
            rows[i] = new JLabel();
            panel.add(rows[i]);
        }

        panel.add(d1);
        panel.add(d2);
        panel.add(d3);
        panel.add(d4);
        panel.add(d5);
        panel.add(d6);
        panel.add(d7);
        panel.add(d8);
        panel.add(d9);
        panel.add(d10);
        panel.add(d11);
        panel.add(d12);
        panel.add(d13);
        panel.add(d14);
        panel.add(d15);
        panel.add(d16);
        panel.add(d17);
        panel.add(d18);
        panel.add(d19);
        panel.add(d20);
        panel.add(d21);
        panel.add(d22);
        panel.add(d23);
        panel.add(d24);
        panel.add(d25);
        panel.add(d26);
        panel.add(d27);
        panel.add(d28);
        panel.add(d29);

        // for month 11's extra day during leap year
        if (month < 11 || month == 12) {
            panel.add(d30);
        } else if (month == 11 && isLeapYear(year + 1)) {
            panel.add(d30);
        }

        if (month < 7) {
            panel.add(d31);
        }

        add(panel);
    }

    // main method start
    public static void main(String[] args) {
        programLoader();
    }

    public static void programLoader() {
        System.out.print("> Assignment2.java\n1. Assignment Part 1\n2. Assignment Part 2 \n0. Terminate JVM\n? ");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        switch (option) {
            case 0 -> System.exit(option);
            case 1 -> {
                System.out.println("> Assignment2.java/Assignment Part 1");
                consoleInput();
            }
            case 2 -> {
                System.out.println("> Assignment2.java/Assignment Part 2");
                totalASCIIValue();
            }
            default -> {
                System.out.println("Wrong input, try again!");
                programLoader();
            }
        }
    }

    public static void consoleInput() {
        System.out.print("1. CLI Calendar \n2. GUI Calendar\n3. Go Back \n0. Terminate JVM\n? ");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        int month = 0, year = 0;
        if (option == 1 || option == 2) {
            if (option == 1) {
                System.out.println("> Assignment2.java/Assignment Part 1/CLI Calendar");
            } else {
                System.out.println("> Assignment2.java/Assignment Part 1/GUI Calendar");
            }

            System.out.print("Enter a Year: ");
            year = scan.nextInt();
            while (year < 0) {
                System.out.print("Wrong entry, please Enter a Year: ");
                year = scan.nextInt();
            }

            System.out.print("Enter a Month: ");
            month = scan.nextInt();
            while (month > 12 || month < 1) {
                System.out.print("Wrong entry, please Enter a Month: ");
                month = scan.nextInt();
            }
        }

        intermediateLoader(option, month, year);
    }

    // Bengali calendar started on 593 CE and first Polhela Boishakh was on 594 CE
    public static boolean isLeapYear(int year) {
        year += 593;
        return (year & 3) == 0 && ((year % 25) != 0 || (year & 15) == 0);
    }

    public static int yearStartDay(int year) {
        int day = 0;

        for (int i = 0; i < year; i++) {
            if (day < 7) {
                if (isLeapYear(i)) {
                    day += 2;
                } else {
                    day++;
                }
            }

            if (day > 6) {
                if (day == 7) {
                    day = 0;
                } else if (isLeapYear(i)) {
                    day = 1;
                }
            }
        }
        return day;
    }

    public static int monthStartDayCalc(int day, int month, int incr) {
        for (int i = 0; i < month; i++) {
            if (day < 7) {
                day += incr;
            }

            if (day > 6) {
                if (day > 7) {
                    day = day - 7;
                } else {
                    day = 0;
                }
            }
        }
        return day;
    }

    public static int monthStartDay(int month, int year) {
        int day = yearStartDay(year);

        if (month > 1 && month < 7) {
            month--;
            day = monthStartDayCalc(day, month, 3);
        }

        if (month > 6) {
            int LastMonth = month - 7;
            day = monthStartDayCalc(monthStartDayCalc(day, 6, 3), LastMonth, 2);

            if (month == 12 && !isLeapYear(year + 1)) {
                day--;
            }
        }

        return day;
    }

    // part 1
    public static void printCLICalendar(int month, int year) {
        String[] dayArray = {"Robi", "Som", "Mongol", "Budh", "Brihospoti", "Shukro", "Shoni"};
        String[] monthArray = {"Boishakh", "Jyoishtho", "Asharh", "Shrabon", "Bhadro", "Ashshin", "Kartik", "Ogrohayon", "Poush", "Magh", "Falgun", "Choitro"};

        int day = monthStartDay(month, year);

        int monthDayCount = 30;
        if (month < 6) {
            monthDayCount = 31;
        } else if (month == 11 && !isLeapYear(year + 1)) {
            monthDayCount = 29;
        }

        System.out.println("Year: " + year);
        System.out.println("Month: " + monthArray[month - 1]);

        for (int i = 0; i < 7; i++) {
            System.out.print(dayArray[i] + "      ");
        }

        System.out.println();
        int count = 0;
        for (int i = 0; i < day; i++) {
            System.out.print("  " + "         ");
            count++;
        }

        for (int i = 1; i <= monthDayCount; i++) {
            if (i < 10) {
                System.out.print(" " + i + "         ");
            } else {
                System.out.print(i + "         ");
            }
            count++;

            if (count > 6) {
                count = 0;
                System.out.println();
            }
        }
    }

    // part 1 bonus
    public static void printGUICalendar(int month, int year) {
        int day = monthStartDay(month, year);

        Assignment2 calendar = new Assignment2(day, month, year);
    }

    // part 2
    public static void totalASCIIValue() {
        System.out.print("1. CLI Calendar \n2. GUI Calendar\n3. Go Back \n0. Terminate JVM\n? ");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        int month = 0, year = 0;
        if (option == 1 || option == 2) {
            System.out.print("Enter a Year: ");
            year = scan.nextInt();
            while (year < 0) {
                System.out.print("Wrong entry, please Enter a Year: ");
                year = scan.nextInt();
            }

            scan.nextLine();

            System.out.print("Input Name: ");
            String name = scan.nextLine();

            System.out.print("Student ID: ");
            String id = scan.next();

            int asciiTotal = 0;
            for (int i = 0; i < name.length(); i++) {
                asciiTotal += name.charAt(i);
            }

            for (int i = 0; i < id.length(); i++) {
                asciiTotal += id.charAt(i);
            }

            month = asciiTotal % 12;
        }

        intermediateLoader(option, month, year);
    }

    public static void intermediateLoader(int option, int month, int year) {
        switch (option) {
            case 0 -> System.exit(option);
            case 1 -> printCLICalendar(month, year);
            case 2 -> printGUICalendar(month, year);
            case 3 -> programLoader();
            default -> {
                System.out.println("Wrong input, try again!");
                consoleInput();
            }
        }
    }
}