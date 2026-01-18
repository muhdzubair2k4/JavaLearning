package JavaLearning.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    String email;
    int age;

    public Employee(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

}

public class QuestionEmployeeEmailFilter {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Zubair", "muhhzubairtariq@gmail.com", 22));
        employees.add(new Employee("Owais Raza", "owaisRaza69@hotmail.com", 30));
        employees.add(new Employee("Ali Raza", "aliraza420@gmail.com", 22));
        employees.add(new Employee("Burair Hassan", "bscs241269@szabist.pk", 21));

        for (Employee e : employees) {
            System.out.println("name: " + e.name + "\t\t\t email: " + e.email + "\t\t\t age: " + e.age);
        }





//        List<String> filteredNames = employees.stream()
//                .filter(employee -> employee.email.endsWith("@gmail.com"))
//                .map(employee -> employee.name)
//                .collect(Collectors.toList());


//        System.out.println(filteredNames);
    }
}