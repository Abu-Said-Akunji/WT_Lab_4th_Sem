package Marketing;

import java.util.*;

public class sales extends General.employee {
    public sales(int empid, String empname, double basicPay) {
    }

    float tallowance(float t) {
        return (0.05f * t);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID : ");
        int empid = Integer.parseInt(sc.nextLine());
        System.out.print("Enter employee Name : ");
        String ename = sc.nextLine();
        System.out.print("Enter basic salary : ");
        int basic = Integer.parseInt(sc.nextLine());
        sales obj = new sales(basic, ename, basic);
        float t = obj.earnings(empid, ename, basic);
        System.out.println("Total Earnings = " + t);
        System.out.println("Travelling Allowance = " + obj.tallowance(t));
    }

    public Object earnings() {
        return null;
    }

    public Object travelAllowance() {
        return null;
    }
}