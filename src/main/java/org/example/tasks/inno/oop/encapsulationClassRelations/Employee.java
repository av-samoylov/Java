package org.example.tasks.inno.oop.encapsulationClassRelations;

public class Employee {
    private final String name;
    private  Department dep;

    public Employee(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя сотрудника не может быть пустым.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        if (this.dep != null && this.dep.getBoss() == this) {
            throw new IllegalArgumentException("Начальник отдела не может быть переведен в другой отдел.");
        }
        this.dep = dep;
    }


    @Override
    public String toString() {
        if (dep != null) {
            if (this.equals(dep.getBoss())) {
                return name + " начальник отдела " + dep.getName();
            } else {
                return name + " работает в отделе " + dep.getName() +
                        ", начальник которого " + dep.getBoss().getName();
            }
        }
        return name + " не привязан к отделу.";
    }
}


//    public static void main(String[] args) {
//        // Создаем сотрудников
//        Employee boss = new Employee("Иван Иванов");
//        Employee worker1 = new Employee("Мария Петрова");
//        Employee worker2 = new Employee("Сергей Сидоров");
//
//        // Создаем отдел с начальником
//        Department itDepartment = new Department("IT", boss);
//
//        // Привязываем сотрудников к отделу
//        worker1.setDep(itDepartment);
//        worker2.setDep(itDepartment);
//
//        // Вывод информации о сотрудниках
//        System.out.println(boss);
//        System.out.println(worker1);
//        System.out.println(worker2);
//    }







/*
public class Employee {
    private final String name; // Имя сотрудника
    private Department department; // Отдел, в котором работает сотрудник

    // Конструктор
    public Employee(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя сотрудника не может быть пустым.");
        }
        this.name = name;
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Геттер для отдела
    public Department getDepartment() {
        return department;
    }

    // Метод установки отдела
    public void setDepartment(Department department) {
        if (department == null) {
            throw new IllegalArgumentException("Отдел не может быть null.");
        }
        this.department = department;
    }

    // Метод приведения к строке
    @Override
    public String toString() {
        if (department != null) {
            if (this.equals(department.getHead())) {
                return name + " начальник отдела " + department.getName();
            } else {
                return name + " работает в отделе " + department.getName() +
                       ", начальник которого " + department.getHead().getName();
            }
        }
        return name + " не привязан к отделу.";
    }
}
      if (department != null) {
            if (department.getManager() == this) {
                // Сотрудник является начальником отдела
                return name + " начальник отдела " + department.getName();
            } else {
                // Сотрудник работает в отделе
                return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getManager().getName();
            }
        }
        return name + " не прикреплен к отделу";
    }

class Department {
    private final String name; // Название отдела
    private final Employee head; // Начальник отдела

    // Конструктор
    public Department(String name, Employee head) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название отдела не может быть пустым.");
        }
        if (head == null) {
            throw new IllegalArgumentException("Начальник отдела не может быть null.");
        }
        this.name = name;
        this.head = head;
        head.setDepartment(this); // Устанавливаем начальнику этот отдел
    }

    // Геттер для названия отдела
    public String getName() {
        return name;
    }

    // Геттер для начальника отдела
    public Employee getHead() {
        return head;
    }
}


public class Main {
    public static void main(String[] args) {
        // Создаем сотрудников
        Employee boss = new Employee("Иван Иванов");
        Employee worker1 = new Employee("Мария Петрова");
        Employee worker2 = new Employee("Сергей Сидоров");

        // Создаем отдел с начальником
        Department itDepartment = new Department("IT", boss);

        // Привязываем сотрудников к отделу
        worker1.setDepartment(itDepartment);
        worker2.setDepartment(itDepartment);

        // Вывод информации о сотрудниках
        System.out.println(boss);
        System.out.println(worker1);
        System.out.println(worker2);
    }
}
Вывод программы
Копировать код
Иван Иванов начальник отдела IT
Мария Петрова работает в отделе IT, начальник которого Иван Иванов
Сергей Сидоров работает в отделе IT, начальник которого Иван Иванов

Объяснение реализации
Инкапсуляция:
Поля name и department в классе Employee являются приватными, как и поля name и head в классе Department.
Доступ к данным осуществляется через геттеры и сеттеры, при этом проверяются корректность входных данных.

Гарантия корректной связи:
В конструкторе класса Department начальнику отдела автоматически устанавливается этот отдел через метод setDepartment.

Приведение к строке:
Метод toString в классе Employee учитывает, является ли сотрудник начальником отдела, и формирует строку в зависимости от этого.

Гибкость:
Сотрудники могут быть динамически привязаны к отделу через метод setDepartment.
Отделы всегда связаны с начальниками, которые работают в своих отделах.
 */