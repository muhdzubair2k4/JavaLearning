package JavaLearning.Constructors;

public class Student {
    String name;
    int rollNo;
    String Grade;

    public Student(String name, int rollNo) {
        this(name, rollNo, "A");
    }

    public Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        Grade = grade;
    }

    public void show() {
        System.out.println("Name : " + name + "\t\tRoll No : " + rollNo + "\t\tGrade : " + Grade);
    }
    public static void main(String[] args) {
        Student student = new Student("Ali Raza", 221);
        Student student1 = new Student("Zubair", 221, "B");

        student.show();
        student1.show();
    }
}
