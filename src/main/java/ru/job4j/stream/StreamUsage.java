package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, -4, 5, 0, -3);
        List<Integer> positiveNumbers  = list.stream()
                .filter(x -> x > 0)
                .collect(Collectors.toList());
        positiveNumbers.forEach(System.out :: println);
    }
}
