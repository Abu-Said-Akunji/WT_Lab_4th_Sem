/*Q1. calculate the perimeter of an equilateral triangle using static function.*/

import java.util.Scanner;

class Q1 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of the Triangle:");
        double a = s.nextDouble();
        double perimeter = Q1.area(a);
        System.out.println("perimeter of Triangle is: " + perimeter);
    }

    public static double area(double a) {
        double b = 3 * a;
        return b;
    }

}