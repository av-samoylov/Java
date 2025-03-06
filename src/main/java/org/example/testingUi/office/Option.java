package org.example.testingUi.office;
import java.sql.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


public enum Option {

            AddEmployee {
        String getText() {
            return this.ordinal() + ".Добавить сотрудника";
        }

        void action() {
            System.out.println("Введите его id:");
            int id = sc.nextInt();
            System.out.println("Введите его имя:");
            String name = sc.next();
            System.out.println("Введите id отдела:");
            int depid = sc.nextInt();
            Employee employee = new Employee(id, name, depid);
            Service.addEmployee(employee);
            try (Connection con = DriverManager.getConnection(DB_URL);
                 PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM Employee WHERE ID = ?")) {
                stmt.setInt(1, employee.getEmployeeId());
                ResultSet rs = stmt.executeQuery();
                rs.next();
                assertEquals(1, rs.getInt(1), "Сотрудник должен быть добавлен");
            } catch (SQLException e) {
                fail("Ошибка при проверке БД: " + e.getMessage());
            }

        }
    },
    DeleteEmployee {
        String getText() {
            return this.ordinal() + ".Удалить сотрудника";
        }

        void action() {
            System.out.println("Введите его id:");
            int id = sc.nextInt();
            Employee employee = new Employee(id, "", 0);
            Service.removeEmployee(employee);
            try (Connection con = DriverManager.getConnection(DB_URL);
                 PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM Employee WHERE ID = ?")) {
                stmt.setInt(1, employee.getEmployeeId());
                ResultSet rs = stmt.executeQuery();
                rs.next();
                assertEquals(0, rs.getInt(1), "Сотрудник должен быть удален");
            } catch (SQLException e) {
                fail("Ошибка при проверке БД: " + e.getMessage());
            }
        }
    },
    AddDepartment {
        String getText() {
            return this.ordinal() + ".Добавить отдел";
        }
        void action() {
            System.out.println("Введите его id:");
            int id = sc.nextInt();
            System.out.println("Введите его название:");
            String name = sc.next();
            Department department = new Department(id, name);
            Service.addDepartment(department);
            try (Connection con = DriverManager.getConnection(DB_URL);
                 PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM Department WHERE ID = ?")) {
                stmt.setInt(1, department.getDepartmentID());
                ResultSet rs = stmt.executeQuery();
                rs.next();
                assertEquals(1, rs.getInt(1), "Отдел должен быть добавлен");
            } catch (SQLException e) {
                fail("Ошибка при проверке БД: " + e.getMessage());
            }

        }
    },
    DeleteDepartment {
        String getText() {
            return this.ordinal() + ".Удалить отдел (удаляет всех сотрудников вместе с ним)";
        }
        void action() {
            try (Connection con = DatabaseManager.getConnection())  {
                con.setAutoCommit(false);
                System.out.println("Введите его id:");
                int departmentId = sc.nextInt();
                try (PreparedStatement deleteEmployees = con.prepareStatement(
                        "DELETE FROM Employee WHERE DepartmentID = ?");
                     PreparedStatement deleteDepartment = con.prepareStatement(
                             "DELETE FROM Department WHERE ID = ?")) {

                    deleteEmployees.setInt(1, departmentId);
                    deleteEmployees.executeUpdate();

                    deleteDepartment.setInt(1, departmentId);
                    deleteDepartment.executeUpdate();

                    con.commit();
                    System.out.println("Отдел и все сотрудники удалены.");
                } catch (SQLException e) {
                    con.rollback();
                    throw e;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    },
    CLEAR_DB {
        String getText() {
            return this.ordinal() + ".Сбросить базу данных";
        }

        void action() {
            Service.createDB();
        }

    },
    PRINT_DEPS {
        String getText() {
            return this.ordinal() + ".Вывести на экран все отделы";
        }

        void action() {
            try (Connection con = DatabaseManager.getConnection())  {
                PreparedStatement stm = con.prepareStatement(
                        "SELECT ID, NAME FROM Department",
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE
                );
                ResultSet rs = stm.executeQuery();
                System.out.println("------------------------------------");
                while (rs.next()) {
                    System.out.println(rs.getInt("ID") + "\t" + rs.getString("name"));
                }
                System.out.println("------------------------------------");
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    },
    PRINT_EMPLOYEES {
        String getText() {
            return this.ordinal() + ".Вывести на экран всех сотрудников";
        }

        void action() {
            try (Connection con = DatabaseManager.getConnection())  {
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("Select Employee.ID, Employee.Name," +
                        "Department.Name as DepName from Employee join Department on Employee.DepartmentID=Department.ID");
                //ResultSet rs= stm.executeQuery("Select Employee.ID, Employee.Name,Employee.DepartmentID as DepName from Employee");
                System.out.println("------------------------------------");
                ResultSetMetaData metaData = rs.getMetaData();
                while (rs.next()) {
                    System.out.println(rs.getInt("ID") + "\t" + rs.getString("NAME") + "\t" + rs.getString("DepName"));
                }
                System.out.println("------------------------------------");
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    },
    UPDATE_ANN_DEP {
        String getText() {
            return this.ordinal() + ".Обновить департамент сотрудника Ann";
        }

        void action() {
            try (Connection con = DatabaseManager.getConnection())  {
                PreparedStatement findAnn = con.prepareStatement("SELECT ID FROM Employee WHERE NAME = 'Ann'");
                ResultSet rs = findAnn.executeQuery();

                if (rs.next()) {
                    int annId = rs.getInt("ID");
                    PreparedStatement updateDep = con.prepareStatement("UPDATE Employee SET DepartmentID = 3 WHERE ID = ?");
                    updateDep.setInt(1, annId);
                    updateDep.executeUpdate();
                    System.out.println("Департамент сотрудника Ann обновлен до HR");
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    },
    CORRECT_EMPLOYEES_NAMES {
        String getText() {
            return this.ordinal() + ".Исправить имена сотрудников";
        }

        void action() {
            try (Connection con = DatabaseManager.getConnection())  {
                Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stm.executeQuery("SELECT ID, NAME FROM Employee");
                int count = 0;

                while (rs.next()) {
                    String name = rs.getString("NAME");
                    if (!name.equals(name.substring(0, 1).toUpperCase() + name.substring(1))) {
                        rs.updateString("NAME", name.substring(0, 1).toUpperCase() + name.substring(1));
                        rs.updateRow();
                        count++;
                    }
                }
                System.out.println("Исправлено имен: " + count);
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    },
    COUNT_IT_EMPLOYEES {
        String getText() {
            return this.ordinal() + ".Подсчитать количество сотрудников в IT-отделе";
        }

        void action() {
            try (Connection con = DatabaseManager.getConnection())  {
                PreparedStatement countIT = con.prepareStatement("SELECT COUNT(*) AS total FROM Employee WHERE DepartmentID = 2");
                ResultSet rs = countIT.executeQuery();
                if (rs.next()) {
                    System.out.println("Количество сотрудников в IT-отделе: " + rs.getInt("total"));
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    },
    VERIFY_DEPARTMENTS_DELETION {
        String getText() {
            return this.ordinal() + ".Проверить удаление департаментов";
        }
        void action() {
            try (Connection con = DatabaseManager.getConnection())  {
                System.out.println("Введите его id:");
                int departmentId = sc.nextInt();
                PreparedStatement checkEmployees = con.prepareStatement("SELECT COUNT(*) AS total FROM Employee WHERE DepartmentID = ?");
                checkEmployees.setInt(1, departmentId);
                ResultSet rs = checkEmployees.executeQuery();

                if (rs.next() && rs.getInt("total") == 0) {
                    System.out.println("Все сотрудники удалены вместе с отделом " + departmentId);
                } else {
                    System.out.println("Ошибка: некоторые сотрудники остались в удаленном отделе " + departmentId);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    },
    EXIT {
        String getText() {
            return this.ordinal() + ".Выход";
        }

        void action() {
            System.out.println("выход");
        }
    },
    ;

    Scanner sc = new Scanner(System.in);

    abstract String getText();

    abstract void action();

    private static final String DB_URL = "jdbc:h2:.\\Office";
}
