package ru.job4j.array;

public class MaxFirstOrLastElement {
        public static int getMaxValue(int[] array) {
            return array[0] > array[array.length - 1] ? array[0] : array[array.length - 1];
        }

    public static void main(String[] args) {
        System.out.println(getMaxValue(new int[] {1, 3, 2}));
    }
    }

//Вам необходимо реализовать метод, который принимает массив целочисленных значений, сравнивает между собой первый и последний элемент и возвращает максимальное из двух значений.