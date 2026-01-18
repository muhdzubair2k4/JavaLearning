package JavaLearning.Encapsulation;

class Car {
    private String carModel;

    public String getCarModel() {return carModel;}
    public void setCarModel(String carModel) {this.carModel = carModel;}

    class Engine {
        private int engineNumber;

        public int getEngineNumber() {return engineNumber;}
        public void setEngineNumber(int engineNumber) {this.engineNumber = engineNumber;}

    }
}

class MainCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setCarModel("Toyota");

        Car.Engine e1 = c1.new Engine();
        e1.setEngineNumber(10238932);

        System.out.println("Car Model : " + c1.getCarModel());
        System.out.println("Car Engine : " + e1.getEngineNumber());

    }
}
