import java.util.Random;
import Marketing.sales;
import General.employee;

public class Q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        sales[] salespersons = new sales[5];
        double basicPay = 50000;

        for (int i = 0; i < 5; i++) {
            int empid = rand.nextInt(9000) + 1000;
            String empname = "Salesperson " + (i + 1);
            salespersons[i] = new sales(empid, empname, basicPay);
        }

        System.out.println("Total earnings of salespersons:");
        for (int i = 0; i < 5; i++) {
            sales salesperson = salespersons[i];
            System.out.printf("Employee ID: %d, Total Earnings: %.2f, Travel Allowance: %.2f\n",
                    salesperson.empid, salesperson.earnings(), salesperson.travelAllowance());
        }
    }
}