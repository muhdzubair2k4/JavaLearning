package JavaLearning.ClassesAndObjects;

public class Student {
    private String name;
    private int marks;

    public String getName() {return name;}
    public int getMarks() {return marks;}

    public void setName(String name) {this.name = name;}


    public void setMarks(int marks) {
        if (marks >= 0) {
            this.marks = marks;
        } else {
            System.out.println("Marks Cant be negative");
        }
    }
}

class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("Ali Raza");
        student2.setName("Zubair");

        student1.setMarks(98);
        student2.setMarks(-1);

        System.out.println("Students Marks");
        System.out.println("Name : " + student1.getName() + "\t\tMarks : " + student1.getMarks());
        System.out.println("Name : " + student2.getName() + "\t".repeat(2) + "Marks : " + student2.getMarks());


    }
}
