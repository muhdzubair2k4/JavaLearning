package JavaLearning.Abstraction;

public abstract class Person {
    abstract void getDetails();
}

interface Workable {
    public void doWork();
}

class Employee extends Person implements Workable {

    String name;
    String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    void getDetails() {
        System.out.println("\nEmployee Name: " + name + "\nEmployee Role: " + role);
    }

    @Override
    public void doWork() {
        System.out.println("Employee is doing " + role + " related Work");
    }
}

class MainPerson {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ali Raza", "Sales Man");
        Employee employee2 = new Employee("Zubair", "Developer");
        employee1.getDetails();
        employee1.doWork();

        employee2.getDetails();
        employee2.doWork();
    }
}
