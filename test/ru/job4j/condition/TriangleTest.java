package ru.job4j.condition;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    // все настроено, и до меня прекрасно работало.
    // чтобы делать импорты - ставите на тот метод которого не хватает курсор, сочетание клавиш alt+enter - и выбираете нужный вариант, все необходимые библиотеки в проекте есть
    //ок ) спасибо
    // только комментарии удалите прежде чем заливать на гитхаб, отключаюсь
    @Test
    public void whenExist() {
        boolean rslt = Triangle.exist(2, 2, 2);

        assertThat(rslt, is(true));
    }

    @Test
    public void whenNotExist() {
        boolean rslt = Triangle.exist(10, 2, 3);

        assertThat(rslt, is(false));
    }
}