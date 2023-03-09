/*Q4. wap in Java to compute the elctricity bill as per the following :
if(units<100)
        billpay=units*1.20;
    else if(units<=300)
        billpay=100*1.20+(units-100)*2;
    else if(units>300)
        billpay=100*1.20+200 *2+(units-300)*3;
    return billpay;*/

import java.util.*;

class Q4 {
    public static void main(String args[]) {
        int units;

        double billToPay = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of units for calculating electricity bill.");
        units = sc.nextInt();

        if (units < 100) {
            billToPay = units * 1.20;
        } else if (units <= 300) {
            billToPay = 100 * 1.20 + (units - 100) * 2;
        } else if (units > 300) {
            billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
        }
        System.out.println("The electricity bill for " + units + " is : " + billToPay);
    }
}