package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String certificate;
    private int endOfCertification;

    @SuppressWarnings("checkstyle:ParameterNumber")
    public Dentist(String name, String surname, String education, String birthday, String specialty, int salary, String certificate, int endOfCertification) {
        super(name, surname, education, birthday, specialty, salary);
        this.certificate = certificate;
        this.endOfCertification = endOfCertification;
    }

    public String getCertificate() {
        return certificate;
    }

    public int getEndOfCertification() {
        return endOfCertification;
    }

    public static void main(String[] args) {
        Dentist dentist = new Dentist("Zag", "Newman", "High", "12.12.1987", "Dentist", 1000, "Cardia", 2021);
    }

}
