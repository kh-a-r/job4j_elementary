package ru.job4j.calculator;
import java.io.IOException;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
        public static double sumAndMultiply(double first, double second) {
            return sum(first, second)
                    + multiply(first, second);
        }

    public static double substractionAndDivision(double first, double second) {
        try {
            division(first, second);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
            return subtraction(first, second)
                    + division(first, second);
    }

    public static double allFunction(double first, double second) {
        try {
            division(first, second);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return subtraction(first, second)
                + division(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

        public static void main(String[] args) {
            System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
           System.out.println(allFunction(3, 0));
            System.out.println(substractionAndDivision(4, 0));
        }


}
