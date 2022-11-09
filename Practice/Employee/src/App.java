/*
Write a program that would print the information (name, year of joining, salary, address) of three employees 
by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam               2000                68D- WallsStreat
John              1999                26B- WallsStreat

 */

public class App {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee("Robert", 1994, 2362, "64C- WallsStreat");
        Employee e2 = new Employee("Sam", 2000, 4377, "68D- WallsStreat");
        Employee e3 = new Employee("John", 1999, 9837, "26B- WallsStreat");

        System.out.println("Name\t\tYear of joining\tSalary\t\tAddress");
        e1.printEmployee();
        e2.printEmployee();
        e3.printEmployee();
    }
}
