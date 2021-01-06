package ru.job4j.pojo;

import java.util.Date;

public class Police {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Albina");
        license.setCode("023D");
        license.setCreated(new Date());
        license.setModel("ASX");

     //   System.out.println(license.getOwner() + " has a car " + license.getModel() + ":" + license.getCode());
        System.out.println(license.getCreated());
    }
}
