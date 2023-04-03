/*Q7. Java program to show the use of different access specifiers in different
packages and show visibility control. */

import package1.person;
import package2.Student;

public class Q7 {
    public static void main(String[] args) {
        person person = new person("John Doe", "123 Main St", 30, "555-1234");
        person.printPhoneNumber();

        Student student = new Student("Jane Doe", "456 Oak St", 20, "555-5678");
        student.printPhoneNumber();
    }
}