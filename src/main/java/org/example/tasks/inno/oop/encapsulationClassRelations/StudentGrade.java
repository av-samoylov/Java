package org.example.tasks.inno.oop.encapsulationClassRelations;

import java.util.ArrayList;
import java.util.List;

public class StudentGrade {
    private final String name;
    private final List<Integer> grades;

    public StudentGrade(String name, int... grades) {
        if (name == null || name.strip().isEmpty()) { // strip() -> А лучше даже делать name.isBlank()
            throw new IllegalArgumentException("Имя студента не может быть пустым.");
        }
        this.name = name;
        this.grades = new ArrayList<>();
        for (int grade : grades) {
            addGrade(grade);
        }
    }


    public void addGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть  в диапазоне от 2 до 5.");
        }
        grades.add(grade);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Оценки: " + grades;
    }

    public static void main(String[] args) {
        StudentGrade student = new StudentGrade("Иван ", 4, 5, 3);

        System.out.println(student);

        student.addGrade(2);
        student.addGrade(3);
        student.addGrade(4);
        student.addGrade(5);
        System.out.println(student);
        System.out.println("Все оценки: " + student.getGrades());
    }
}


/*
public class Student {
    private final String name; // Имя студента
    private final List<Integer> grades; // Список оценок

    // Конструктор
    public Student(String name, int... grades) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя студента не может быть пустым.");
        }
        this.name = name;
        this.grades = new ArrayList<>();
        for (int grade : grades) {
            addGrade(grade); // Проверяем каждую оценку через метод addGrade
        }
    }

    // Метод добавления оценки
    public void addGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5.");
        }
        grades.add(grade);
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Геттер для всех оценок
    public List<Integer> getGrades() {
        return new ArrayList<>(grades); // Возвращаем копию списка для защиты инкапсуляции
    }

    // Метод приведения к строке
    @Override
    public String toString() {
        return "Имя: " + name + " Оценки: " + grades;
    }
}
Пример использования
java
Копировать код
public class Main {
    public static void main(String[] args) {
        // Создание студента с начальными оценками
        Student student = new Student("Иван", 4, 5, 3);

        // Вывод информации о студенте
        System.out.println(student);

        // Добавление оценок
        student.addGrade(5);
        student.addGrade(2);

        // Вывод обновленной информации о студенте
        System.out.println(student);

        // Получение всех оценок
        System.out.println("Все оценки: " + student.getGrades());
    }
}
Вывод программы
less
Копировать код
Имя: Иван Оценки: [4, 5, 3]
Имя: Иван Оценки: [4, 5, 3, 5, 2]
Все оценки: [4, 5, 3, 5, 2]


Объяснение реализации
Инкапсуляция:
Поля name и grades являются приватными.
Список оценок возвращается через метод getGrades, который возвращает копию списка для предотвращения прямого изменения.

Проверка значений:
Оценки добавляются через метод addGrade, где проверяется, что они находятся в диапазоне от 2 до 5.

Гибкость:
Конструктор позволяет задать имя студента и опционально список начальных оценок.
Оценки можно добавлять в любое время с помощью метода addGrade.

Приведение к строке:
Метод toString возвращает строку с именем и текущим набором оценок.

Безопасность данных:
Возвращение копии списка оценок в getGrades защищает от внешнего изменения внутреннего состояния объекта.
 */




/*
public class Student {
    private final String name; // Имя студента
    private final List<Integer> grades; // Список оценок

    // Конструктор
    public Student(String name, int... initialGrades) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя студента не может быть пустым или состоять только из пробелов.");
        }
        this.name = name;
        this.grades = new ArrayList<>();
        for (int grade : initialGrades) {
            addGrade(grade); // Проверка и добавление оценок
        }
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Добавление оценки
    public void addGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5.");
        }
        grades.add(grade);
    }

    // Геттер для списка оценок
    public List<Integer> getGrades() {
        return new ArrayList<>(grades); // Возвращаем копию списка для защиты от изменений
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return name + ": " + grades.toString();
    }
}
Пример использования
java
Копировать код
public class Main {
    public static void main(String[] args) {
        // Создаем студента с начальными оценками
        Student student1 = new Student("Иван Иванов", 4, 5, 3);

        // Выводим информацию о студенте
        System.out.println(student1);

        // Добавляем оценки
        student1.addGrade(5);
        student1.addGrade(2);

        // Выводим обновленную информацию
        System.out.println(student1);

        // Создаем студента без начальных оценок
        Student student2 = new Student("Мария Петрова");
        System.out.println(student2);

        // Добавляем оценки студенту
        student2.addGrade(3);
        student2.addGrade(4);
        System.out.println(student2);

        // Проверяем защиту от некорректного имени
        try {
            Student student3 = new Student("    ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Проверяем защиту от некорректной оценки
        try {
            student1.addGrade(6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
Вывод программы
less
Копировать код
Иван Иванов: [4, 5, 3]
Иван Иванов: [4, 5, 3, 5, 2]
Мария Петрова: []
Мария Петрова: [3, 4]
Имя студента не может быть пустым или состоять только из пробелов.
Оценка должна быть в диапазоне от 2 до 5.
Объяснение реализации
Инкапсуляция:

Поля name и grades приватные.
Добавление оценок возможно только через метод addGrade, который проверяет корректность входных данных.
Защита от некорректных данных:

Имя студента проверяется на null, пустую строку или строку, состоящую только из пробелов.
Оценки проверяются на диапазон от 2 до 5.
Безопасность списка оценок:

Геттер getGrades возвращает копию списка оценок, чтобы защитить внутренний список от изменений.
Гибкость:

Студента можно создать с начальными оценками или без них, а затем добавлять оценки по мере необходимости.
Приведение к строке:

Метод toString предоставляет удобное текстовое представление объекта.
 */