package Inheritance;

class Vehicle {
    void travel() {
        System.out.println("i will explore");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("i will start the car");
    }
}

class door extends Car {
    void open() {
        System.out.println("open the door");

    }

    // public class Multilevelinheritance{
    public static void main(String[] args) {
        door dr = new door();
        dr.open();
    }

}
