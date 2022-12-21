public class Student extends Person {
    public String classStatus;

    Student(String name, String address, String phoneNumber, String eMailAddress, String classStatus) {
        super(name, address, phoneNumber, eMailAddress);
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Student --> [Name: " + name + ", Address: " + address + ", Phone Number: " + phoneNumber + ", E-Mail Address: " + eMailAddress + ", Class Status: " + classStatus + "]";
    }
}
