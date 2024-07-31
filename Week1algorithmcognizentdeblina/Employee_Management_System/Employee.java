package Employee_Management_System;

public class Employee {
        private int eId;
        private String n;
        private String p;
        private double s;

        public Employee(int employeeId, String name, String position, double salary) {
            this.eId = employeeId;
            this.n = name;
            this.p = position;
            this.s = salary;
        }

        // Getters
        public int getEmployeeId() {
            return eId;
        }
        public String getName() {
            return n;
        }
        public String getPosition() {
            return p;
        }
        public double getSalary() {
            return s;
        }

        @Override
        public String toString() {
            return "Employee{" + "employeeId=" + eId + ", name='" + n + '\'' + ", position='" + p + '\'' + ", salary=" + s + '}';
        }
    }


