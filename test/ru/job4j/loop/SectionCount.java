package ru.job4j.loop;

public class SectionCount {
    public static int count(int lenght, int section) {
        int count = 0;
        while (lenght >= section) {
            lenght = lenght - section;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(SectionCount.count(1, 1));
    }
}
