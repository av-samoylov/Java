package org.example.tasks.inno.testing.stub;

public class StudentRepoMock implements StudentRepo {
    public int getRaitingForGradeSum(int sum) {
        return 10;
    }

    public long count() {
        return 0;
    }

    public void delete(Student entity) {
    }

    public void deleteAll(Interable<Student> entities) {
    }

    public Interable<Student> findAll() {
        return null;
    }

    public Student save(Student entity) {
        return null;
    }

    public Interable<Student> saveAll(Interable<Student> entities) {
        return null;
    }
}
