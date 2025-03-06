package testing;

import org.example.tasks.inno.testing.Student;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student student;

    @Test
    @DisplayName("Добавление оценки")
    public void testAddGrade() {
        Student student = new Student("John Doe");
        student.addGrade(4);
        List<Integer> grades = student.getGrades();
        assertEquals(1, grades.size());
        assertTrue(grades.contains(4));
    }

    @Test
    @DisplayName("Добавление нескольких оценок")
    public void testAddMultipleGrades() {
        Student student = new Student("John Doe");
        student.addGrade(4);
        student.addGrade(3);
        List<Integer> grades = student.getGrades();
        assertEquals(2, grades.size());
        assertTrue(grades.containsAll(List.of(4, 3)));
    }

    @Test
    @DisplayName("Добавление невалидной оценки")
    public void testInvalidGrade() {
        Student student = new Student("John Doe");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            student.addGrade(6);
        });
        assertEquals("6 is wrong grade", exception.getMessage());
    }

    @Test
    @DisplayName("Получение списка оценок")
    public void testGetGradesReturnsCopy() {
        Student student = new Student("John Doe");
        student.addGrade(5);
        List<Integer> grades = student.getGrades();
        grades.add(2); // Изменяем копию
        assertEquals(1, student.getGrades().size()); // Убедимся, что оригинальный список не изменился
    }

    @Test
    @DisplayName("Получение имени")
    public void testGetName() {
        Student student = new Student("John Doe");
        assertEquals("John Doe", student.getName());
    }

    @Test
    @DisplayName("Изменение имени")
    public void testSetName() {
        Student student = new Student("John Doe");
        student.setName("Jane Doe");
        assertEquals("Jane Doe", student.getName());
    }

    @Test
    @DisplayName("Тестирование equals и hashCode")
    public void testEqualsAndHashCode() {
        Student student1 = new Student("John Doe");
        student1.addGrade(5);
        Student student2 = new Student("John Doe");
        student2.addGrade(5);
        assertEquals(student1, student2);
        assertEquals(student1.hashCode(), student2.hashCode());
    }

    @Test
    @DisplayName("Тестирование toString")
    public void testToString() {
        Student student = new Student("John Doe");
        student.addGrade(5);
        assertEquals("Student{name=John Doe, marks=[5]}", student.toString());
    }
}




/*

public class StudentTest {

    // Проверяем, что оценки корректно добавляются и возвращаются
    @Test
    public void testAddGradeAndGetGrades() {
        Student student = new Student("John");
        student.addGrade(3);
        student.addGrade(5);
        List<Integer> grades = student.getGrades();
        assertEquals(2, grades.size());
        assertTrue(grades.contains(3));
        assertTrue(grades.contains(5));
    }

    // Проверяем инкапсуляцию: попытка модификации возвращаемого списка должна выбросить UnsupportedOperationException
    @Test
    public void testGetGradesEncapsulation() {
        Student student = new Student("Alice");
        student.addGrade(4);
        List<Integer> grades = student.getGrades();
        assertThrows(UnsupportedOperationException.class, () -> grades.add(5));
    }

    // Проверяем, что при добавлении некорректной оценки выбрасывается исключение
    @Test
    public void testIllegalGrade() {
        Student student = new Student("Bob");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> student.addGrade(1));
        String expectedMessage = " is wrong grade";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    // Проверяем методы equals() и hashCode()
    @Test
    public void testEqualsAndHashCode() {
        Student student1 = new Student("Charlie");
        student1.addGrade(3);
        student1.addGrade(4);

        Student student2 = new Student("Charlie");
        student2.addGrade(3);
        student2.addGrade(4);

        assertEquals(student1, student2);
        assertEquals(student1.hashCode(), student2.hashCode());
    }

    // Проверяем корректность метода toString()
    @Test
    public void testToString() {
        Student student = new Student("David");
        student.addGrade(2);
        String result = student.toString();
        assertTrue(result.contains("David"));
        assertTrue(result.contains("2"));
    }



 */




