/*Q5. Java program to create an abstract class with a final method */

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public final String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " barks");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound();
        System.out.println("Dog name: " + dog.getName());
    }
}