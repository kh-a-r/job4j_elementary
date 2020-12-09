package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k){
        double rslt = p / (2 * (k + 1)) * p / (2 * (k + 1)) * k;
        return rslt;
    }
    public static void main(String[] args){
        System.out.println(square(6, 2));
    }
}
