package Part1;
import java.util.ArrayList;

// Superclass
class Superclass {
    void theMethod() {
        System.out.println("Method of superclass");
    }
}

// Subclass extending Superclass
class Subclass extends Superclass {
    @Override
    void theMethod() {
        System.out.println("Method of subclass");
    }
}

public class Part1 {
    public static void main(String[] args) {
        Superclass a = new Subclass(); // Polymorphism
        a.theMethod(); // This will call the method of the subclass
    }
}
abstract class Animal {
    abstract void makeSound();
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Moo");
    }
}

class Pig extends Animal {
    @Override
    void makeSound() {
        System.out.println("Oink");
    }

    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Cow());
        // Add more animals as needed

        for (Animal animal : list) {
            animal.makeSound();
        }
    }
}
