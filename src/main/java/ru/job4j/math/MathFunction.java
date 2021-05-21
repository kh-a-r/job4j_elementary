package ru.job4j.math;

import java.io.IOException;

public class MathFunction {
    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double subtraction(double first, double second) {
        return first - second;
    }

    public static double division(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Exception: second operand = 0!");
        }
        return first / second;
    }

    public static void main(String[] args) {
        System.out.println(MathFunction.division(4, 0));

    }
}
