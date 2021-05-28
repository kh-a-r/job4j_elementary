package ru.job4j.stream;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class CollectClass {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
              return students.stream()
                .filter(predict)
                .collect(Collectors.toList());
    }

    public Map<String, List<Student>> listToMap(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getSurname));
    }

    public Map<String, List<Student>> convertToMap(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(Student::getSurname,
                        student -> student,
                        (st1, st2) -> {
                    List<Student> list = new ArrayList<>();
                        list.add((Student) st1);
                        list.add((Student) st2);
                        return list;
                }
                        ));
    }
}
