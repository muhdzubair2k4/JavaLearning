package JavaLearning.Inheritence;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    String name;

    public Employee(String superName, String employeeName) {
        super(superName);
        this.name = employeeName;

    }

    public void display() {
        System.out.println("Employee name is : " + name);
        System.out.println("Parents Class name : " + super.name);
    }
}

class MainPerson {
    public static void main(String[] args) {
        Employee employee = new Employee("Ali Raza", "Zubair");
        employee.display();
    }
}
