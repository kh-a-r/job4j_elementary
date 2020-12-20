package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexOfIn(int[] data, int el, int start, int finish) {
        int rsl = -1;
        for (int i = start; i < finish; i++) {
            if (data[i] == el) {
                rsl = i;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(FindLoop.indexOf(new int[] {2, 3, 4, 5, 8}, 8));
        System.out.println(FindLoop.indexOfIn(new int[] {2, 3, 4, 5, 8}, 5, 2, 4));
    }
}

