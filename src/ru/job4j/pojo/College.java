package ru.job4j.pojo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class College {

    @SuppressWarnings("checkstyle:OperatorWrap")
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Anna");
        student.setLastName("Man");
        student.setMiddleName("Ivanovna");
        student.setGroup("4b");
     student.setCreated(LocalDate.now());

        System.out.println(student.getFirstName() + student.getMiddleName()
                +

                student.getLastName() + " зачислена в группу "
                +
                student.getGroup()
                +
                " c "
                +
                student.getCreated());
    }
}

