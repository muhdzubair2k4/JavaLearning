package JavaLearning.Abstraction;

abstract class Vehicle {
    public Vehicle() {
        System.out.println("Vehicle Created");
    }

    public void startEngine() {
        System.out.println("Engine Started");
    }


    abstract void move();
}

class Bike extends Vehicle {

    @Override
    void move() {
        System.out.println("Bike is moving");
    }
}

class MainVehicle {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.startEngine();
        bike.move();
    }
}
