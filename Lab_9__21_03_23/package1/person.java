// package1/Person.java
package package1;
public class person {
    private String name;
    String address;
    protected int age;
    public String phoneNumber;

    public person(String name, String address, int age, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    private void printName() {
        System.out.println("Name: " + name);
    }

    public void printAddress() {
        System.out.println("Address: " + address);
    }

    protected void printAge() {
        System.out.println("Age: " + age);
    }

    public void printPhoneNumber() {
        System.out.println("Phone Number: " + phoneNumber);
    }
}

