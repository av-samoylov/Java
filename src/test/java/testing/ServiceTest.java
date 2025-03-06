package testing;



import org.example.testingUi.office.DatabaseManager;
import org.example.testingUi.office.Department;
import org.example.testingUi.office.Employee;
import org.example.testingUi.office.Service;
import org.junit.jupiter.api.*;
import java.sql.*;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ServiceTest {
    private static final String TEST_DB_URL = "jdbc:h2:./testOffice";

    @BeforeAll
    void setUp() {
        DatabaseManager.setUrl(TEST_DB_URL);
        Service.createDB();
    }

    @Test
    @DisplayName("Добавление отдела")
    void testAddDepartment() {
        Department dep = new Department(4, "Sales");
        Service.addDepartment(dep);

        try (Connection con = DriverManager.getConnection(TEST_DB_URL);
             PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM Department WHERE ID = ?")) {
            stmt.setInt(1, dep.getDepartmentID());
            ResultSet rs = stmt.executeQuery();
            rs.next();
            assertEquals(1, rs.getInt(1), "Отдел должен быть добавлен");
        } catch (SQLException e) {
            fail("Ошибка проверки БД: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Добавление сотрудника")
    void testAddEmployee() {
        Employee emp = new Employee(6, "John", 2);
        Service.addEmployee(emp);

        try (Connection con = DriverManager.getConnection(TEST_DB_URL);
             PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM Employee WHERE ID = ?")) {
            stmt.setInt(1, emp.getEmployeeId());
            ResultSet rs = stmt.executeQuery();
            rs.next();
            assertEquals(1, rs.getInt(1), "Сотрудник должен быть добавлен");
        } catch (SQLException e) {
            fail("Ошибка проверки БД: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Удаление сотрудника")
    void testRemoveEmployee() {
        Employee emp = new Employee(7, "Mark", 3);
        Service.addEmployee(emp);
        Service.removeEmployee(emp);

        try (Connection con = DriverManager.getConnection(TEST_DB_URL);
             PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM Employee WHERE ID = ?")) {
            stmt.setInt(1, emp.getEmployeeId());
            ResultSet rs = stmt.executeQuery();
            rs.next();
            assertEquals(0, rs.getInt(1), "Сотрудник должен быть удалён");
        } catch (SQLException e) {
            fail("Ошибка проверки БД: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Удаление отдела удаляет всех сотрудников этого отдела")
    void testRemoveDepartment() {
        // Добавляем отдел и несколько сотрудников в нём
        Department dep = new Department(5, "Marketing");
        Service.addDepartment(dep);
        Service.addEmployee(new Employee(8, "Alice", 5));
        Service.addEmployee(new Employee(9, "Bob", 5));

        Service.removeDepartment(dep);

        try (Connection con = DriverManager.getConnection(TEST_DB_URL);
             PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM Employee WHERE DepartmentID = ?")) {
            stmt.setInt(1, dep.getDepartmentID());
            ResultSet rs = stmt.executeQuery();
            rs.next();
            assertEquals(0, rs.getInt(1), "Все сотрудники удалённого отдела должны быть удалены");
        } catch (SQLException e) {
            fail("Ошибка проверки БД: " + e.getMessage());
        }
    }

    @AfterAll
    void tearDown() {
        Service.createDB();
    }
}
