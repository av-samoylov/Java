package org.example.tasks.inno.testing;

import lombok.Getter;
import lombok.Setter;
import org.example.tasks.inno.testing.stub.StudentRepoMock;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    @Getter
    @Setter
    private String name;
    private List<Integer> grades = new ArrayList<>(); // Уточняем тип

    public Student(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades); // Возвращаем копию списка
    }

    public void addGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException(grade + " is wrong grade");
        }
        grades.add(grade);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.grades);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return Objects.equals(this.name, other.name)
                && Objects.equals(this.grades, other.grades);
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", marks=" + grades + '}';
    }


}

/*
public class Student {
    private String name;
    // Используем параметризованный список для хранения оценок
    private List<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Возвращаем неизменяемую копию списка оценок для защиты инкапсуляции
    public List<Integer> getGrades() {
        return Collections.unmodifiableList(grades);
    }

    public void addGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException(grade + " is wrong grade");
        }
        grades.add(grade);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.grades);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return Objects.equals(this.name, other.name)
                && Objects.equals(this.grades, other.grades);
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", marks=" + grades + '}';
    }
}
 */


