package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nic) {
int month = 0;
while (ivan > nic) {
    ivan *= 3;
    month++;
}
return month;
    }

    public static void main(String[] args) {
        System.out.println(Fitness.calc(90,  100));
    }
}
