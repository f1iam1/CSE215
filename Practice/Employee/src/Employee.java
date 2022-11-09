public class Employee {
    String name;
    int yearOfJoining;
    int salary;
    String address;

    Employee(String name, int yearOfJoining, int salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    void printEmployee() {
        System.out.println(name + "\t\t" + yearOfJoining + "\t\t" + salary + "\t\t" + address);
    }
}