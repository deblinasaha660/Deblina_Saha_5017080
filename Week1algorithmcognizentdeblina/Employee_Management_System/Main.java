package Employee_Management_System;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.addEmployee(new Employee(1, "Ankita Karmakar", "Developer", 75000));
        ems.addEmployee(new Employee(2, "Rahul Smith", "Manager", 95000));
        ems.addEmployee(new Employee(3, "Boby Dewol", "Designer", 65000));

        System.out.println("Employees after adding:");
        ems.traverseEmployees();

        Employee found = ems.searchEmployee(2);
        System.out.println("\nSearched employee: " + (found != null ? found : "Not found"));

        boolean deleted = ems.deleteEmployee(1);
        System.out.println("\nEmployee deleted: " + deleted);

        System.out.println("\nEmployees after deletion:");
        ems.traverseEmployees();
    }
}