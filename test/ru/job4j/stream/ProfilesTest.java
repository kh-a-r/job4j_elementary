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
}