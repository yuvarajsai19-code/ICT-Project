package Inheritance;//Hierarchial Inheritance

class Animal {
    void eating() {
        System.out.println("i will eat everything");
    }
}

class Deer extends Animal {
    void running() {
        System.out.println("i will run fast");
    }
}

class Cat extends Animal {
    void smell() {
        System.out.println("i can smell fish");
    }
}

public class Hierarchial {
    public static void main(String[] args) {
        Deer dr = new Deer();
        dr.running();
        Cat c = new Cat();
        c.smell();

        Animal an = new Deer();
        an.eating();
    }
}
