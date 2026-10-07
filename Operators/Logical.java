package Operators;

public class Logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("Logical&&operator:" + (condition1 && condition2));
        System.out.println("Logical || operator:" + (condition1 || condition2));
        int mark = 73;
        String result = (mark >= 75? "Distinction" : "First class");
        System.out.println("Result:" + result);

        // bitwise operator
        int a1 = 5;
        int b2 = 56;
        System.out.println("Bitwise (&) oprator : " + (a * b));
        System.out.println("Bitwise (|) oprator : " + (a1 | b2));

    }
}