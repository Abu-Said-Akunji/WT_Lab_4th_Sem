//Q1. Program to print your name, roll no, section and branch in separate lines.

import java.util.Scanner;

class Q1
{
    public static void main(String[] args)
    {
        
        Scanner S = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = S.nextLine();
        System.out.print("Enter your section: ");
        String Sec = S.nextLine();
        System.out.print("Enter your rollno: ");
        int roll = S.nextInt();
        System.out.println("\nName is: " + name);
        System.out.println("Roll no. is: " + roll);
        System.out.println("Section is: " + Sec);
    }
}