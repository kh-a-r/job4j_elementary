package ru.job4j.array;

public class IndexMaxElement {
    public static int getIndexMax(int[] array) {
        return  array[0] > array[array.length - 1] ? 0 : array.length - 1;
            }

    public static void main(String[] args) {
        System.out.println(getIndexMax(new int[] {5, 4, 3, 2, 1}));
    }
}
//В этом задании Вам необходимо расскомментировать код, добавить обращение к элементам массива по индексу и
// исправить небольшую ошибку. Метод должен вернуть индекс элемента который является
// максимальным из двух: первый элемент и последний элемент.