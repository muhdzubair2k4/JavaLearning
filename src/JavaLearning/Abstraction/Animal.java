package JavaLearning.Abstraction;

abstract class Animal {
     public abstract void makeSound();
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog is screaming");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat Crying");
    }
}

class MainAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.makeSound();
        dog.makeSound();
    }
}