package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double total(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + difference(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат сложения равен: " + sumAndMultiply(20, 10));
        System.out.println("Результат второго сложения равен: " + differenceAndDivision(10, 5));
        System.out.println("Результат общего сложения равен: " + total(40, 10));
    }
}
