/*
Q2. Define two packages as – General and Marketing. In General package
define a class “Employee‟ with data members as empid(protected),
ename(private) and a public method as earnings() which calculate total
earnings as
earnings = basic + DA (80% of basic) + HRA (15% of basic)
In Marketing package define a class „sales‟ which is extending from
“Employee‟ class and has a method tallowance() which calculates
Travelling Allowance as 5% of total earning. Write the programs to find out
total earning of a sales person for the given basic salary amount and print
along with the emp id.
 */

package General;
import java.util.*;
    
    public class employee {
        public int empid;
        private String ename;

        public float earnings(int empid, String ename, int basic) {
            float t = 1.95f * basic;
            System.out.println("\nEmployee ID = " + empid);
            System.out.println("Employee Name = " + ename);
            return t;
        }
    }
    

