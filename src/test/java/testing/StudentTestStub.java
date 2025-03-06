package testing;
import org.example.tasks.inno.testing.stub.GradeChecker;
import org.example.tasks.inno.testing.stub.Student;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class StudentTestStub {

    @Test
    public void testAddValidGrade() {
        GradeChecker gradeChecker = Mockito.mock(GradeChecker.class);
        Mockito.when(gradeChecker.checkGrade(5)).thenReturn(true);
        Student student = new Student("John Doe", gradeChecker);
        student.addGrade(5);
        assertEquals(1, student.getGrades().size());
        assertEquals(5, student.getGrades().get(0));
    }

    @Test
    public void testAddInvalidGrade() {
        GradeChecker gradeChecker = Mockito.mock(GradeChecker.class);
        Mockito.when(gradeChecker.checkGrade(3)).thenReturn(false);
        Student student = new Student("John Doe", gradeChecker);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            student.addGrade(3);
        });
        assertEquals("3 is wrong grade", exception.getMessage());
    }
}


//
//    @Test
//   public void testRaiting() {
//        Student student = new Student("Jon");
//        student.addGrade(5);
//        StudentRepo repo = Mockito.mock(StudentRepo.class);
//        Mockito.when(repo.getRaitingForGradeSum(Mockito.any())).thenReturn(10);
//        student.setRepo(repo);
//        assertEquals(10,student.raiting());

//}