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

    public static void main(String[] args) {
        Integer[][] array = new Integer[][] {
                {1, 2, 3},
                {4, 5, 6},
                {6, 7, 8}
        };
        ConvertMatrix convertMatrix = new ConvertMatrix();
        List<Integer> list = convertMatrix.matrixToList(array);
        System.out.println(list);
    }
}
