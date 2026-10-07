package Inheritance;

class Human {
    void breath() {
        System.out.println("normal breathing");
    }
}

// contract number
interface Athlete {
    void run();
}

interface Student {
    public void study();
}

class Studentscholor extends Human implements Athlete, Student {
    public void run() {
        System.out.println("i will run at 25km/hour");
    }

    public void study() {
        System.out.println("studying java");
    }
}

public class Hybriddemo {
    public static void main(String[] args) {
        Studentscholor ss = new Studentscholor();
        ss.run();
        ss.study();
    }
}
