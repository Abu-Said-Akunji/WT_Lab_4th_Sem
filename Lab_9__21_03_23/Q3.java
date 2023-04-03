/*Q3. Java program to create an abstract class with the constructor */
abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public abstract void makeSound();

	public String getName() {
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

public class Q3 {
	public static void main(String[] args) {
		Dog dog = new Dog("Buddy");
		dog.makeSound();
	}
}