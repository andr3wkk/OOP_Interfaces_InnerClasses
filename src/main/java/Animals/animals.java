package Animals;
import java.util.ArrayList;

interface SoundMaker {
    void makeSound();
}

abstract class Animal implements SoundMaker {
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}

class Pig extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Oink");
    }
}

abstract class Insect implements SoundMaker {
}

class Bee extends Insect {
    @Override
    public void makeSound() {
        System.out.println("Buzz");
    }
}

class Cricket extends Insect {
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }
}

abstract class Amphibian implements SoundMaker {
}

class Frog extends Amphibian {
    @Override
    public void makeSound() {
        System.out.println("Ribbet");
    }
    public static void main(String[] args) {
        ArrayList<SoundMaker> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Cow());
        list.add(new Bee());
        list.add(new Cricket());
        list.add(new Frog());

        for (SoundMaker maker : list) {
            maker.makeSound();
        }
    }
}
