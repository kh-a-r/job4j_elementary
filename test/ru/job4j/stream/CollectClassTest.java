package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CollectClassTest {

    @Test
    public void whenCollectClassA() {
        List<Student> students = List.of(
                new Student(10, "St1"),
                new Student(50, "St2"),
                new Student(60, "St3"),
                new Student(80, "St4"),
                new Student(40, "St1")
        );
        Predicate<Student> predicate = student -> student.getScore() >= 70 && student.getScore() <= 100;
        CollectClass collectClass = new CollectClass();
        List<Student> result = collectClass.collect(students, predicate);
        List<Student> expected = List.of(
                new Student(80, "St4")
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenCollectClassB() {
        List<Student> students = List.of(
                new Student(10, "St1"),
                new Student(50, "St2"),
                new Student(60, "St3"),
                new Student(80, "St4"),
                new Student(40, "St1")
        );
        Predicate<Student> predicate = student -> student.getScore() >= 50 && student.getScore() < 70;
        CollectClass collectClass = new CollectClass();
        List<Student> result = collectClass.collect(students, predicate);
        List<Student> expected = List.of(
                new Student(60, "St3")
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenCollectClassV() {
        List<Student> students = List.of(
                new Student(10, "St1"),
                new Student(50, "St2"),
                new Student(60, "St3"),
                new Student(80, "St4"),
                new Student(40, "St1")
        );
        Predicate<Student> predicate = student -> student.getScore() < 50;
        CollectClass collectClass = new CollectClass();
        List<Student> result = collectClass.collect(students, predicate);
        List<Student> expected = List.of(
                new Student(10, "St1"),
                new Student(50, "St2"),
                new Student(40, "St1")
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenListTOMap() {
     List<Student> students = List.of(
                new Student(10, "Иванов"),
                new Student(19, "Иванов"),
                new Student(19, "Petrov")
        );
        CollectClass collectClass = new CollectClass();
        Map<String, List<Student>> rls = collectClass.listToMap(students);
        Map<String, List<Student>> exp = new HashMap<>();
        exp.put("Petrov", List.of(new Student(19, "Petrov")));
        exp.put("Иванов", List.of(new Student(10, "Иванов"),
                new Student(19, "Иванов")));
        assertThat(rls, is(exp));
    }
}