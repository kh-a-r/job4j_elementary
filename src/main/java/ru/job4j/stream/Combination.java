package ru.job4j.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Combination {
    public static void main(String[] args) {
        Stream.of(Value.values())
                .flatMap(s -> Stream.of(Suit.values())
                .map(v -> v + " " + s))
               .collect(Collectors.toList())
                 .forEach(System.out::println);
    }
}
