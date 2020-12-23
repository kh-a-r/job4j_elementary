package ru.job4j.condition;

public class AttackRock {
        public static boolean check(String left, String right) {
            boolean rsl = false;
            for (int i = 0; i < left.length(); i++) {
                if (left.charAt(i) == right.charAt(i)) {
                    rsl = true;
                }
            }
            return rsl;
        }

    public static void main(String[] args) {
        System.out.println(check("A8", "E2"));
    }
}
