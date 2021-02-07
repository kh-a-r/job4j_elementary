package ru.job4j.condition;

public class MaxTwo {

        public static int max(int left, int right) {
            int max = right;
            if (left < 0) {
                left = -left;
            }
            if (right < 0) {
                right = -right;
            }
            if (left >= right) {
                max = left;
            }
            return max;
        }
    }

