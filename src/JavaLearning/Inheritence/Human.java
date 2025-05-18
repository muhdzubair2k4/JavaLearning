package JavaLearning.Inheritence;

public class Human {
    public Human() {
    }

    public void showDetail() {
        System.out.println("Detail of SZABIST");
    }
}

class Student extends Human {
    int studentId;
    String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void showDetail() {
        super.showDetail();
        System.out.println("Student Name : " + name);
        System.out.println("Student ID : " + studentId);
    }
}

class Teacher extends Human {
    String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }

    public void showDetail() {
        System.out.println("Teahcer Subject : " + subject);
    }
}

class GradStudent extends Student {

    String thesisTopic;

    public GradStudent(int studentId, String name, String thesisTopic) {
        super(studentId, name);
        this.thesisTopic = thesisTopic;
    }

    public void showDetail() {
        System.out.println("Student Id : "  + studentId);
        System.out.println("Name : " + name);
        System.out.println("Grade Student Thesis Topic is : " + thesisTopic);
    }
}

class MainHuman {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("OOP");
        Student student = new Student(221, "Ali Raza");
        GradStudent gradStudent = new GradStudent(111, "Zubair", "ObjectOrientedProgramming");

        teacher.showDetail();
        System.out.println("---------------------------------");
        student.showDetail();
        System.out.println("---------------------------------");
        gradStudent.showDetail();
    }
}
