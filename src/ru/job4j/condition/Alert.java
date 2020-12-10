package ru.job4j.condition;

public class Alert {
    public static void main(String[] args) {
    negativeNumber(-2);
    }

    public static void negativeNumber(int n) {
        if (n < 0) {
        System.out.println(n + " " + "is negative number");
        }
    }
}

