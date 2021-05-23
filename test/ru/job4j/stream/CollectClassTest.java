package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;

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
        Predicate<Student> predicate = student -> student.getScore() > 70;
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
        Predicate<Student> predicate = student -> student.getScore() > 50 && student.getScore() <= 70;
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
        Predicate<Student> predicate = student -> student.getScore() <= 50;
        CollectClass collectClass = new CollectClass();
        List<Student> result = collectClass.collect(students, predicate);
        List<Student> expected = List.of(
                new Student(10, "St1"),
                new Student(50, "St2"),
                new Student(40, "St1")
        );
        assertThat(result, is(expected));
    }
}