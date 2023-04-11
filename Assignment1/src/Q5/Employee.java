package Q5;

import java.util.Scanner;

public class Employee {
    private int employeeNumber;
    private String employeeName;
    private Date joiningDate;

    public Employee(int employeeNumber, String employeeName, Date joiningDate) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.joiningDate = joiningDate;
    }

    public void display() {
        System.out.printf("%-20s %-20s %-20s\n", "Employee Number", "Employee Name", "Joining Date");
        System.out.printf("%-20d %-20s %-20s\n", employeeNumber, employeeName, joiningDate.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Employee Number: ");
            int employeeNumber = scanner.nextInt();

            System.out.print("Employee Name: ");
            String employeeName = scanner.next();

            System.out.println("Joining Date:");
            System.out.print("Day: ");
            int day = scanner.nextInt();
            System.out.print("Month: ");
            int month = scanner.nextInt();
            System.out.print("Year: ");
            int year = scanner.nextInt();

            Date joiningDate = new Date(day, month, year);

            Employee employee = new Employee(employeeNumber, employeeName, joiningDate);

            employees[i] = employee;
        }

        System.out.printf("%-20s%-20s%-20s\n", "Employee Number", "Employee Name", "Joining Date");

        for (Employee employee : employees) {
            employee.display();
        }
    }

}

