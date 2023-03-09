/*Q1. Find the largest among 3 user entered nos. at the command prompt
using Java. */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int val1 = s.nextInt();
        int val2 = s.nextInt();
        int val3 = s.nextInt();
        if(val1>val2 && val2>val3){
            System.out.println(val1 + "is greater than" + val2 + "and " + val2 + "is greater than " + val3);
        }
        else if (val1 > val2 && val3 > val2 && val1 > val3) {
            System.out.println(val1 + "is greater than" + val3 + "and " + val3 + "is greater than " + val2);
        }
        else if (val1 > val2 && val3 > val2 && val1 > val3) {
            System.out.println(val1 + "is greater than" + val3 + "and " + val3 + "is greater than " + val2);
        }


        
    }
}