/**
 * Output:
 * Person --> [Name: Karim, Address: Mirpur1, Phone Number: 26763543, E-Mail Address: stud5@mail.com]
 * Student --> [Name: Jarim, Address: Mirpur2, Phone Number: 26765353, E-Mail Address: stud4@mail.com, Class Status: junior]
 * Employee --> [Name: Borim, Address: Mirpur3, Phone Number: 26766353, E-Mail Address: stud3@mail.com, Office: lvl 2, Salary: 1500.0, Date Hired: May, 2, 1990]
 * Faculty --> [Name: Morim, Address: Mirpur4, Phone Number: 26776353, E-Mail Address: stud12@mail.com, Office Hours: 2, Rank: CEO]
 * Staff --> [Name: Rahim, Address: Mirpur6, Phone Number: 26763583, E-Mail Address: stud1@mail.com, Title: General]
 */

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Karim", "Mirpur1", "26763543", "stud5@mail.com");
        Student student = new Student("Jarim", "Mirpur2", "26765353", "stud4@mail.com", "junior");
        Employee employee = new Employee("Borim", "Mirpur3", "26766353", "stud3@mail.com", "lvl 2", 1500, "May, 2, 1990");
        Faculty faculty = new Faculty("Morim", "Mirpur4", "26776353", "stud12@mail.com", "2", "CEO");
        Staff staff = new Staff("Rahim", "Mirpur6", "26763583", "stud1@mail.com", "General");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }


}
