package JavaLearning.ClassesAndObjects;

public class Car {
    String make;
    int year;

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }
}

class MainCar {
    public static void main(String[] args) {
        Car toyota = new Car("Perius", 2018);
        Car Honda = new Car("Civic", 2022);

        System.out.println("Car Info");
        System.out.println("Car make: " + toyota.make);
        System.out.println("Car year: " + toyota.year);

        System.out.println("\nCar make: " + Honda.make);
        System.out.println("Car year: " + Honda.year);
    }
}
