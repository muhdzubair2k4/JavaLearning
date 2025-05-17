package JavaLearning.ClassesAndObjects;

import java.beans.PropertyEditorSupport;

public class Calculator {
    //method overloading and object interaction

    public void add (int a, int b){
        int result = a + b;
        System.out.println("Result : " + result);
    }

    public void add (double a, double b){
        double result = a + b;
        System.out.println("Result : " + result);
    }

    public void add (int a, int b, int c){
        int result = a + b +c;
        System.out.println("Result : " + result);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(5, 6);
        calculator.add(5.01, 6.02);
        calculator.add(5, 6, 9);



    }
}
