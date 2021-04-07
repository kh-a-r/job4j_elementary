package ru.job4j.collection;

import java.util.Comparator;

public class SortByAge implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        int rsl = 0;
        if (o1.getName().equals(o2.getName())) {
            int difference = o1.getAge() - o2.getAge();
            if (difference > 0) {
                rsl =  1;
            } else {
                rsl =  -1;
            }
        }
        return rsl;
    }
}
