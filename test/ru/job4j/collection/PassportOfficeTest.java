package ru.job4j.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void addDublicate() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizenDubl = new Citizen("2f44a", "Ivan Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        office.add(citizenDubl);
        assertThat(office.get(citizenDubl.getPassport()).getUsername(), is(citizen.getUsername()));
    }

}