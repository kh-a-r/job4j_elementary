package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String language;
    private String frameworks;

    public Programmer(String name, String surname, String education, String birthday, String sertificateLevel, String language, String frameworks) {
        super(name, surname, education, birthday, sertificateLevel);
        this.language = language;
        this.frameworks = frameworks;
    }

    public String getLanguage() {
        return language;
    }

    public String getFrameworks() {
        return frameworks;
    }
}
