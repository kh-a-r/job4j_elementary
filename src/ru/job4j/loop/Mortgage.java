package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
       int year1 = 0;

        while (salary < amount) {
            double restEndYear = (amount + amount * percent) - salary;
            amount = restEndYear;
            year1++;
        }
        return  year1;
    }

    public static void main(String[] args) {
        System.out.println(Mortgage.year(100, 70, 50));
    }
}
