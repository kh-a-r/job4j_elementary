package ru.job4j.converter;

public class Fit {
    public static double manWeight(double height){
        double rsl = (height - 100) * 1.15;
        return rsl;
    }
    public static double womanWeight(double height){
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
    public static void main(String[] args){
        int height = 166;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println(man);
        System.out.println(woman);
        }
    }

