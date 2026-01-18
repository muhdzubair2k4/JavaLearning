package JavaLearning.CollectionFrameworks;

import java.util.ArrayList;


class Student {
    String name;
    double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
}
public class ComparatorExamp {
    public static void main(String[] args) {




//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("Zubair", 3.5));
//        students.add(new Student("Ali Raza", 3.9));
//        students.add(new Student("Waqar", 4));
        // ******************** COMPARE BY GPA - ASCENDING *******************
//        students.sort((a, b) -> Double.compare(a.gpa, b.gpa));
//        for (Student c : students) {
//            System.out.println(c.name + " - " + c.gpa);
//        }
        // ******************** COMPARE BY GPA - DESCENDING *******************
//        students.sort((a, b) -> Double.compare(b.gpa , a.gpa));
//        for (Student c : students) {
//            System.out.println(c.name + " - " + c.gpa);
//        }

        // ******************** COMPARE BY NAME - ASCENDING *******************
//        students.sort((a, b) -> a.name.compareTo(b.name));
//        for (Student c : students) {
//            System.out.println(c.name + " - " + c.gpa);
//        }
        // ******************** COMPARE BY NAME - DESCENDING *******************
//        students.sort((a, b) -> b.name.compareTo(a.name));
//        for (Student c : students) {
//            System.out.println(c.name + " - " + c.gpa);
//        }



//        ArrayList<String> List = new ArrayList<>();
//        List.add("Zubair");
//        List.add("Ali Raza");
//        List.add("Waqar Ahmed");

        // *************** DECENDING SORTING ***************
//        List.sort((a, b) ->b.compareTo(a));
//        System.out.println(List);

        //*************** ASCENTDING SORTING ***************
//        List.sort((a, b) -> a.compareTo(b));
//        System.out.println(List);

    }
}
