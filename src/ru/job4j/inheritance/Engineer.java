package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String sertificateLevel;

    public Engineer(String name, String surname, String education, String birthday, String sertificateLevel) {
        super(name, surname, education, birthday);
        this.sertificateLevel = sertificateLevel;
    }

public boolean hasAccessToDangerousObjects() {
    return true;
}

public String getSertificateLevel() {
        return sertificateLevel;
}

    public static void main(String[] args) {
        Engineer engineer = new Engineer("Zag", "Newman", "High", "12.12.1987", "First");
    }

}
