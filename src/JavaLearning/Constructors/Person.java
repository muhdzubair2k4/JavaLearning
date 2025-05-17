package JavaLearning.Constructors;

public class Person {
    //constructor
    String name;
    int age;

    public Person() {
        this("unknown", 0);
    }
    public Person(String name, int age) {
        this.name = (name != null) ? name : "unknown";
        this.age = (age >= 0) ? age : 0;
    }

    public void showDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Ali Raza", 19);
        person.showDetails();
        person1.showDetails();
    }
}
