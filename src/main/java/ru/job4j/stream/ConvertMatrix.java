package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertMatrix {

    public List<Integer> matrixToList(Integer[][] matrix) {
return
    Stream.of(matrix)
            .flatMap(i -> Arrays.stream(i))
                .collect(Collectors.toList()
        );
    }
}
