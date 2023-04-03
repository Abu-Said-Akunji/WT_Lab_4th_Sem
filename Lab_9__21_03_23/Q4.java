/*Q4. Java program to create an abstract class without any abstract method */

abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle", 5, 3);
        System.out.println("Shape name: " + rectangle.getName());
        System.out.println("Shape area: " + rectangle.getArea());
    }
}