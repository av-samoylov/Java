package org.example.tasks.inno.oop.polimorfizm.student;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> basicGradeValidator = grade -> grade >= 2 && grade <= 5;

        Student student1 = new Student("Иван", basicGradeValidator);
        student1.addGrade(3);
        student1.addGrade(6);
        System.out.println(student1);

        Predicate<Integer> evenNumberValidator = grade -> grade >= 1 && grade <= 100000 && grade % 2 == 0;

        Student student2 = new Student("Мария", evenNumberValidator);
        student2.addGrade(88888);
        student2.addGrade(55);
        System.out.println(student2);
    }
}
