public class Faculty extends Employee {
    public String officeHours;
    public String rank;

    Faculty(String name, String address, String phoneNumber, String eMailAddress, String officeHours, String rank) {
        super(name, address, phoneNumber, eMailAddress);

        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty --> [Name: " + name + ", Address: " + address + ", Phone Number: " + phoneNumber + ", E-Mail Address: " + eMailAddress + ", Office Hours: " + officeHours + ", Rank: " + rank + "]";
    }
}
