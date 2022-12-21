public class Person {
    public String name;
    public String address;
    public String phoneNumber;
    public String eMailAddress;

    Person(String name, String address, String phoneNumber, String eMailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMailAddress = eMailAddress;
    }

    @Override
    public String toString() {
        return "Person --> [Name: " + name + ", Address: " + address + ", Phone Number: " + phoneNumber + ", E-Mail Address: " + eMailAddress + "]";
    }
}
