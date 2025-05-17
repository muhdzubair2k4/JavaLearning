package JavaLearning.ClassesAndObjects;

import java.net.Socket;

public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length) {
        this.length = length;
        this.width = 1;
    }

    public int area() {
        return length * width;
    }
}

class MainRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,6);
        Rectangle rectangle2 = new Rectangle(9);

        System.out.println("Area for 1st Triangle is " + rectangle.area());
        System.out.println("Area for 2nd Triangle is " + rectangle2.area());
    }

}
