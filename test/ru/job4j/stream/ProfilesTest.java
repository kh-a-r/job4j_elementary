package ru.job4j.stream;

import org.junit.Test;
import ru.job4j.collection.NotifyAccount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
        Address address = new Address("Ufa", "Lenina", 1, 1);
        Address address1 = new Address("Ufa", "Lenina", 1, 2);
        List<Profile> profiles = Arrays.asList(
                new Profile(address),
                new Profile(address1)
        );
        Profiles addresses = new Profiles();
        List<Address> result = addresses.collect(profiles);
        List<Address> expected = List.of(
                new Address("Ufa", "Lenina", 1, 1),
                new Address("Ufa", "Lenina", 1, 2)
        );
        assertThat(result, is(expected));
    }

    @Test
    public  void cutClone() {
        Address address = new Address("Ufa", "Lenina", 1, 1);
        Address address1 = new Address("Ufa", "Lenina", 1, 1);
        List<Profile> profileList = Arrays.asList(
                new Profile(address),
                new Profile(address1)
        );
        Profiles profiles = new Profiles();
        List<Address> result = profiles.collect(profileList);
        assertThat(result.size(), is(1));
    }

    @Test
    public  void whenSortedAndClone() {
        Address address = new Address("Ufa", "Lenina", 1, 1);
        Address address1 = new Address("Ufa", "Lenina", 1, 1);
        Address address2 = new Address("Orel", "Lenina", 1, 1);
        List<Profile> profileList = Arrays.asList(
                new Profile(address),
                new Profile(address1),
                new Profile(address2)
        );
        Profiles profiles = new Profiles();
        List<Address> result = profiles.collect(profileList);
        List<Address> exp = Arrays.asList(
                new Address("Orel", "Lenina", 1, 1),
                new Address("Ufa", "Lenina", 1, 1)
        );
        assertThat(result, is(exp));
    }
}