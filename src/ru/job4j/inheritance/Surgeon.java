package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int surgeryInDay;

    public Surgeon(String name, String surname, String education, String birthday, String specialty, int salary, int surgeryInDay) {
        super(name, surname, education, birthday, specialty, salary);
        this.surgeryInDay = surgeryInDay;
    }

    public int getSurgeryInDay() {

        return surgeryInDay;
    }

    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon("Zag", "Newman", "High", "12.12.1987", "DEntist", 1000, 4);
    }
}