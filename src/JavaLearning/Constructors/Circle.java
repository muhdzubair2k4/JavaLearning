package JavaLearning.Constructors;

import org.w3c.dom.ls.LSOutput;

public class Circle {
    //constructor overloading, setting default values
    double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double result = Math.PI*(radius*radius);
        System.out.printf("Area : %.2f\n", result);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(25);

        circle.area();
        circle1.area();
    }

}
