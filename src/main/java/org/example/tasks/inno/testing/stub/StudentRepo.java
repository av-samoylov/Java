package org.example.tasks.inno.testing.stub;

public interface StudentRepo {
    int getRaitingForGradeSum(int sum);
    long count();
    void delete(Student entity);
    void deleteAll(Interable<Student> entities);
    Interable<Student> findAll();
    Student save(Student entity);
    Interable<Student> saveAll(Interable<Student> entities);
}
