package SOLID;

public class SRP_02 {

    public static class Employee {
        private int employeeID;
        private String name;
        private String designation;

        public Employee(int employeeID, String name, String designation) {
            this.employeeID = employeeID;
            this.name = name;
            this.designation = designation;
        }

        public int getEmployeeID() {
            return employeeID;
        }

        public String getName() {
            return name;
        }

        public String getDesignation() {
            return designation;
        }
    }

    public static class SalaryManager {
        public void updateSalary(Employee employee) {
            System.out.println("Updating salary for " + employee.getName() + " (ID: " + employee.getEmployeeID() + ")");
        }
    }

    public static class EmailService {
        public void sendMail(Employee employee) {
            System.out.println("Sending email to " + employee.getName() + " (" + employee.getDesignation() + ")");
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee(101, "Alice", "Software Engineer");

        SalaryManager salaryManager = new SalaryManager();
        EmailService emailService = new EmailService();

        System.out.println("Employee: " + employee.getName());
        System.out.println("Designation: " + employee.getDesignation());

        salaryManager.updateSalary(employee);
        emailService.sendMail(employee);
    }
}
