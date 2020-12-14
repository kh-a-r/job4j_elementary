package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second) {
            if (first > third) {
                result = first;
            } else {
                result = third;
            }
        } else {
            if (second > third) {
                result = second;
            } else {
                result = third;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MultiMax.max(2, 3, 4));
        System.out.println(MultiMax.max(6, 4, 3));
        System.out.println(MultiMax.max(6, 7, 3));
        System.out.println(MultiMax.max(6, 6, 6));

    }
}
