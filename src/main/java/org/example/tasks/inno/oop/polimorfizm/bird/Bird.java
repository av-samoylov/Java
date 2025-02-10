package org.example.tasks.inno.oop.polimorfizm.bird;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Bird {
    protected Random random = new Random();

    // Метод для пения, который будет переопределен в подклассах
    public abstract void sing();
}


//public static void main(String[] args) {
//    Bird sparrow = new Sparrow();
//    Bird cuckoo = new Cuckoo();
//    Bird parrot = new Parrot("Привет, я попугай!");
//
//    System.out.println("Воробей:");
//    sparrow.sing();
//
//    System.out.println("Кукушка:");
//    cuckoo.sing();
//
//    System.out.println("Попугай:");
//    parrot.sing();
//}


//задание № 8
//public static void singAllBirds(List<Bird> birds) {
//    for (Bird bird : birds) {
//        bird.sing(); // Вызываем метод sing() для каждой птицы
//    }
//}
//
//public static void main(String[] args) {
//    // Создаем список птиц
//    List<Bird> birds = new ArrayList<>();
//    birds.add(new Sparrow());
//    birds.add(new Sparrow());
//    birds.add(new Cuckoo());
//    birds.add(new Cuckoo());
//    birds.add(new Parrot("Привет, я попугай!"));
//    birds.add(new Parrot("Как дела?"));
//
//    // Вызываем метод для пения всех птиц
//    System.out.println("Пение всех птиц:");
//    singAllBirds(birds);
//}
//}




//
//
//
//Для реализации иерархии классов для птиц в Java, мы создадим корневой класс Bird (Птица) и три подкласса:
// Sparrow (Воробей), Cuckoo (Кукушка) и Parrot (Попугай). В корневом классе мы определим общие характеристики и методы,
// а в подклассах реализуем специфическое поведение для каждой птицы.
//
//Вот пример реализации:
//
//Класс Bird (Птица)
//import java.util.Random;
//
//public abstract class Bird {
//    protected Random random = new Random();
//
//    // Метод для пения, который будет переопределен в подклассах
//    public abstract void sing();
//}
//Подкласс Sparrow (Воробей)
//public class Sparrow extends Bird {
//    @Override
//    public void sing() {
//        System.out.println("чырык");
//    }
//}
//Подкласс Cuckoo (Кукушка)
//public class Cuckoo extends Bird {
//    @Override
//    public void sing() {
//        int times = random.nextInt(10) + 1; // Случайное количество от 1 до 10
//        for (int i = 0; i < times; i++) {
//            System.out.print("ку-ку ");
//        }
//        System.out.println(); // Переход на новую строку после пения
//    }
//}
//Подкласс Parrot (Попугай)
//public class Parrot extends Bird {
//    private String text;
//
//    public Parrot(String text) {
//        this.text = text;
//    }
//
//    @Override
//    public void sing() {
//        int n = random.nextInt(text.length()) + 1; // Случайное количество от 1 до длины текста
//        System.out.println(text.substring(0, n));
//    }
//}
//Пример использования
//Теперь мы можем создать экземпляры этих классов и протестировать их:
//
//public class Main {
//    public static void main(String[] args) {
//        Bird sparrow = new Sparrow();
//        Bird cuckoo = new Cuckoo();
//        Bird parrot = new Parrot("Привет, я попугай!");
//
//        System.out.println("Воробей:");
//        sparrow.sing();
//
//        System.out.println("Кукушка:");
//        cuckoo.sing();
//
//        System.out.println("Попугай:");
//        parrot.sing();
//    }
//}
//Объяснение кода:
//Класс Bird:
//
//        Абстрактный класс, который определяет общие методы и свойства для всех птиц.
//Содержит абстрактный метод sing(), который будет реализован в подклассах.
//Класс Sparrow:
//
//Реализует метод sing(), выводя строку "чырык".
//Класс Cuckoo:
//
//Реализует метод sing(), выводя "ку-ку" случайное количество раз от 1 до 10.
//Класс Parrot:
//
//        Имеет конструктор, принимающий текст, и реализует метод sing(), выводя случайное количество символов из
//        заданного текста.
//Класс Main:
//
//Создает объекты всех трех подклассов и вызывает их метод sing(), чтобы продемонстрировать их поведение.
//        Таким образом, мы создали иерархию классов, которая соответствует заданным требованиям,
//        и реализовали уникальное поведение для каждого типа птицы.