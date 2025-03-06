package org.example.tasks.inno.testing.stub;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@ToString
@EqualsAndHashCode
public class Student {

    @Getter
    @Setter
    private String name;
    private final List<Integer> grades = new ArrayList<>();
    private GradeChecker gradeChecker;


    public Student(String name, GradeChecker gradeChecker) {
        this.name = name;
        this.gradeChecker = gradeChecker;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    @SneakyThrows
    public void addGrade(int grade) {
        if (!gradeChecker.checkGrade(grade)) {
            throw new IllegalArgumentException(grade + " is wrong grade");
        }
        grades.add(grade);
    }
}



/*

    @SneakyThrows
    public int raiting() {
        return repo.getRaitingForGradeSum(
                grades.stream()
                        .mapToInt(x -> (int) x)
                        .sum()
        );
    }
 */








