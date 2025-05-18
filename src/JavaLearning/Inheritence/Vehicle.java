package JavaLearning.Inheritence;

public class Vehicle {
    public Vehicle() {
        System.out.println("Vehcle constructor called");
    }
}

class Car extends Vehicle {
    public Car() {
        super();
        System.out.println("Car constructor Called");
    }
}

class SportsCar extends Vehicle {
    public SportsCar() {
        super();
        System.out.println("SportsCar construcor Called");
    }
}

class MainVehicle {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();

    }
}
