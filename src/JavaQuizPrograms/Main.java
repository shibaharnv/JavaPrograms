package JavaQuizPrograms;

class Animal {
    String name;
    int age;

    // Static block
    static {
        System.out.println("Animal Static Block");
    }

    // Instance initializer block
    {
        System.out.println("Animal Initializer Block");
    }

    // No-argument constructor
    Animal() {
        System.out.println("Animal Constructor");
    }

    // Parameterized constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal Parameterized Constructor: " + name + ", " + age);
    }

    void displayInfo() {
        System.out.println("Animal Info: " + name + ", " + age);
    }
}

class Mammal extends Animal {
    String habitat;

    // Static block
    static {
        System.out.println("Mammal Static Block");
    }

    // Instance initializer block
    {
        System.out.println("Mammal Initializer Block");
    }

    // No-argument constructor
    Mammal() {
        //super();
        System.out.println("Mammal Constructor");
    }

    // Parameterized constructor
    Mammal(String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
        System.out.println("Mammal Parameterized Constructor: " + habitat);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Mammal Habitat: " + habitat);
    }
}

class Dog extends Mammal {
    String breed;

    // Static block
    static {
        System.out.println("Dog Static Block");
    }

    // Instance initializer block
    {
        System.out.println("Dog Initializer Block");
    }

    // No-argument constructor
    Dog() {
        //super();
        System.out.println("Dog Constructor");
    }

    // Parameterized constructor
    Dog(String name, int age, String habitat, String breed) {
        super(name, age, habitat);
        this.breed = breed;
        System.out.println("Dog Parameterized Constructor: " + breed);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Dog Breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating a Dog with no arguments:");
        Dog dog1 = new Dog();
        dog1.displayInfo();

        System.out.println("\nCreating a Dog with parameters:");
        Dog dog2 = new Dog("Buddy", 5, "Domestic", "Golden Retriever");
        dog2.displayInfo();
    }
}
