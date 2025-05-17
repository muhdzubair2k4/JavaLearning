package JavaLearning.Constructors;

public class Employee {
    int empId;
    String empName;
    double salary;

    public Employee() {
    }

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        this.salary = 10000;
    }

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("\nEmployee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Employee(111, "Ali Raza");
        Employee employee2 = new Employee(222, "Zubair", 150000);

        employee.displayEmployee();
        employee1.displayEmployee();
        employee2.displayEmployee();

    }
}
