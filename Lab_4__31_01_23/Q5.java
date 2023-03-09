/*Q5. Write a program in Java to take first name and last name from user and
print both in one line as last name followed by first name. */

import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fname = scan.nextLine();
        System.out.print("Enter your lastname: ");
        String lname = scan.nextLine();
        System.out.println("Name is " + fname + " " + lname);
    }
}