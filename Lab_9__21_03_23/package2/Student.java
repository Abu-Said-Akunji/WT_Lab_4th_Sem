// package2/Student.java
package package2;

import package1.person;

public class Student extends person {
    public Student(String name, String address, int age, String phoneNumber) {
        super(name, address, age, phoneNumber);
    }

    public void displayDetails() {
        // printName() is not visible because it is private
        // printAddress() is visible because it has default/package-private visibility
        // printAge() is visible because it is protected
        // printPhoneNumber() is visible because it is public
        printAddress();
        printAge();
        printPhoneNumber();
    }
}