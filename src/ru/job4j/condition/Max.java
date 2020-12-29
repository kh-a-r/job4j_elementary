package ru.job4j.condition;

public class Max {

    public int check(int first, int second) {
        int rsl = 0;
        if (first > second) {
            rsl = first;
        } else {
          rsl = second;
        }
        return rsl;
    }

    public int check(int first, int second, int third) {
        return check(
                check(first, second),
                third
        );
    }

    public int check(int first, int second, int third, int fourth) {
        return check(
                check(
                        check(first, second), third),
                fourth
        );
    }

    public static void main(String[] args) {
        Max num = new Max();
        int  rsl = num.check(-1, 1, 0, 0);
        System.out.println(rsl);
    }
}
