import java.util.Scanner;

public class Employee {
    private int empId;
    private String empName;
    private double sal;
    private int yearsWorked;

    public void setEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
        System.out.print("Enter Annual Salary: ");
        sal = sc.nextDouble();
        System.out.print("Enter Years Worked: ");
        yearsWorked = sc.nextInt();
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Annual Salary: " + sal);
        System.out.println("Years Worked: " + yearsWorked);
    }

    public void getLoanEligibility() {
        if (yearsWorked <= 5) {
            System.out.println("Not eligible for loan (Less than 6 years of service).");
            return;
        }

        if (sal >= 15_00_000) {
            System.out.println("Eligible for loan: 7,00,000");
        } else if (sal >= 10_00_000) {
            System.out.println("Eligible for loan: 5,00,000");
        } else if (sal >= 6_00_000) {
            System.out.println("Eligible for loan: 2,00,000");
        } else {
            System.out.println("Not eligible for loan (Salary too low).");
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeDetails();
        System.out.println("\nEmployee Details:");
        emp.getEmployeeDetails();
        System.out.println("\nLoan Eligibility:");
        emp.getLoanEligibility();
    }
}
