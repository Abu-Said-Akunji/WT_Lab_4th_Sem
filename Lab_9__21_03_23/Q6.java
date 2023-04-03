/*Q6. Java program to create an abstract class with a static method */

abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayDetails();

    public static void sayHello() {
        System.out.println("Hello from Person");
    }
}

class Student extends Person {
    private int rollNumber;

    public Student(String name, int rollNumber) {
        super(name);
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 1234);
        student.displayDetails();
        Person.sayHello();
    }
}
