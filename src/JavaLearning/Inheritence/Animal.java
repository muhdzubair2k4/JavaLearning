package JavaLearning.Inheritence;



public class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        super.sound();
        System.out.println("Dog Barks");
    }


}

class MainAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
