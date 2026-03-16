package Java.JavaLearnings.PART1.MethodOverloading;

import java.util.*;

class Calculator {

    // Same name — 3 different signatures
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(1, 2); // compiler picks → add(int, int)
        c.add(1.0, 2.0); // compiler picks → add(double, double)
        c.add(1, 2, 3); // compiler picks → add(int, int, int)

    }
}
