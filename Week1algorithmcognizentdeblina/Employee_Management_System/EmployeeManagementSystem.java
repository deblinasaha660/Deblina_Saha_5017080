package Employee_Management_System;

public class EmployeeManagementSystem {
        private Employee[] employees;
        private int size;
        private static final int DEFAULT_CAPACITY = 10;

        public EmployeeManagementSystem() {
            employees = new Employee[DEFAULT_CAPACITY];
            size = 0;
        }

        public void addEmployee(Employee employee) {
            if (size == employees.length) {
                // Resize array if full
                Employee[] newArray = new Employee[employees.length * 2];
                System.arraycopy(employees, 0, newArray, 0, employees.length);
                employees = newArray;
            }
            employees[size++] = employee;
        }

        public Employee searchEmployee(int employeeId) {
            for (int i = 0; i < size; i++) {
                if (employees[i].getEmployeeId() == employeeId) {
                    return employees[i];
                }
            }
            return null;
        }

        public void traverseEmployees() {
            for (int i = 0; i < size; i++) {
                System.out.println(employees[i]);
            }
        }

        public boolean deleteEmployee(int employeeId) {
            for (int i = 0; i < size; i++) {
                if (employees[i].getEmployeeId() == employeeId) {
                    // Move the last employee to this position
                    employees[i] = employees[size - 1];
                    employees[size - 1] = null;
                    size--;
                    return true;
                }
            }
            return false;
        }

        public int getSize() {
            return size;
        }
    }

