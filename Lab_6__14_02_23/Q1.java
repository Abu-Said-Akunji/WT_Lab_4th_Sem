/*Q1. Write a class file – box with three data members(length, width, height) and 
a method volume(). Also  implement  the  application  class  Demo  where  an object of the box 
class is created with user entered dimensions and volume is printed. */

import java.util.Scanner;

class Q1 {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of box:");
        double l = s.nextDouble();
        System.out.print("Enter the breadth of box:");
        double b = s.nextDouble();
        System.out.print("Enter height of box:");
        double h = s.nextDouble();

        double volume = l * b * h;

        System.out.print("Volume Of boxis:" + volume);

    }
}