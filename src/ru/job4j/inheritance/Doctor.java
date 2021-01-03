package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String specialty;
    private int  salary;

    public Doctor(String name, String surname, String education, String birthday, String specialty, int salary) {
        super(name, surname, education, birthday);
        this.specialty = specialty;
        this.salary = salary;
    }

    public String getSpecialty() {
        return specialty;
    }

    public boolean canDoSurgery() {
        return true;
    }

    public static void main(String[] args) {

        Doctor doctor = new Doctor("Zag", "Newman", "High", "12.12.1987", "Dentist", 1000);
    }
}
