public class Employee extends Person {
    public String office;
    public double salary;
    public String dateHired;

    Employee(String name, String address, String phoneNumber, String eMailAddress, String office, double salary, String dateHired) {
        super(name, address, phoneNumber, eMailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(String name, String address, String phoneNumber, String eMailAddress) {
        super(name, address, phoneNumber, eMailAddress);
    }

    @Override
    public String toString() {
        return "Employee --> [Name: " + name + ", Address: " + address + ", Phone Number: " + phoneNumber + ", E-Mail Address: " + eMailAddress + ", Office: " + office + ", Salary: " + salary + ", Date Hired: " + dateHired + "]";
    }
}
