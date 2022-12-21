public class Staff extends Employee {
    public String title;

    Staff(String name, String address, String phoneNumber, String eMailAddress, String title) {
        super(name, address, phoneNumber, eMailAddress);

        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff --> [Name: " + name + ", Address: " + address + ", Phone Number: " + phoneNumber + ", E-Mail Address: " + eMailAddress + ", Title: " + title + "]";
    }
}
