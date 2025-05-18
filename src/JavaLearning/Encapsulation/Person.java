package JavaLearning.Encapsulation;

public class Person {
    private String name;
    public int age;;

    public String getName() {return name;}
    public int getAge() {return age;}
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cant be less than 0");
        }
        else {
            this.age = age;
        }
    }
}

class MainPerson{
    public static void main(String[] args){
        Person p1 = new Person();

        p1.setName("Zubair");
        p1.setAge(21);
        System.out.println("\nName : " + p1.getName());
        System.out.println("Age : " + p1.getAge());

        Person p2 = new Person();
        p2.setName("Ali");
        p2.setAge(22);
        System.out.println("\nName : " + p2.getName());
        System.out.println("Age : " + p2.getAge());
    }
}
