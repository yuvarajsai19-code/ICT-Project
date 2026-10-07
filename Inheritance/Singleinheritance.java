package Inheritance;

class Animal {
    void eating() {
        System.out.println("i will eat everything");
    }
}

class Deer extends Animal {
    void running() {
        System.out.println("i will run fast");
    }

    void eating() {
        System.out.println("only non veg");
    }
}

public class Singleinheritance {

    public static void main(String[] args) {
        Deer dr = new Deer();
        dr.running();

        Animal an = new Deer();
        an.eating();
    }
}
