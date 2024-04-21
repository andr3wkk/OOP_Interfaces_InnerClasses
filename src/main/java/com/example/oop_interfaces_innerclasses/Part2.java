package com.example.oop_interfaces_innerclasses;
public class Part2 {

    private int outerField = 10;

    // Inner class
    public class InnerClass {
        public void display() {
            System.out.println("Inner class method. Outer field: " + outerField);
        }
    }

    public void localClassMethod() {
        class LocalClass {
            public void display() {
                System.out.println("Local class method. Outer field: " + outerField);
            }
        }

        LocalClass local = new LocalClass();
        local.display();
    }

    public void anonymousClassMethod() {
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class method. Outer field: " + outerField);
            }
        };

        anonymous.run();
    }

    public static void main(String[] args) {
        // Creating an instance of the outer class
        Part2 outer = new Part2();

        Part2.InnerClass inner = outer.new InnerClass();
        inner.display();

        outer.localClassMethod();

        outer.anonymousClassMethod();
    }
}

