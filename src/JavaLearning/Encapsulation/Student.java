package JavaLearning.Encapsulation;

public class Student {
    private String name;
    private int rollNo;
    private double gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa > 0.0 && gpa < 4.0) {
            this.gpa = gpa;
        }
    }

}

class MainStudent  {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Zubair");
        s1.setRollNo(2412121);
        s1.setGpa(3.4);




        System.out.println("\nName : " + s1.getName());
        System.out.println("Roll No. : " + s1.getRollNo());
        System.out.println("GPA : " + s1.getGpa());
    }
}
