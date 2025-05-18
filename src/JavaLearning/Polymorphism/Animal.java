package JavaLearning.Polymorphism;

public class Animal {
    public void speak() {
        System.out.println("Animal Speaks");
    }

}

class Cat extends Animal {
    public void speak() {
        System.out.println("Cat Meows");
    }
}

class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.speak();
    }
}
