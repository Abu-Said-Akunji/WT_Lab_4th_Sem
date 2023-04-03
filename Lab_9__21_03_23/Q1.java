/*Q1. Illustrate the usage of abstract class with following Java classes –
    i) An abstract class “Student” with data members roll no, reg no and a abstract method course()
    ii) A subclass “Kiitian” with course() method implementation. */

class Q1 {
    public abstract class Student {
        private int rollNo;
        private String regNo;

        public Student(int rollNo, String regNo) {
            this.rollNo = rollNo;
            this.regNo = regNo;
        }

        public int getRollNo() {
            return rollNo;
        }

        public String getRegNo() {
            return regNo;
        }

        public abstract void course();
    }

    public class Kiitian extends Student {
        public Kiitian(int rollNo, String regNo) {
            super(rollNo, regNo);
        }

        public void course() {
            System.out.println("Undergraduate course: Bachelor of Science");
        }
    }
}