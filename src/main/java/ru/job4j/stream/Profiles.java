package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(profile -> profile.getAddress())
                .collect(Collectors.toList());
    }

    public List<Address> cutClone(List<Address> addresses) {
                    return addresses.stream()
                    .sorted(Comparator.naturalOrder())
                    .distinct().collect(Collectors.toList());
        }
}
