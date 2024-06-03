package JavaQuiz;

// Define multiple interfaces
interface Animal {
    void eat();
}

interface Mammal {
    void run();
}

interface Pet {
    void play();
}

// Implement interfaces in various classes
class Dog implements Animal, Mammal, Pet {
    // Implement eat method from Animal interface
    public void eat() {
        System.out.println("Dog is eating");
    }

    // Implement run method from Mammal interface
    public void run() {
        System.out.println("Dog is running");
    }

    // Implement play method from Pet interface
    public void play() {
        System.out.println("Dog is playing");
    }
}

class Cat implements Animal, Mammal, Pet {
    // Implement eat method from Animal interface
    public void eat() {
        System.out.println("Cat is eating");
    }

    // Implement run method from Mammal interface
    public void run() {
        System.out.println("Cat is running");
    }

    // Implement play method from Pet interface
    public void play() {
        System.out.println("Cat is playing");
    }
}

public class InterfaceCode {
    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        // Call methods from different interfaces using polymorphism
        for (Animal animal : animals) {
            animal.eat(); // Output: Dog/Cat is eating
            if (animal instanceof Mammal) {
                ((Mammal) animal).run(); // Output: Dog/Cat is running
            }
            if (animal instanceof Pet) {
                ((Pet) animal).play(); // Output: Dog/Cat is playing
            }
            System.out.println(); // Separate output for each animal
        }
    }
}
