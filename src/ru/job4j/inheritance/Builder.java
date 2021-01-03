package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String form;
    private String hardHat;

    public Builder(String name, String surname, String education, String birthday, String sertificateLevel, String form, String hardHat) {
        super(name, surname, education, birthday, sertificateLevel);
        this.form = form;
        this.hardHat = hardHat;
    }

    public String getForm() {
return form;
    }

    public String getHardHat() {
return hardHat;
    }

    public boolean workAtHeight() {
        return true;
    }
}

